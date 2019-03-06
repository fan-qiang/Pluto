package com.fanqiang.sophon.engine.camel;

import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import lombok.Data;
import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jpa.JpaComponent;
import org.apache.camel.processor.ErrorHandler;
import org.apache.camel.processor.interceptor.Tracer;
import org.apache.camel.spi.ComponentCustomizer;
import org.apache.camel.spi.EventNotifier;
import org.apache.camel.spi.InterceptStrategy;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.jms.ConnectionFactory;
import java.util.List;

@Configuration
@ComponentScan("com.fanqiang.sophon")
@EnableConfigurationProperties({SophonAutoConfiguration.TracerConfigurationProperties.class})
@EnableTransactionManagement
@EntityScan({"com.fanqiang.sophon","org.apache.camel.processor.interceptor"}
)
public class SophonAutoConfiguration implements CamelContextConfiguration {

    @Autowired
    TracerConfigurationProperties tracerConfigurationProperties;

    @Autowired
    ConnectionFactory connectionFactory;

    @Autowired
    List<EventNotifier> notifierList;

    public void beforeApplicationStart(CamelContext camelContext) {
        initTracer(camelContext);
        initJmsComponent(camelContext);
        notifierList.forEach(camelContext.getManagementStrategy()::addEventNotifier);
    }

    @Bean
    StringEncoder stringEncoder(){
        return new StringEncoder();
    }

    @Bean
    StringDecoder stringDecoder(){
        return new StringDecoder();
    }

    private void initJmsComponent(CamelContext camelContext) {
        //
        JmsComponent jmsComponent = (JmsComponent) camelContext.getComponent("jms");
        jmsComponent.setConnectionFactory(connectionFactory);
    }

    private void initTracer(CamelContext camelContext) {
        InterceptStrategy interceptStrategy = camelContext.getDefaultTracer();
        if(interceptStrategy instanceof Tracer){
            Tracer tracer = (Tracer) interceptStrategy;
            tracer.setUseJpa(tracerConfigurationProperties.isUseJpa());
            tracer.setDestinationUri(tracerConfigurationProperties.getDestination());
            tracer.setLogStackTrace(tracerConfigurationProperties.isLogStackTrace());
            tracer.setLogLevel(tracerConfigurationProperties.getLoggingLevel());
            tracer.setTraceInterceptors(tracerConfigurationProperties.isTraceInterceptors());
            tracer.setTraceOutExchanges(tracerConfigurationProperties.isTraceOutExchanges());
        }
    }

    @Bean
    ComponentCustomizer<JpaComponent> jpaComponentComponentCustomizer(){
        return jpa->{
            
        };
    }


    public void afterApplicationStart(CamelContext camelContext) {
        //noop
    }

    @ConfigurationProperties(
            prefix = "camel.springboot.tracer"
    )
    @Data
    public class TracerConfigurationProperties {
        private boolean useJpa;
        private String destination = "jpa://org.apache.camel.processor.interceptor.JpaTraceEventMessage?persistenceUnit=tracer";
        private boolean logStackTrace = true;
        private LoggingLevel loggingLevel = LoggingLevel.INFO;
        private boolean traceInterceptors = false;
        private boolean traceOutExchanges = true;
        private String loggerName;
    }
}

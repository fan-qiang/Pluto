package com.fanqiang.sophon.engine.camel.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.jmx.JmxReporter;
import org.apache.camel.CamelContext;
import org.apache.camel.component.metrics.messagehistory.MetricsMessageHistoryFactory;
import org.apache.camel.component.metrics.routepolicy.MetricsRoutePolicyFactory;
import org.apache.camel.component.metrics.springboot.MetricsComponentAutoConfiguration;
import org.apache.camel.spi.MessageHistoryFactory;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@AutoConfigureAfter({CamelAutoConfiguration.class,MetricsComponentAutoConfiguration.class})
public class MetricsAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(MetricRegistry.class)
    public  MetricRegistry metricRegistry(){
        return new MetricRegistry();
    }

    @Bean(destroyMethod = "stop")
    public JmxReporter jmxReporter(MetricRegistry metricRegistry){
        JmxReporter jmxReporter = JmxReporter.forRegistry(metricRegistry).build();
        jmxReporter.start();
        return jmxReporter;
    }


    @Bean
    public MetricsRoutePolicyFactory metricsRoutePolicyFactory(CamelContext camelContext){
        MetricsRoutePolicyFactory metricsRoutePolicyFactory = new MetricsRoutePolicyFactory();
        camelContext.addRoutePolicyFactory(metricsRoutePolicyFactory);
        return metricsRoutePolicyFactory;
    }


    @Bean
    @DependsOn("jmxReporter")
    public MessageHistoryFactory metricsMessageHistoryFactory (CamelContext camelContext,MetricRegistry metricRegistry){
        MetricsMessageHistoryFactory metricsMessageHistoryFactory = new MetricsMessageHistoryFactory();
        metricsMessageHistoryFactory.setMetricsRegistry(metricRegistry);
        camelContext.setMessageHistoryFactory(metricsMessageHistoryFactory);
        return metricsMessageHistoryFactory;
    }

}

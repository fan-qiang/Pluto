package com.fanqiang.sophon;

import com.fanqiang.sophon.domain.*;
import com.fanqiang.sophon.engine.camel.SophonAutoConfiguration;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.converter.jaxb.springboot.JaxbDataFormatAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.fanqiang.sophon")
@Configuration
@EnableTransactionManagement
@AutoConfigureAfter({SophonAutoConfiguration.class, JaxbDataFormatAutoConfiguration.class})
public class SophonAppConfiguration {

    @Bean
    JaxbDataFormat bondJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.bond");
        return jaxb;
    }

    @Bean
    JaxbDataFormat forexFWDJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.forexFWD");
        return jaxb;
    }

    @Bean
    JaxbDataFormat fxoptJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.fxOpt");
        return jaxb;
    }

    @Bean
    JaxbDataFormat fxSpotJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.fxSpot");
        return jaxb;
    }

    @Bean
    JaxbDataFormat fxSwapJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.fxSwap");
        return jaxb;
    }

    @Bean
    JaxbDataFormat mmJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.mm");
        return jaxb;
    }

    @Bean
    JaxbDataFormat swapJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.swap");
        return jaxb;
    }

    @Bean
    JaxbDataFormat repoJaxb(){
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.fanqiang.sophon.jaxb.repo");
        return jaxb;
    }



    @Bean
    RouteBuilder camelRouteBuilder(){
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:{{spdb.input}}?move={{spdb.output}}")
                        .choice()
                            .when(xpath("/SUMMIT/COMMON/Type = 'BOND'"))
                                .unmarshal("bondJaxb").convertBodyTo(Bond.class)
                                .to("jpa:com.fanqiang.sophon.domain.Bond")
                                //.to("jms:bond")
                            .when(xpath("/SUMMIT/COMMON/Type = 'FXFWD'"))
                                .unmarshal("forexFWDJaxb").convertBodyTo(ForexFWD.class)
                                .to("jpa:com.fanqiang.sophon.domain.ForexFWD")
                                //.to("jms:fxfwd")
                            .when(xpath("/SUMMIT/COMMON/Type = 'FXOPT'"))
                                .unmarshal("fxoptJaxb").convertBodyTo(FxOpt.class)
                                .to("jpa:com.fanqiang.sophon.domain.FxOpt")
                                //.to("jms:fxopt")
                            .when(xpath("/SUMMIT/COMMON/Type = 'FXSPOT'"))
                                .unmarshal("fxSpotJaxb").convertBodyTo(FxSPOT.class)
                                .to("jpa:com.fanqiang.sophon.domain.FxSPOT")
                                //.to("jms:fxspot")
                            .when(xpath("/SUMMIT/COMMON/Type = 'FXSWAP'"))
                                .unmarshal("fxSwapJaxb").convertBodyTo(FxSwap.class)
                                .to("jpa:com.fanqiang.sophon.domain.FxSwap")
                                //.to("jms:fxswap")
                            .when(xpath("/SUMMIT/COMMON/Type = 'MM'"))
                                .unmarshal("mmJaxb").convertBodyTo(MM.class)
                                .to("jpa:com.fanqiang.sophon.domain.MM")
                                //.to("jms:mm")
                            .when(xpath("/SUMMIT/COMMON/Type = 'SWAP'"))
                                .unmarshal("swapJaxb").convertBodyTo(Swap.class)
                                .to("jpa:com.fanqiang.sophon.domain.Swap")
                                //.to("jms:swap")
                            .when(xpath("/SUMMIT/COMMON/Type = 'REPO'"))
                                .unmarshal("repoJaxb").convertBodyTo(Repo.class)
                                .to("jpa:com.fanqiang.sophon.domain.Repo").endChoice().end();
                                //.to("jms:repo")
            }
        };
    }
}

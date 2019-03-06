package com.fanqiang.sophon.engine.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http4.HttpMethods;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.http.HttpHeaders;
import org.springframework.context.annotation.Bean;


public class SophonRouterTest  extends CamelTestSupport {

    public RouteBuilder createRouteBuilder() throws Exception{
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                errorHandler(defaultErrorHandler());
                //user zookeeper
                from("zookeeper-master:myGroup:timer:foo?fixedRate=true&delay=0&period=5000").routeId("simple")
                        .process(exchange -> {
                            exchange.getOut().setHeader("CamelHttpMethod", HttpMethods.POST);
                            exchange.getOut().setHeader(HttpHeaders.USER_AGENT, constant("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"));
                        }).id("processHttpHeard").description("处理http请求头")
//            .setHeader("CamelHttpMethod", constant("POST"))
//            .setHeader(HttpHeaders.USER_AGENT, constant("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"))
                        //.to("https4:www.sipspf.org.cn/sipspf/web/pub/membercard/sendinfo?membid=03867543&personid=130481198812280649")
                        .id("queryMemberCard").description("http请求查询用户数据")
                        .unmarshal()
                        .json(JsonLibrary.Fastjson)
                        .id("unmarshalToFastjson").description("将返回的结果使用fastjson转换")
                        .to("log:out").id("printToLog");
            }
        };


        //from("timer:foo?fixedRate=true&delay=0&period=1000").bean(OrderService.class,"order").to("log:out").to("jms:topic:xmlOrders");
//
//        from("jms:validate").bean(OrderService.class,"validate");
//
//        from("jms:incomingOrders").log("We got incoming jms containing: ${body}").inOut("jms:validate").log("jms validate ${body}");
//
//        from("imap://imap.163.com?port=143").convertBodyTo(String.class).to("log:out");
    }

    @Bean
    String myBean() {
        return "I'm Spring bean!";
    }

}

package com.fanqiang.sophon.engine.camel.splitter;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitterABCTest extends CamelTestSupport {

    @Test
    public void testSplitABC() throws Exception{
        MockEndpoint mockEndpoint = getMockEndpoint("mock:split");
        mockEndpoint.expectedBodiesReceived("A","B","C");
        List<String> body = new ArrayList<>();
        body.add("A");
        body.add("B");
        body.add("C");
        template.sendBody("direct:start",body);
        mockEndpoint.assertIsSatisfied();
    }

    public RouteBuilder createRouteBuilder() throws Exception{
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").log("camel receive message ${body}").split(body())
                        .log("Split line ${body}")
                        .to("mock:split");
            }
        };
    }
}

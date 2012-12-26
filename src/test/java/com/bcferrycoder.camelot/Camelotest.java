package com.bcferrycoder.camelot;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;

/**
 * Created by IntelliJ IDEA.
 * User: stackato
 * Date: 12/24/12
 * Time: 11:38 AM
 * Copyright 2012 John Wetherill
 */
public class Camelotest extends CamelTestSupport {
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {

            }
        };
    }

}

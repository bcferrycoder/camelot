package com.bcferrycoder.camelot;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Map;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: stackato
 * Date: 12/21/12
 * Time: 3:40 PM
 * Copyright 2012 John Wetherill
 */
public class ShowEnv implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {


        StringBuilder sb = new StringBuilder();
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            sb.append(key + ": " + env.get(key)  + "\n");
        }

        exchange.getIn().setBody(sb.toString());
        exchange.getOut().setBody(sb.toString());
    }
}


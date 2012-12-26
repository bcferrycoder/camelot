package com.bcferrycoder.camelot;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created with IntelliJ IDEA.
 * User: stackato
 * Date: 11/22/12
 * Time: 2:04 PM
 *
 */
public class Validator implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Validator start: " + Stopwatch.elapsedTime(exchange));

        String appSelector = (String) exchange.getIn().getHeader("camelot");
        if (appSelector != null) {
            System.out.println("app:" + appSelector);
        } else {
            exchange.getIn().setHeader("camelot", "unknown");
        }
        System.out.println("Validator end: " + Stopwatch.elapsedTime(exchange));
    }
}

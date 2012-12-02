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
public class PollvaultInjector implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String lat = (String) exchange.getIn().getHeader("x");
        String lng = (String) exchange.getIn().getHeader("y");
        String rainfall = (String) exchange.getIn().getHeader("rain");
        // { "timestamp":"yyyy-mm-dd.hh:mm:ss",  "location":[23.74, 43.1], "rainfall":36 }

        exchange.getIn().setBody("{\"location\":[23.74, 43.1], \"rainfall\":36}");
    }
}

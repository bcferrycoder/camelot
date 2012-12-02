package com.bcferrycoder.camelot;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: stackato
 * Date: 11/22/12
 * Time: 2:04 PM
 *
 */
public class Guido implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setHeader("id", UUID.randomUUID());
    }
}

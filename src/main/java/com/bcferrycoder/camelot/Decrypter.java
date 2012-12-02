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
public class Decrypter implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody("{\"movielist\":\"raiders\"}");
        exchange.getOut().setBody("{\"movielist\":\"raiders\"}");
    }
}

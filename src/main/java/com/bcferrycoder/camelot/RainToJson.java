package com.bcferrycoder.camelot;

import com.google.gson.Gson;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: stackato
 * Date: 11/22/12
 * Time: 2:04 PM
 *
 */
public class RainToJson implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("RainToJson start: " + Stopwatch.elapsedTime(exchange));
        String lat = (String) exchange.getIn().getHeader("x");
        String lng = (String) exchange.getIn().getHeader("y");
        String rainfall = (String) exchange.getIn().getHeader("rainfall");
        // { "timestamp":"yyyy-mm-dd.hh:mm:ss",  "location":[23.74, 43.1], "rainfall":36 }


        Rainfall rf = new Rainfall(Double.parseDouble(lat), Double.parseDouble(lng), Double.parseDouble(rainfall));

        Gson gson = new Gson();
        String json = gson.toJson(rf);

        exchange.getIn().setBody(json);

        System.out.println("RainToJson end: " + Stopwatch.elapsedTime(exchange));
    }
}

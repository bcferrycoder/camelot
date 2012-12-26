package com.bcferrycoder.camelot;

import org.apache.camel.Exchange;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: stackato
 * Date: 12/2/12
 * Time: 11:00 PM
 * Copyright 2012 Glen Canyon Corporation
 */
public class Stopwatch {

    public static String CAMELOT_DATE_FORMAT = "yyyy-MM-dd.HH:mm:ss";

    // return elapsed time since launchtime (as obtained from header)
    public static long elapsedTime(Exchange exchange) {
        long now = System.nanoTime() / 1000;
        String launchtime = (String)exchange.getIn().getHeader("launchtime");
        launchtime = launchtime == null ? "0" : launchtime;

        return now - Long.parseLong(launchtime);
    }

    // return string representation of current time
    public static String stamp() {
        return stamp(new Date());
    }

    public static String stamp(Date d) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CAMELOT_DATE_FORMAT);
        return simpleDateFormat.format(d);
    }
}

package com.example.bggpricenotifier.consumer.boardgame.model.parser;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser extends XmlAdapter<String, Date> {

    // example received date from BGG API - Tue, 15 Aug 2017 18:54:11 +0000
    private static final String CUSTOM_FORMAT_STRING = "EEE, dd MMM yyyy HH:mm:ss Z";

    @Override
    public String marshal(Date v) {
        return new SimpleDateFormat(CUSTOM_FORMAT_STRING).format(v);
    }

    @Override
    public Date unmarshal(String v) throws ParseException {
        return new SimpleDateFormat(CUSTOM_FORMAT_STRING).parse(v);
    }
}

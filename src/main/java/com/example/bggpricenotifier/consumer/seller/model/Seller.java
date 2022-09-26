package com.example.bggpricenotifier.consumer.seller.model;

import javax.xml.bind.annotation.XmlElement;

public class Seller {

    @XmlElement(name = "shiplocationraw")
    private String shipLocation;

    @XmlElement(name = "itemlocation")
    private String sellerLocation;

}

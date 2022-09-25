package com.example.bggpricenotifier.consumer.boardgame.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "boardgame")
@XmlAccessorType(XmlAccessType.FIELD)
public class MarketplaceListingLink {

    @XmlAttribute(name = "href")
    private String offerUrl;

    /**
     * TODO All properties contain title="marketlisting". Most likely going to omit this field.
     */
    @XmlAttribute(name = "title")
    private String title;

}

package com.example.bggpricenotifier.consumer.boardgame;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "boardgame")
@XmlAccessorType()
public class MarketplaceListingLink {

    @XmlAttribute(name = "href")
    private String offerUrl;

    /**
     * TODO All properties contain title="marketlisting". Most likely going to omit this field.
     */
    @XmlAttribute(name = "title")
    private String title;

}

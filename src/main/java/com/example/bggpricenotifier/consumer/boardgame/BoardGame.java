package com.example.bggpricenotifier.consumer.boardgame;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "boardgame")
@XmlAccessorType()
public class BoardGame {

    @XmlAttribute(name = "objectid")
    private Long objectID;

    @XmlElement(name = "marketplacelistings")
    private List<MarketplaceListing> marketplaceListings;

    @XmlElement
    private String value;

}

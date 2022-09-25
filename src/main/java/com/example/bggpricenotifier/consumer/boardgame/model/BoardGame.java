package com.example.bggpricenotifier.consumer.boardgame.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "boardgames")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardGame {

    @XmlAttribute(name = "objectid")
    private Long objectID;

    @XmlElement(name = "marketplacelistings")
    private List<MarketplaceListing> marketplaceListings;
}

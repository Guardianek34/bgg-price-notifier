package com.example.bggpricenotifier.consumer.boardgame.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "boardgame")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardGame {

    @XmlAttribute(name = "objectid")
    private Long objectID;

    @XmlElementWrapper(name = "marketplacelistings")
    @XmlElement(name = "listing")
    private List<MarketplaceListing> marketplaceListings;
}

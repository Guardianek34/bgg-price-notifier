package com.example.bggpricenotifier.consumer.boardgame.model.boardgame;

import com.example.bggpricenotifier.consumer.boardgame.model.marketplace.MarketplaceListing;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardGame {

    @XmlAttribute(name = "id")
    private Long objectID;

    @XmlElementWrapper(
        name = "marketplacelistings",
        required = false
    )
    @XmlElement(name = "listing")
    private List<MarketplaceListing> marketplaceListings;

    @XmlElementWrapper(
        name = "versions",
        required = false
    )
    @XmlElement(name = "item")
    private List<BoardGameVersion> gameVersions;

}

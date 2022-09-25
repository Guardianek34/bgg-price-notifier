package com.example.bggpricenotifier.consumer.boardgame;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;


@Getter
@Setter
@XmlRootElement(name = "listing")
@XmlAccessorType()
public class MarketplaceListing {

    @XmlElement(name = "listdate")
    private LocalDateTime listDate;

    @XmlElement(name = "price")
    private Price price;

    @XmlElement(name = "condition")
    private GameCondition condition;

    @XmlElement(name = "notes")
    private String notes;

    @XmlElement(name = "link")
    private MarketplaceListingLink link;
}

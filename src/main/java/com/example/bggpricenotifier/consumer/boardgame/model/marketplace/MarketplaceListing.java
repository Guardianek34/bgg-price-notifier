package com.example.bggpricenotifier.consumer.boardgame.model.marketplace;

import com.example.bggpricenotifier.consumer.boardgame.model.parser.LocalDateTimeAdapter;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;


@Getter
@Setter
@XmlRootElement(name = "listing")
@XmlAccessorType(XmlAccessType.FIELD)
public class MarketplaceListing {

    @XmlElement(name = "listdate")
    private ListDate listDate;

    @XmlElement(name = "price")
    private Price price;

    @XmlElement(name = "condition")
    private GameCondition condition;

    @XmlElement(name = "notes")
    private Notes notes;

    @XmlElement(name = "link")
    private MarketplaceListingLink offer;
}

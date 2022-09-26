package com.example.bggpricenotifier.consumer.boardgame.model.marketplace;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlRootElement(name = "price")
@XmlAccessorType(XmlAccessType.FIELD)
public class Price {

    @XmlAttribute(name = "currency")
    private String currency;

    @XmlAttribute(name = "value")
    private Double price;
}

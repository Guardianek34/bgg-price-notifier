package com.example.bggpricenotifier.consumer.boardgame.model.marketplace;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "notes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Notes {

    @XmlAttribute(name = "value")
    private String description;
}

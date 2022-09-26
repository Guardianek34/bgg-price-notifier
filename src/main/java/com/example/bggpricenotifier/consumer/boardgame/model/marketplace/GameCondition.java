package com.example.bggpricenotifier.consumer.boardgame.model.marketplace;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;


@Setter
@Getter
@XmlRootElement(name = "condition")
@XmlAccessorType(XmlAccessType.FIELD)
public class GameCondition {

    @XmlAttribute(name = "value")
    private String type;

}

package com.example.bggpricenotifier.consumer.boardgame.model.boardgame;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardGames {

    @XmlAttribute(name = "termsofuse")
    private String termsOfUse;

    @XmlElement(name = "item")
    private BoardGame boardGame;
}

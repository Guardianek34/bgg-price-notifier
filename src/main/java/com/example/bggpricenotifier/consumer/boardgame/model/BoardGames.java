package com.example.bggpricenotifier.consumer.boardgame.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlRootElement(name = "boardgames")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardGames {

    @XmlAttribute(name = "termsofuse")
    private String termsOfUse;

    @XmlElement(name = "boardgame")
    private BoardGame boardGame;
}

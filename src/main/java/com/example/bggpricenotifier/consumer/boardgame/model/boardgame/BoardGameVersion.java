package com.example.bggpricenotifier.consumer.boardgame.model.boardgame;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardGameVersion {

    @XmlAttribute(name = "id")
    private Long versionID;

    @XmlElement(name = "link")
    private Language language;
}

package com.example.bggpricenotifier.consumer.boardgame.model.boardgame;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "link")
@XmlAccessorType(XmlAccessType.FIELD)
public class Language {

    @XmlAttribute(name = "id")
    private Long id;

    @XmlAttribute(name = "type")
    private String type;

    @XmlAttribute(name = "value")
    private String languageName;

}

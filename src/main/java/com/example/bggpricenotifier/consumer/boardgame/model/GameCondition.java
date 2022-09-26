package com.example.bggpricenotifier.consumer.boardgame.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(String.class)
@Getter
public enum GameCondition {
    @XmlEnumValue("new") NEW,
    @XmlEnumValue("likenew") LIKE_NEW,
    @XmlEnumValue("verygood") VERY_GOOD,
    @XmlEnumValue("good") GOOD,
    @XmlEnumValue("acceptable") ACCEPTABLE
}

package com.example.bggpricenotifier.consumer.usercollection;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserData {

    @XmlAttribute(name = "id")
    private Long Id;


}

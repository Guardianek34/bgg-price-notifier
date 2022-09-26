package com.example.bggpricenotifier.consumer.boardgame.model.marketplace;

import com.example.bggpricenotifier.consumer.boardgame.model.parser.LocalDateTimeAdapter;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@Getter
@Setter
@XmlRootElement(name = "listdate")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListDate {

    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime date;
}

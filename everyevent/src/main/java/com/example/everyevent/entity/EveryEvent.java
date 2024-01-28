package com.example.everyevent.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@Document(collection="Events")

public class EveryEvent {
    private String name;
    private String location;
    private String country;
    private String continent;
    private Double distance;
    private Date date;
    private String swim;
    private String bike;
    private String run;
    private Integer avg_temp_c;
    private String company;
    }


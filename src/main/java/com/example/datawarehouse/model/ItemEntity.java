package com.example.datawarehouse.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter

@Table(name= "ITEM")
public class ItemEntity {
    @Id
    @Column(name="itemID")
    @JsonProperty("itemID")
    private long itemID;

    @Column(name="itemName")
    @JsonProperty("itemName")
    private String itemName;

    @Column(name="itemDesc")
    @JsonProperty("itemDesc")
    private String itemDesc;


}

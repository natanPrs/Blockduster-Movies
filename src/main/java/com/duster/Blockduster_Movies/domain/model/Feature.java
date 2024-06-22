package com.duster.Blockduster_Movies.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.example.dslist.dto;

import com.example.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
    @Id // Use Id as PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generate automated values
    private Long id;
    private String title;
    @Column(name = "game_year") // year is a reserved word in SQL. This configuration changes the name in DB
    private Integer year;
    private String imgUrl;
    @Column(columnDefinition = "TEXT") // Configuration to use more than 255 char
    private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}

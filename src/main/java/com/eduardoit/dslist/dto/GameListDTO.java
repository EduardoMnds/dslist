package com.eduardoit.dslist.dto;

import com.eduardoit.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {

    }
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

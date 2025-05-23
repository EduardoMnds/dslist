package com.eduardoit.dslist.controller;

import com.eduardoit.dslist.dto.GameDTO;
import com.eduardoit.dslist.dto.GameMinDTO;
import com.eduardoit.dslist.entities.Game;
import com.eduardoit.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }

}

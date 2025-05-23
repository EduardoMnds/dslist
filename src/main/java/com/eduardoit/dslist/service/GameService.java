package com.eduardoit.dslist.service;

import com.eduardoit.dslist.dto.GameDTO;
import com.eduardoit.dslist.dto.GameMinDTO;
import com.eduardoit.dslist.entities.Game;
import com.eduardoit.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameMinDTO(game)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

}

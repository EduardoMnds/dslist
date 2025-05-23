package com.eduardoit.dslist.service;

import com.eduardoit.dslist.dto.GameListDTO;
import com.eduardoit.dslist.entities.GameList;
import com.eduardoit.dslist.repository.GameListRepository;
import com.eduardoit.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(game -> new GameListDTO(game)).toList();
    }

}

package com.example.gameStore.controller;
import com.example.gameStore.game.Game;
import com.example.gameStore.game.GameRepository;
import com.example.gameStore.game.GameRequestDTO;
import com.example.gameStore.game.GameResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("game")
public class GameController {
    @Autowired
    private GameRepository repository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveGame(@RequestBody GameRequestDTO data){
        Game gameData = new Game(data);
        repository.save(gameData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<GameResponseDTO> getAll(){

        List<GameResponseDTO> gameList = repository.findAll().stream().map(GameResponseDTO::new).toList();
        return gameList;
    }
}

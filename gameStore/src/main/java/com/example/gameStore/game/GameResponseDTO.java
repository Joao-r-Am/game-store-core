package com.example.gameStore.game;

public record GameResponseDTO(Long id, String title, String image, Float price) {
    public GameResponseDTO(Game game){
        this(game.getId(), game.getTitle(), game.getImage(), game.getPrice());
    }
}

package com.example.gameStore.game;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "game")
@Entity(name = "game")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Game {
    @Id
    //@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Float price;

    public Game(GameRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}

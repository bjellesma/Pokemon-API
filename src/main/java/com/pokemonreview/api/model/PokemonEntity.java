package com.pokemonreview.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok will automatically genereate getters, setters, and constructors
@Data
@AllArgsConstructor
@NoArgsConstructor
//entity means that it is an object within the database
@Entity
public class PokemonEntity {
//    id means that id is going to be the primary key and generated value means that it will be auto incremented
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
}

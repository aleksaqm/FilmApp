package com.example.FilmApp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "sv_24_2021")
@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String genre;
    @Column
    private Long year;
}

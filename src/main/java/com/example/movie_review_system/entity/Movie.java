package com.example.movie_review_system.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="movies")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private String releaseYear;

    private String director;
    private String description;
    private String posterUrl;

    @OneToMany(mappedBy = "movie", cascade= CascadeType.ALL, orphanRemoval= true)
    private List<Review> reviews= new ArrayList<>();

    private LocalDateTime createdAt= LocalDateTime.now();

    public Double getAverageRating(Long id) {
        return null;
    }
}

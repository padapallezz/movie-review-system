package com.example.movie_review_system.repository;

import com.example.movie_review_system.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByReleaseYear(Integer year);
    List<Movie> findByTitleContainingIgnoreCase(String title);

    @Query("SELECT m FROM Movie m WHERE m.title LIKE %:keyword% OR m.releaseYear = :year")
    List<Movie> searchMovies(String keyword, Integer year);
}

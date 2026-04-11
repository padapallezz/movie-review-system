package com.example.movie_review_system.repository;

import com.example.movie_review_system.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByMovieMovieId(Long movieId);

    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.movie.movieId = :movieId")
    Double getAverageRating(@Param("movieId") Long movieId);

    boolean existsByUserUserIdAndMovieMovieId(Long userId, Long movieId);
}

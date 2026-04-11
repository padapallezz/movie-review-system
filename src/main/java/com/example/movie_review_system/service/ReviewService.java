package com.example.movie_review_system.service;

import com.example.movie_review_system.entity.Movie;
import com.example.movie_review_system.entity.Review;
import com.example.movie_review_system.entity.User;
import com.example.movie_review_system.repository.MovieRepository;
import com.example.movie_review_system.repository.ReviewRepository;
import com.example.movie_review_system.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Layer for review
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    public ReviewService(ReviewRepository reviewRepository,
                         MovieRepository movieRepository,
                         UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.movieRepository = movieRepository;
        this.userRepository = userRepository;
    }

    //get reviews for specific movie
    @Transactional(readOnly = true)
    public List<Review> getReviewsByMovieId(Long movieId) {
        return reviewRepository.findByMovieMovieId(movieId);
    }

    //Check if user has already reviewed
    @Transactional(readOnly = true)
    public boolean hasUserReviewedMovie(Long userId, Long movieId) {
        return reviewRepository.existsByUserUserIdAndMovieMovieId(userId, movieId);
    }

    //Get average rating for movie
    public Double getAverageRating(Long movieId) {
        return reviewRepository.getAverageRating(movieId);
    }

   //Delete review
    @Transactional
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
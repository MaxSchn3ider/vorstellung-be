package de.arvato.Max_Schneider.ratings;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService
{
    RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> getall()
    {
        return (List<Rating>) ratingRepository.findAll();
    }

    public Rating save(Rating rating)
    {
        return ratingRepository.save(rating);
    }
}

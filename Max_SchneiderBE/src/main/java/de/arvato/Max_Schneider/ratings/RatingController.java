package de.arvato.Max_Schneider.ratings;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RatingController
{
    RatingService ratingService;

    public RatingController(RatingService ratingService) {

        this.ratingService = ratingService;
    }

    @GetMapping("/ratings/getRatings")
    public ResponseEntity<List<Rating>> getRatings()
    {
        return ResponseEntity.ok(ratingService.getall());
    }

    @PostMapping ("/ratings/saveRating")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating)
    {
        return ResponseEntity.ok(ratingService.save(rating));
    }
}

package de.arvato.Max_Schneider.ratings;

public class Rating {
    public int id;
    public String username;
    public int rating;
    public String description;

    public Rating(int id, String username, int rating, String description) {
        this.id = id;
        this.username = username;
        this.rating = rating;
        this.description = description;
    }
}
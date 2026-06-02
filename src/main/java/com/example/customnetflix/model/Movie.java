package com.example.customnetflix.model;

public class Movie {

    private final String title;
    private final String imageUrl;
    private final String description;
    private final int year;
    private final String rating;
    private final String duration;

    public Movie(String title, String imageUrl, String description, int year, String rating, String duration) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    public String getDuration() {
        return duration;
    }
}

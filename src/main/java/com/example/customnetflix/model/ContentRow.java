package com.example.customnetflix.model;

import java.util.List;

public class ContentRow {

    private final String category;
    private final List<Movie> movies;

    public ContentRow(String category, List<Movie> movies) {
        this.category = category;
        this.movies = movies;
    }

    public String getCategory() {
        return category;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}

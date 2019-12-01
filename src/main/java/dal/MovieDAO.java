package dal;

import entity.Movie;

import java.util.List;

public interface MovieDAO {
    Movie findByID();

    void create(Movie movie);

    List<Movie> findAll();
}

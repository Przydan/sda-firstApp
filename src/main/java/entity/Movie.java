package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "year")
    private int year;
    @Column(name = "duration", precision = 2)
    private double duration;
    @Column(name = "description")
    private String description;

    public Movie( String title, int year, double duration, String description) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.description = description;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                year == movie.year &&
                Double.compare(movie.duration, duration) == 0 &&
                Objects.equals(title, movie.title) &&
                Objects.equals(description, movie.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, duration, description);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }
}


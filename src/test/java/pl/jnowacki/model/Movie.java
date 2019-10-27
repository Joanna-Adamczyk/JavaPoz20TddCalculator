package pl.jnowacki.model;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    private LocalDate premiereDate;
    private String title;
    private MovieGenre genre;

    private Director director;
    private List<Award> awards;

    public Movie(LocalDate premiereDate, String title, MovieGenre genre, Director director, List<Award> awards) {
        this.premiereDate = premiereDate;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.awards = awards;
    }

    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDate premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}

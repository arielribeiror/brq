package br.com.fiap.brq.model;

import javax.persistence.*;

@Entity
@Table(name = "genres")
@SequenceGenerator(name = "genre", sequenceName = "genre_sq", allocationSize = 1)
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "income")
    private Integer id;

    private String genre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

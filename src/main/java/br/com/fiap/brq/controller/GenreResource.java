package br.com.fiap.brq.controller;

import br.com.fiap.brq.model.Genre;
import br.com.fiap.brq.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genre")
public class GenreResource {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public List<Genre> listAll() {
        return genreRepository.findAll();
    }

    @GetMapping("{id}")
    public Genre findById(@PathVariable Integer id) {
        return (Genre) genreRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Genre create(@RequestBody Genre genre) {
        return (Genre) genreRepository.save(genre);
    }

    @PutMapping("{id}")
    public Genre update(@RequestBody Genre genre, @PathVariable Integer id) {
        genre.setId(id);
        return (Genre) genreRepository.save(genre);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        genreRepository.deleteById(id);
    }
}

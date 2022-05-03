package br.com.fiap.brq.controller;

import br.com.fiap.brq.model.Skill;
import br.com.fiap.brq.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skill")
public class SkillResource {
    @Autowired
    private SkillRepository skillRepository;

    @GetMapping
    public List<Skill> listAll() {
        return skillRepository.findAll();
    }

    @GetMapping("{id}")
    public Skill findById(@PathVariable Integer id) {
        return (Skill) skillRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return (Skill) skillRepository.save(skill);
    }

    @PutMapping("{id}")
    public Skill update(@RequestBody Skill skill, @PathVariable Integer id) {
        skill.setId(id);
        return (Skill) skillRepository.save(skill);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        skillRepository.deleteById(id);
    }



}

package br.com.fiap.brq.controller;

import br.com.fiap.brq.model.SkillType;
import br.com.fiap.brq.repository.SkillTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skill-type")
public class SkillTypeResource {
    @Autowired
    private SkillTypeRepository skillTypeRepository;

    @GetMapping
    public List<SkillType> listAll() {
        return skillTypeRepository.findAll();
    }

    @GetMapping("{id}")
    public SkillType findById(@PathVariable Integer id) {
        return (SkillType) skillTypeRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public SkillType create(@RequestBody SkillType skillType) {
        return (SkillType) skillTypeRepository.save(skillType);
    }

    @PutMapping("{id}")
    public SkillType update(@RequestBody SkillType skillType, @PathVariable Integer id) {
        skillType.setId(id);
        return (SkillType) skillTypeRepository.save(skillType);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        skillTypeRepository.deleteById(id);
    }
}

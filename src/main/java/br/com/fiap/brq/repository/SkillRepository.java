package br.com.fiap.brq.repository;

import br.com.fiap.brq.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
    List<Skill> findBySkill(String skill);
}
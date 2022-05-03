package br.com.fiap.brq.model;

import javax.persistence.*;

@Entity
@Table(name = "skills")
@SequenceGenerator(name = "skill", sequenceName = "skill_sq", allocationSize = 1)
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "income")
    private Integer id;

    private String skill;

    @ManyToOne
    @JoinColumn(name = "skill_type")
    private SkillType skillType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }
}

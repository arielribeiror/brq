package br.com.fiap.brq.model;

import javax.persistence.*;

@Entity
@Table(name = "skill_types")
@SequenceGenerator(name = "skill_type", sequenceName = "skill_type_sq", allocationSize = 1)
public class SkillType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "income")
    private Integer id;

    private String skillType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }
}

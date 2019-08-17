package com.enoch.openschool.repository;

import com.enoch.openschool.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ashish on 13/5/17.
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
}

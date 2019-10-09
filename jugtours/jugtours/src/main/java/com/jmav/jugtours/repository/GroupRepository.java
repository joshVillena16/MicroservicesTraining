package com.jmav.jugtours.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jmav.jugtours.model.Group;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long>{
	Group findByName(String name);
}

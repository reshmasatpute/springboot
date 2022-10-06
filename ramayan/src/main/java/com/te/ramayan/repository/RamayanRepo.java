package com.te.ramayan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.ramayan.entity.Heros;

public interface RamayanRepo extends JpaRepository<Heros, Integer>{
 
	 public Optional<Heros> findByName(String name);
}

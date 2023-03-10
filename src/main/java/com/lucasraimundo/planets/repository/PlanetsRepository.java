package com.lucasraimundo.planets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasraimundo.planets.model.Planets;

public interface PlanetsRepository extends JpaRepository<Planets, Integer>{

}

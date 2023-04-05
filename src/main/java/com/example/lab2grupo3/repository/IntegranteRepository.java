package com.example.lab2grupo3.repository;

import com.example.lab2grupo3.entity.Integrante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegranteRepository extends JpaRepository<Integrante, Integer> {
}

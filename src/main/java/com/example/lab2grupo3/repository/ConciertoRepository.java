package com.example.lab2grupo3.repository;

import com.example.lab2grupo3.entity.Concierto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciertoRepository extends JpaRepository<Concierto, Integer> {
}

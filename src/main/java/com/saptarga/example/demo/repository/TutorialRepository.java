package com.saptarga.example.demo.repository;

import com.saptarga.example.demo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}

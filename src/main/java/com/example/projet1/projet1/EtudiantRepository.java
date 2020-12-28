package com.example.projet1.projet1;

import com.example.projet1.projet1.Etudiants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiants, Integer> {
}

package com.docker_ms.pharmacyservice.repository;

import com.docker_ms.pharmacyservice.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
}

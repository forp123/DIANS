package com.docker_ms.pharmacyservice.service;

import com.docker_ms.pharmacyservice.entity.Pharmacy;

import java.util.List;
import java.util.Optional;

public interface PharmacyService {
    List<Pharmacy> findAll();

    Optional<Pharmacy> findById(Integer id);
}

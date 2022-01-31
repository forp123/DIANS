package com.docker_ms.pharmacyservice.service.impl;

import com.docker_ms.pharmacyservice.entity.Pharmacy;
import com.docker_ms.pharmacyservice.repository.PharmacyRepository;
import com.docker_ms.pharmacyservice.service.PharmacyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacyServiceImpl implements PharmacyService {
    private final PharmacyRepository pharmacyRepository;

    public PharmacyServiceImpl(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public List<Pharmacy> findAll() {
        return this.pharmacyRepository.findAll();
    }

    @Override
    public Optional<Pharmacy> findById(Integer id) {
        return this.pharmacyRepository.findById(id);
        }
}

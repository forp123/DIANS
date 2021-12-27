package dians.techprototype.demo.service;

import dians.techprototype.demo.model.Pharmacy;
import dians.techprototype.demo.model.exceptions.PharmacyNotFoundException;

import java.util.List;
import java.util.Optional;

public interface PharmacyService {

    List<Pharmacy> findAll();

    Optional<Pharmacy> findById(Integer  id) throws PharmacyNotFoundException;
}
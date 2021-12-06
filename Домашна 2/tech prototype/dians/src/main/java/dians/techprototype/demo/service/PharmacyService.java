package dians.techprototype.demo.service;

import dians.techprototype.demo.model.Pharmacy;
import dians.techprototype.demo.model.exceptions.PharmacyNotFoundException;

import java.util.List;

public interface PharmacyService {

    List<Pharmacy> findAll();

    Pharmacy findById(Long id) throws PharmacyNotFoundException;
}
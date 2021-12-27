package dians.techprototype.demo.service.impl;

import dians.techprototype.demo.model.Pharmacy;
import dians.techprototype.demo.model.exceptions.PharmacyNotFoundException;
import dians.techprototype.demo.repository.PharmacyRepository;
import dians.techprototype.demo.service.PharmacyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacyServiceImpl  implements PharmacyService{

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

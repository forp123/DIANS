package dians.techprototype.demo.service.impl;

import dians.techprototype.demo.model.Pharmacy;
import dians.techprototype.demo.model.exceptions.PharmacyNotFoundException;
import dians.techprototype.demo.repository.InMemoryPharmacyRepository;
import dians.techprototype.demo.service.PharmacyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService{

    private final InMemoryPharmacyRepository pharmacyRepository;

    public PharmacyServiceImpl(InMemoryPharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public List<Pharmacy> findAll() {
        return this.pharmacyRepository.findAll();
    }

    @Override
    public Pharmacy findById(Long id) throws PharmacyNotFoundException {
        Pharmacy pharmacy = pharmacyRepository.findById(id);

        if (pharmacy == null)
            throw new PharmacyNotFoundException(id);

        return pharmacy;
    }
}

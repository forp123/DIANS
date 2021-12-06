package dians.techprototype.demo.repository;

import dians.techprototype.demo.bootstrap.DataHolder;
import dians.techprototype.demo.model.Pharmacy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryPharmacyRepository {

    public List<Pharmacy> findAll() {
        return DataHolder.pharmacies;
    }

    public Pharmacy findById(Long id) {
        return DataHolder.pharmacies.stream()
                .filter(pharmacy -> pharmacy.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
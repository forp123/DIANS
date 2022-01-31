package com.docker_ms.pharmacyservice.web;

import com.docker_ms.pharmacyservice.entity.Pharmacy;
import com.docker_ms.pharmacyservice.service.PharmacyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacies")
@CrossOrigin(origins = "http://localhost:8080")
public class PharmacyRestController {
    private final PharmacyService pharmacyService;

    public PharmacyRestController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    //List of all existing pharmacies from the database;
    @GetMapping("/all")
    public List<Pharmacy> getPharmaciesPage() {
        return this.pharmacyService.findAll();
    }

    //Detailed information for only 1 pharmacy, specified by the 'id' attribute;
    @GetMapping("/{id}")
    public Pharmacy getPharmacyDetailsPage(@PathVariable Integer id) {
        if (this.pharmacyService.findById(id).isPresent()) {
            return this.pharmacyService.findById(id).get();
        }
        return null;
    }
}

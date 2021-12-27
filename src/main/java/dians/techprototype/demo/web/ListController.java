package dians.techprototype.demo.web;


import dians.techprototype.demo.model.Pharmacy;
import dians.techprototype.demo.model.exceptions.PharmacyNotFoundException;
import dians.techprototype.demo.service.PharmacyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/pharmacies")
public class ListController {
    private final PharmacyService pharmacyService;

    public ListController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping
    public String getPharmaciesPage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("errorOccurred", true);
            model.addAttribute("error", error);
        }
        List<Pharmacy> pharmacies = this.pharmacyService.findAll();
        model.addAttribute("pharmacies", pharmacies);

        return "pharmacies-page";
    }

    @GetMapping("/{id}")
    public String getPharmacyDetailsPage(@PathVariable Integer id, Model model) throws PharmacyNotFoundException {
        if (this.pharmacyService.findById(id).isPresent()) {
            Pharmacy pharmacy = this.pharmacyService.findById(id).get();
            model.addAttribute("pharmacy", pharmacy);
            model.addAttribute("bodyContent", "pharmacy-details");
            return "master-template";
        }
        return "redirect:/pharmacies?error=PharmacyNotFound";
    }


}

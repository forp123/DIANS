package dians.techprototype.demo.web;


import dians.techprototype.demo.model.Pharmacy;
import dians.techprototype.demo.model.exceptions.PharmacyNotFoundException;
import dians.techprototype.demo.service.PharmacyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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


}

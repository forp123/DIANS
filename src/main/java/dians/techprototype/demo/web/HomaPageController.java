package dians.techprototype.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomaPageController {
    @GetMapping
    public String getHomePage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("errorOccurred", true);
            model.addAttribute("error", error);
        }

        return "home-page";
    }

    @GetMapping("/contact")
    public String getAboutUsPage() {
        return "contact";
    }

    @GetMapping("/pharmacies")
    public String getCategoriesPage() {
        return "pharmacies";
    }


}

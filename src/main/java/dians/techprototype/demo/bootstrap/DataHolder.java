package dians.techprototype.demo.bootstrap;

import dians.techprototype.demo.model.Pharmacy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Pharmacy> pharmacies = new ArrayList<>();

    @PostConstruct
    public void init() {

        //TODO
        pharmacies.add(new Pharmacy(
                (long) 1, "Zegin 2", "Партизанска , Скопје 1000",
                " 24:00", "02 2521 431",
                4.3, "http://www.zegin.com.mk/"));


    }

}

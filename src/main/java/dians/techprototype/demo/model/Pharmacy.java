package dians.techprototype.demo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacy {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @NotNull
        private String name;
        private String address;
        private String workingHours;
        private String phoneNumber;
        private Double rating;
        private String website;

        @NotNull
        private String latitude;

        @NotNull
        private String longitude;
}

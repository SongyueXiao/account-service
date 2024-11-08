package com.example.accountservice.model;

//import javax.persistence.*;

import jakarta.persistence.*;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Embeddable
@Data
@Schema(description = "Address details")
public class Address {

    @Schema(description = "Street address", example = "123 Main St")
    private String street;

    @Schema(description = "City", example = "Anytown")
    private String city;

    @Schema(description = "State", example = "CA")
    private String state;

    @Schema(description = "ZIP Code", example = "12345")
    private String zipCode;

    @Schema(description = "Country", example = "USA")
    private String country;
}

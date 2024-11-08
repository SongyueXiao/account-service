package com.example.accountservice.model;

//import javax.persistence.*;

import jakarta.persistence.*;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Entity
@Table(name = "users")
@Schema(description = "Details about the user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the user", example = "1")
    private Long id;

    @Column(nullable = false, unique = true)
    @Schema(description = "Email of the user", example = "user@example.com")
    private String email;

    @Column(nullable = false)
    @Schema(description = "Username of the user", example = "john_doe")
    private String username;

    @Column(nullable = false)
    @Schema(description = "Encrypted password of the user")
    private String password;

    @Embedded
    @Schema(description = "Shipping address of the user")
    private Address shippingAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "billing_street")),
            @AttributeOverride(name = "city", column = @Column(name = "billing_city")),
            @AttributeOverride(name = "state", column = @Column(name = "billing_state")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "billing_zip_code")),
            @AttributeOverride(name = "country", column = @Column(name = "billing_country"))
    })
    @Schema(description = "Billing address of the user")
    private Address billingAddress;

    // Payment methods can be a separate entity or embedded, depending on requirements

    // Additional fields as needed
}

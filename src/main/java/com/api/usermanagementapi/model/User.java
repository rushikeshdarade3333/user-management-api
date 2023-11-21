package com.api.usermanagementapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotBlank(message = "First name is required")
	private String firstName;
    
    @NotBlank(message = "Last name is required")
	private String lastName;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
	private String email;
    

    // Example pattern for a phone number (adjust based on your needs)
    @Digits(integer = 10, fraction = 0, message = "Invalid phone number format")
    private long phoneNumber;

    private int age; 
    @NotBlank(message = "Address is required")
	private String address;
	
	
	
	
}

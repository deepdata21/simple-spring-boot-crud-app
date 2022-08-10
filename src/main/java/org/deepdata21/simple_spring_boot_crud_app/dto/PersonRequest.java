package org.deepdata21.simple_spring_boot_crud_app.dto;

import javax.validation.constraints.*;

//  Required for validation
//  Notice the use of record instead of class
public record PersonRequest(
    @NotBlank(message = "First name cannot be empty or null")
    String firstName,
    @NotNull(message = "Last name cannot be null")
    String lastName,
    @Email(message = "Given email address is not valid")
    String email,
    @NotNull(message = "Given phone number is not valid")
    @Pattern(regexp = "^\\d{10}$")
    String cellPhone,
    @Min(13)
    int age) {
}

package ie.atu.week5lab3.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor@Data@Builder
public class Passenger {
    @NotBlank(message = "ID must NOT be blank bruh")  @Size(max=40, message = "ID Must be less than 60 Characters")
    private String passengerID;
    @NotBlank(message = "Name must NOT be blank bruh")  @Size(max=60, message = "Name Must be less than 60 Characters")
    private String name;
    @NotBlank(message = "Email must NOT be blank bruh") @Email(message = "Email must be of normal format")
    private String email;
}

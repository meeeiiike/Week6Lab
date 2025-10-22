package ie.atu.week5lab3.controller.errorHandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor@Data
public class ExceptionDetails{
    private String fieldName;
    private String fieldValue;
}

package ie.atu.week5lab3.service;

import ie.atu.week5lab3.model.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerServiceTest {

    private PassengerService service;

    @BeforeEach
    void setup(){
        service = new PassengerService();
    }

    @Test
    void createThenFindByID(){
        Passenger p = Passenger.builder()
                .passengerID("P001")
                .name("Meike")
                .email("meike@gmail.com")
                .build();
        service.create(p);

        Optional<Passenger> passengerFound = service.findByID("P001");
        assertTrue(passengerFound.isPresent());
        assertEquals("Meike", passengerFound.get().getName());
    }

    @Test
    void duplicateIdThrowsException(){
        service.create(Passenger.builder()
                .passengerID("P002")
                .name("Mark")
                .email("Mark@gmail.com")
                .build());

        assertThrows(IllegalArgumentException.class, () ->
            service.create(Passenger.builder()
                    .passengerID("P002")
                    .name("Mark")
                    .email("Mark@gmail.com")
                    .build()));
    }
}

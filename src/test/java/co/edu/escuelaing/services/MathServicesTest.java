package co.edu.escuelaing.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathServicesTest {

    @Test
    void shouldReturnSquareOfPositiveNumber() {
        assertEquals(25, MathServices.square(5));
    }

    @Test
    void shouldReturnSquareOfNegativeNumber() {
        assertEquals(16, MathServices.square(-4));
    }

    @Test
    void shouldReturnZeroForZero() {
        assertEquals(0, MathServices.square(0));
    }

    @Test
    void shouldReturnValueAndResultInJsonVersion() {
        SquareResponse response = MathServices.squareJson(new SquareRequest(14));

        assertEquals(14, response.getValue());
        assertEquals(196, response.getResult());
    }

    @Test
    void shouldRejectRequestWithoutValue() {
        assertThrows(IllegalArgumentException.class,
                () -> MathServices.squareJson(new SquareRequest()));
    }

    @Test
    void shouldRejectNullRequest() {
        assertThrows(IllegalArgumentException.class,
                () -> MathServices.squareJson(null));
    }
}

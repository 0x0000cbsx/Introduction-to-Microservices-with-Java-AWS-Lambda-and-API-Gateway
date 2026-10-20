package co.edu.escuelaing.services;

public class MathServices {

    public static Integer square(Integer i) {
        return i * i;
    }

    public static SquareResponse squareJson(SquareRequest request) {
        if (request == null || request.getValue() == null) {
            throw new IllegalArgumentException("The field 'value' is required");
        }
        Integer value = request.getValue();
        return new SquareResponse(value, square(value));
    }
}

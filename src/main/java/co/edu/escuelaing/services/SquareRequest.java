package co.edu.escuelaing.services;

public class SquareRequest {

    private Integer value;

    public SquareRequest() {
    }

    public SquareRequest(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

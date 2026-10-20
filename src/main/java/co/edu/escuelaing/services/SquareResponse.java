package co.edu.escuelaing.services;

public class SquareResponse {

    private Integer value;
    private Integer result;

    public SquareResponse() {
    }

    public SquareResponse(Integer value, Integer result) {
        this.value = value;
        this.result = result;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}

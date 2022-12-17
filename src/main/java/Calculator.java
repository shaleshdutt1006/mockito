public class Calculator {


    CalculatorService service;

    //Constructor to initialise service variable of type CalculatorService type
    public Calculator(CalculatorService service) {
        this.service = service;
    }

    //Method to perform addition of two variable i and j
    public int perform(int i, int j) {
        return service.add(i, j) * i;
    }

}

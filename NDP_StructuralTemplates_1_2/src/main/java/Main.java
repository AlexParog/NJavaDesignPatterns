public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        System.out.println("<==============================================>");

        Ints calcAdapter = new IntsCalculator();
        System.out.println("Cумма: " + calcAdapter.sum(10,20));
        System.out.println("Произведение: " + calcAdapter.mult(10,20));
        System.out.println("Возведение в степень: " + calcAdapter.pow(2,10));
    }
}

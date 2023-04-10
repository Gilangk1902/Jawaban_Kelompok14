public class Calculator {
    public static void main(String[] args) {
        CalculatorClass.Add(10, 5); // output: 15.0
        CalculatorClass.Subtract(10, 5); // output: 5.0
        CalculatorClass.Multiply(10, 5); // output: 50.0
        CalculatorClass.Divide(10, 5); // output: 2.0
        CalculatorClass.Modulo(10, 5); // output: 0.0
    }
}

public class CalculatorClass{
    public static int Add(int num1, int num2){
        return num1+num2;
    }
    public static int Subtract(int num1, int num2){
        return num1-num2;
    }
    public static int Multiply(int num1, int num2){
        return num1*num2;
    }
    public static int Divide(int num1, int num2){
        return num1/num2;
    }
    public static int Modulo(int num1, int num2){
        return num1%num2;
    }
}

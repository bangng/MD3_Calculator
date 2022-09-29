package rikkei.academy.calculator;

public class Calculator {
    public static float calculator(float firstOperand,float secondOperator,char operator){
        switch (operator){
            case '+':
                return firstOperand + secondOperator;
            case '-':
                return firstOperand - secondOperator;
            case '*':
                return firstOperand * secondOperator;
            case '/':
                if (secondOperator !=0){
                    return firstOperand / secondOperator;
                }else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("Invalid division");
        }
    }
}

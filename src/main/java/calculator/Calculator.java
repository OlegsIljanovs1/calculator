package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        String a = expression[0];
        String op1 = expression[1];
        String b = expression[2];

        double result = calc(a, op1, b);

        if(expression.length >= 5){
            String op2 = expression[3];
            String c = expression[4];
            result = calc(Double.toString(result), op2, c);
        }
        if(expression.length >= 7) {
            String op3 = expression[5];
            String d = expression[6];
            result = calc(Double.toString(result), op3, d);
        }
            if(expression.length == 9){
                String op4 = expression[7];
                String e = expression[8];
                result = calc(Double.toString(result), op4, e);
        }
        return Double.toString(result);


    }


    double calc(String stra, String op, String strb) {
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        double result;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

            default:
                result = 0;
        }
        return result;



    }
}



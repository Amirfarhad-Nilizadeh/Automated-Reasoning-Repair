public class Calculator {
    private int output;

    Calculator() {
	this.output = 0;
    }
  
    public int getOutput() {
	return output;
    }

    /*@ requires 37 <= (int)operator && (int)operator <= 47;
      @ {|
      @    requires operator == '+';
      @    requires num1 + num2 <= Integer.MAX_VALUE;
      @    requires Integer.MIN_VALUE <= num1 + num2;
      @    ensures \result == num1 + num2;
      @ also
      @    requires operator == '*'; 
      @    requires num1 * num2 <= Integer.MAX_VALUE;
      @    requires Integer.MIN_VALUE <= num1 * num2;
      @    ensures \result == num1 * num2;
      @ also
      @    requires operator == '-'; 
      @    requires num1 - num2 <= Integer.MAX_VALUE;
      @    requires Integer.MIN_VALUE <= num1 - num2;
      @    ensures \result == num1 - num2;
      @ also
      @    requires operator == '/'; 
      @    requires num2 != 0;
      @    requires num1 / num2 <= Integer.MAX_VALUE;
      @    requires num1 / num2 != Integer.MIN_VALUE;
      @    ensures \result == (num1 / num2);
      @ also
      @    requires operator == '%'; 
      @    requires num2 != 0;
      @    requires num1 % num2 != Integer.MIN_VALUE;
      @    ensures \result == (num1 % num2);
      @ also
      @    requires operator != '+' && operator != '*' && operator != '-' && operator != '/' && operator != '%';
      @    ensures \result == -1;
    |} @*/
    public /*@ pure @*/ void calculate(int num1, int num2, char operator) {
        switch (operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
		break;

	    case '%':
		output = num1 % num2;
                break;

            default:
                output = -1;
        }
    }
}

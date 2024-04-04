//Group Project
public class Group {

  public static void main(String[] args) {
    // Main
    // System.out.println(Sam());
    // System.out.println(charlie());
    // System.out.println(divide(10, 2));
    // System.out.println(multiply(5, 3));
    System.out.println(power(3, 3));
    System.out.println(power(6, 2));
  }

  static String charlie() {
    return "Charlie Thompson";
  }

  public static String Sam() {
    String sam = "Samantha Keller";
    return sam;
  }

  // calculates integer division num1/num2, should throw an Arithmetic exception
  // if num2 is 0, or the result of num1/num2 is not a whole number.
  static int divide(int num1, int num2) {
    if (num2 == 0) {
      throw new ArithmeticException("Cannot divide by zero.");
    }
    if (num1 % num2 != 0) {
      throw new ArithmeticException("Result is not a whole number.");
    }
    boolean isNegative = (num1 < 0) ^ (num2 < 0);
    num1 = Math.abs(num1);
    num2 = Math.abs(num2);

    int quotient = 0;

    while (num1 > 0) {
      num1 -= num2;
      quotient++;
    }
    if (isNegative)
      quotient *= -1;
    return quotient;
  }

  // calculates num1*num2
  static int multiply(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return 0;
    }
    
    boolean isNegative = (num1 < 0) ^ (num2 < 0);
    num1 = Math.abs(num1);
    num2 = Math.abs(num2);

    int product = 0;
    for (int i = 0; i < num2; i++) {
      product += num1;
    }

    if (isNegative)
      product *= -1;
    return product;
  }

  static int power(int num1, int num2) {
    if (num2 == 0) {
      return 1;
    }

    int result = num1;
    for (int i = 1; i < num2; i++) {
      result = multiply(result, num1);
    }

    return result;
  }
}

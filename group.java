//Group Project
public class group {

  public static void main(String[] args){
    //Main
    System.out.println(Sam());
  }
  static String charlie(){
    return "Charlie Thompson"
  }


  public static String Sam () {
    String sam = "Samantha Keller";
    return sam;
  }
  public int divide(int num1, int num2){return num1 / num2;} //calculates integer division num1/num2, should throw an Arithmetic exception if num2 is 0, or the result of num1/num2 is not a whole number.
  public int multiply(int num1, int num2){return num1 * num2;} //calculates num1*num2
  public int power(int num1, int num2){return num1 * num2;} //calculates num1 to the power of num2
}

import java.util.Scanner;
/* This program multiplies two numbers 
and shows the answer. */
public class Main {

   public static void main(String[] args) {
      // holding onto the input 
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      
      int result = num1 * num2;
      // multiplying our inputs and storing as new variable result
      
      System.out.println(num1 + " x " + num2 + " = " + result);
      // prints or outputs the result 
   }
}

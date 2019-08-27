import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready1, ready2;

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.)");
    x = keyboard.nextDouble();

    while (x < 0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);

    ready2 = "YES!";
    System.out.println("Are you ready?!?");
    System.out.println("Only type -YES!-");
    ready1 = keyboard.next();

    while (! ready1.equals(ready2)){
      System.out.println("That is not the correct input, try again...");
      ready1 = keyboard.next();
    }
    System.out.println("Great! Let's get started.");
  }
}

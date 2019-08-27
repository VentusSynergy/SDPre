import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x;

    System.out.println("Please enter a number: ");
    x = scanner.nextInt();

    if(x % 2 == 0) {
      System.out.println("The number " + x + " is even");
    }
    else {
      System.out.println("The number " + x + " is odd");
    }
  }
}

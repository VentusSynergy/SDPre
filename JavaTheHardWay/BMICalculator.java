import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, pounds, feet;

    System.out.print("Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print("Your hieght in feet: ");
    feet = keyboard.nextDouble();

    System.out.print("Your wieght in pounds: ");
    pounds = keyboard.nextDouble();

    kg = pounds / 2.205;
    m = inches / 39.37;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);

  }
}

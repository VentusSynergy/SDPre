import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, month;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name?");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();



    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("What is your favorite month?");
    month = keyboard.next();

    System.out.println("Ok, " + month + " is a very likeable month.");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    // You can put an integer in place of a double
    // You can put and integer or double in a String
    //I could not cause an error with the string, but the other variables i used string values
  }
}

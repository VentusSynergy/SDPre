import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double bmi, height, weight;

    System.out.print("Enter your height in m: ");
    height = keyboard.nextDouble();

    System.out.print("Enter your weight in kg: ");
    weight = keyboard.nextDouble();

    bmi = weight / (height*height);

    System.out.print("BMI category: ");
    if (bmi < 15.0){
      System.out.println("Your BMI is " + bmi + "\nvery severely underwieght");
    }
    else if (bmi <= 16.0) {
      System.out.println("Your BMI is " + bmi + "\nseverely underwieght");
    }
    else if (bmi < 18.5){
      System.out.println("Your BMI is " + bmi + "\nunderwieght");
    }
    else if (bmi < 25.0) {
      System.out.println("Your BMI is " + bmi + "\nnormal weight");
    }
    else if (bmi < 30.0) {
      System.out.println("Your BMI is " + bmi + "\noverwieght");
    }
    else if (bmi < 35.0){
      System.out.println("Your BMI is " + bmi + "\nmoderately obese");
    }
    else if (bmi < 40.0) {
      System.out.println("Your BMI is " + bmi + "\nseverely obese");
    }
    else {
      System.out.println("Your BMI is " + bmi + "\nvery severely/\"morbidly\" obese");
    }
  }
}

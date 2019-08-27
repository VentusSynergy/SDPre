public class Objective6Lab4{
  public static void main(String[] args){
    int counter, total;
    counter = 1;
    total = 0;

    while (counter <= 20) {
      total = total + counter;
      counter = counter + 1;
    }

    System.out.println(total);
  }
}

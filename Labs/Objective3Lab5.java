import java.util.Scanner;

public class Objective3Lab5 {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    Double x, y, z;

    System.out.println("Please enter a number: ");
      x = input.nextDouble();
    System.out.println("Please enter another number: ");
      y = input.nextDouble();

    z = x + y;

    System.out.println("The sume of " + x + " and " + y + " = " + z );

  }
}

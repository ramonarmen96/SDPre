import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner (System.in);

    String fname = "John";
    String lname = "Doe";
    String favoriteAnimal = "Lemur";
    String favoriteFood = "Tacos";
    String favoriteSong = "Twinkle Twinkle Little Start";

System.out.println("What is your first name? ");

fname = keyboard.nextLine();

System.out.println("What is your last name? ");

lname = keyboard.nextLine();

System.out.println("What is your favorite animal? ");

favoriteAnimal = keyboard.nextLine();

System.out.println("What is your favorite food? ");

favoriteFood = keyboard.nextLine();

System.out.println("What is your favorite Song? ");

favoriteSong = keyboard.nextLine();

System.out.println("My name is " +fname+" "+lname+".");
System.out.println("My Favorite animal is " +favoriteAnimal+ ".");
System.out.println("My favorite food is " +favoriteFood+ ".");
System.out.println("My Favorote song is "+favoriteSong+ ".");


  }
}

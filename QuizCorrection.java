import java.util.Scanner;

public class QuizCorrection{
  public static void main(String[] args){
    /*
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";

    String firstIntl = firstName.substring(0,1);
    String midIntl = middleName.substring(0,1);
    String lastIntl = lastName.substring(0,1);

    String intls = (firstIntl + midIntl + lastIntl);

    System.out.println(intls.toLowerCase());
    */

    Scanner input = new Scanner();
    System.out.println("Pick an integer between 1 and 100");
    int inputNum = input.nextInt();
    int randNum = (int) (1 + Math.random() * 100);
    int difference = inputNum - randNum;
    int absDiff = Math.abs(difference);
    System.out.println("Your lucky number is " + absDiff);

  }
}

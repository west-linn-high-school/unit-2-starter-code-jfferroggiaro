import java.util.Random;

public class RandomNumbers{
  public static void main(String[] args){
    Random rand = new Random();

    System.out.println("Random Number 0-9: " + rand.nextInt(10));
    System.out.println("Math.random 0-9: " + (int) (Math.random()*10));

    System.out.println("Random Number 1-10: " + (rand.nextInt(10) + 1));
    System.out.println("Random Number 20-34: " + (rand.nextInt(15) + 20));
    System.out.println("Random Number -10-9: " + (rand.nextInt(20) - 10));

    System.out.println("Random Double [0,1): " + rand.nextDouble());
    System.out.println("Random Double [0,6): " + (rand.nextDouble()*6));

  }
}

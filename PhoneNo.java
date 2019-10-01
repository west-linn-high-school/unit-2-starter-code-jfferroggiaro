
import java.util.Random;

public class PhoneNo{
    public static void main(String[] args){
        Random rand = new Random();
        final int DIG1 = rand.nextInt(8) + 2;
        final int DIG2 = rand.nextInt(9);
        final int DIG3 = rand.nextInt(10);
        final int DIG4 = rand.nextInt(8) + 2;
        final int DIG56 = rand.nextInt(100);
        final int DIG7890 = rand.nextInt(10000);

        System.out.println("(" + DIG1 + DIG2 + DIG3 + ") " + DIG4 + DIG56 + " - " + DIG7890);
    }
}

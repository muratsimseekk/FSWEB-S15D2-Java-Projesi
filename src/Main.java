import com.workintech.set.Challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Challenge challenge = new Challenge();
        System.out.println("Temizlenmis text ::" +challenge.getClean());
        System.out.println("Ordered text :: " +challenge.getOrdered());
        System.out.println("Splitted text ::" + Arrays.toString(challenge.getSplitted()));
        System.out.println();
    }
}
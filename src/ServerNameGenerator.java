import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static String randomElement(String[] adjective, String[] noun) {
        Random rand = new Random();

        int upperbound = adjective.length;
        int int_random = rand.nextInt(upperbound);

        return adjective[int_random] + "-" + noun[int_random];
    }


    public static void main(String[] args) {
        String[] adjective = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty", "zealous"};

        String[] noun = {"people", "map", "history", "person", "computer", "world", "government", "family", "bird", "law"};

        System.out.println(randomElement(adjective, noun));
    }
}

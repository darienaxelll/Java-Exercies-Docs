import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        Person Nico = new Person("Nico");
        Person Jason = new Person("Jason");
        Person Patrick = new Person("Patrick");

        String[] listOfPeople;
        listOfPeople = new String[3];

        listOfPeople[0] = Nico.getName();
        listOfPeople[1] = Jason.getName();
        listOfPeople[2] = Patrick.getName();

        for (String listOfPerson : listOfPeople) {
            System.out.println(listOfPerson);
        }

    }
}

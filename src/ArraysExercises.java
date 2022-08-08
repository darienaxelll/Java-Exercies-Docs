import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    public static Person[] addPerson(Person[] personArr, Person newPerson) {

        Person[] newArr = Arrays.copyOf(personArr, personArr.length +1);

        newArr[newArr.length - 1] = newPerson;
        return newArr;
    }

    public static void main(String[] args) {
        Person Nico = new Person("Nico");
        Person Jason = new Person("Jason");
        Person Patrick = new Person("Patrick");

        Person[]  personArr = {Nico, Jason, Patrick};

//        for (Person person  : personArr) {
//            System.out.println(person.getName());
//        }

        Person Josh = new Person("Josh");

        Person[] newNewList = addPerson(personArr, Josh);

        for (Person person : newNewList) {
            System.out.println(person.getName());
        }

    }
}

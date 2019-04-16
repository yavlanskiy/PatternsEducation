package Builder.example1;

/**
 * Created by max_yav on 16.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        PersonNotBuilder person = new PersonNotBuilder("Max","Yavlanskiy");

        Person myPerson = new Person.Builder()
                .withName("Max")
                .withSurname("Yavlanskiy")
                .withAge(30)
                .withHeight(180)
                .withWeight(80)
                .build();

        System.out.println(myPerson.toString());

    }
}

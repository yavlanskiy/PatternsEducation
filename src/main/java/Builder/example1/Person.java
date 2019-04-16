package Builder.example1;

import java.util.Set;

/**
 * Created by max_yav on 16.04.2019.
 */
public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", parents=" + parents +
                '}';
    }

   /* ---=== getters are supposed to be here. We skipped this part of code to make it simple ===--- */

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){
            newPerson.parents = parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }
}
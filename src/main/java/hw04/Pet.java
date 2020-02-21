package hw04;

import java.util.Arrays;

public class Pet extends family{
    //Creation(Pet Characteristics)
    String species;
    int age;
    int trickLevel;
    String[] habits;
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void respond(){
        System.out.println("Hello, owner. I am " + "Rock" + "I miss you");
    }
    public static void foul(){
        System.out.println("I need to cover it up");
    }
    //Constructor
    public Pet(String species, String name, int age, int trickLevel,  String[] habits) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    //toString

    @Override
    public String toString() {
        return species + '{' +
                " nickname='" + name + '\''+
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}

package hw04;

public class Human extends family{
    //Creation(Human Characteristics)
    String surname;
    int year;
    int iq;
    String mother;
    String father;
    Pet pet;
    //Constructor
    public Human(String name, String surname, int year, int iq, String mother, String father,Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }
    //toString

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", pet=" + pet +
                '}';
    }
}

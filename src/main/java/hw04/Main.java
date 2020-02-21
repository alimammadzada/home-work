package hw04;

public class Main {
    public static void main(String[] args) {
        //Input
        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human human = new Human("Michael","Karleone",1977,90,"Jane Karleone","Vito Karleone",pet);

        //Print
        System.out.println(pet);
        System.out.println(human);
    }
}

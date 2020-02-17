package hw03;
import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        //creation
        System.out.print("Please, input the day of the week: ");
        Scanner s = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to party";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "visit the teacher";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "buy books";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do house works";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do sports";
        //loopK
        for (; ; ) {
            String input = s.nextLine().toLowerCase().trim();
            if (input.equals("sunday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[0][0], schedule[0][1]);
                System.out.print("Please, input the day of the week: ");
            } else if (input.equals("monday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[1][0], schedule[1][1]);
                System.out.print("Please, input the day of the week: ");
            } else if (input.equals("tuesday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[2][0], schedule[2][1]);
                System.out.print("Please, input the day of the week: ");
            } else if (input.equals("wednesday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[3][0], schedule[3][1]);
                System.out.print("Please, input the day of the week: ");
            } else if (input.equals("thursday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[4][0], schedule[4][1]);
                System.out.print("Please, input the day of the week: ");
            } else if (input.equals("friday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[5][0], schedule[5][1]);
                System.out.print("Please, input the day of the week: ");
            } else if (input.equals("saturday")) {
                System.out.printf("Your tasks for %s: %s\n", schedule[6][0], schedule[6][1]);
                System.out.print("Please, input the day of the week: ");
            } else if(input.equals("exit")){
                break;
            }
            else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}

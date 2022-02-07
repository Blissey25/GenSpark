import java.util.Scanner;

public class DragonCave2 {
    public static void main(String[] arg) {
        Scanner dragon = new Scanner(System.in);

        System.out.println("Welcome Adventurer! Before you are two caves.");
        System.out.println("One will lead to the friendly beast with vast riches to share.");
        System.out.println("The other will lead to your imminent demise!");
        System.out.println("Which cave will you choose?");
        System.out.println("Type 1 to enter cave 1 or Type 2 to enter cave 2 ");

        String cave = dragon.nextLine();

        try {
            int a = Integer.parseInt(cave);

            if (a == 1) {
                System.out.println("You walk into the cave");
                System.out.println("It is cold and quiet...");
                System.out.println("Too quiet.");
                System.out.println("Suddenly you see a blinding light and feel intense heat");
                System.out.println("The last thing you hear is laughter as a raging fire consumes you");
            }
            if (a == 2) {
                System.out.println("You walk into the cave");
                System.out.println("The walls are covered with splendid jewels.");
                System.out.println("You smell something sweet in the distance...");
                System.out.println("A voice calls out to you");
                System.out.println("'Welcome friend! Please help yourself to whatever you fancy!'");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Input not a number.");

        }

        }
    }



import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class adds 1 of each of the 4 animals as a defaults. Then allow the user to create a new animal, feed an animal,
 * and display all of the information of each of the animals
 */
public class Main {
    /**
     *
     * @param args runs main class
     */
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        Animal leo = new Lion("Leo", 17,"Yellow","Congo");
        Animal sal = new Snakes("Sal", 11,"Green","Viper");
        Animal herky = new Birds("Herky", 175,"Black","Hawkeye");
        Animal marty = new Zebra("Marty", 16,"Black and White","African");

        zoo.add(leo);
        zoo.add(sal);
        zoo.add(herky);
        zoo.add(marty);

        Animal animals;

        int choice = 0;
        int homeChoice = 0;

        boolean isValid;
        boolean isValid1;

        Scanner scan = new Scanner(System.in);

        while (homeChoice == 0) {
            System.out.println("What would you like to do:");
            System.out.println("1. Add new Animal ");
            System.out.println("2. Feed Animal ");
            System.out.println("3. Display Information");
            homeChoice = scan.nextInt();

            if (homeChoice == 1) {
                while (choice == 0) {
                    System.out.println("What type of Animal would you like to add:");
                    System.out.println("1. Lion");
                    System.out.println("2. Zebra");
                    System.out.println("3. Snake");
                    System.out.println("4: Bird");
                    choice = scan.nextInt();

                    if ((choice != 1) && (choice != 2) && (choice != 3) && choice != 4) {
                        choice = 0;
                        System.out.println("Invalid Entry");
                    }
                }

                System.out.println("Animal's name: ");
                String name = scan.next();

                System.out.println("Animal's age: ");
                int age = scan.nextInt();

                System.out.println("Animal color: ");
                String color = scan.next();

                System.out.println("Animal Breed: ");
                String breed = scan.next();

                if (choice == 1) {
                    animals = new Lion(name, age, color, breed);
                } else if (choice == 2) {
                    animals = new Zebra(name, age, color, breed);
                } else if (choice == 3) {
                    animals = new Snakes(name, age, color, breed);
                } else {
                    animals = new Birds(name, age, color, breed);
                }
                zoo.add(animals);
                homeChoice = 0;
            } else if (homeChoice == 2) {
                int count = 1;
                System.out.println("Who do you want to feed:");
                for(Animal a : zoo){
                    System.out.println(count + ") " + a.getName());
                    count++;
                }

                System.out.println("Enter Choice: ");
                int feedChoice = scan.nextInt();

                try{
                    isValid = (feedChoice >= 1 && feedChoice <= count);
                } catch (NumberFormatException notANum){
                    isValid = false;
                }

                if(isValid){
                    Animal animal = zoo.get(feedChoice-1);
                    System.out.println(animal.FeedAnimal());
                    homeChoice = 0;
                }

            } else if(homeChoice == 3){
                int count1 = 1;
                System.out.println("View Information for:");
                for(Animal a1 : zoo){
                    System.out.println(count1 + ") " + a1.getName());
                    count1++;
                }

                System.out.println("Enter Choice: ");
                int displayChoice = scan.nextInt();

                try{
                    isValid1 = (displayChoice >= 1 && displayChoice <= count1);
                } catch (NumberFormatException notANum){
                    isValid1 = false;
                }

                if(isValid1){
                    Animal animal1 = zoo.get(displayChoice-1);
                    System.out.println(animal1);
                    homeChoice = 0;
                }
            } else{
                System.out.println("Invalid Entry");
                homeChoice = 0;
            }
        }
    }
}

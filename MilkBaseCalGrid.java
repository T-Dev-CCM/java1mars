//create energy grid for user 
//import scanner class so user can input n manage
import java.util.scanner;

// Create class, one class per file 
public class MilkBaseCalGrid { //starting scope operator

    // Create entry point 
    public static void main (String[] args){ //starting scope

        //introduce program
        System.out.println("\n\n\n\tWelcome to the Milky Way Cal Grid Manager!\n");
        System.out.println("This program will show you your caloric intake from Milky Way Bars");
        System.out.println("I see you're new here, let's show you the ropes\n\n");
    // create scanner
        Scanner scanner = new Scanner(System.in);
    //declare an array

    int[] barseat = {30,45,25,35,40};
    int[] barseat2 = {20,30,25,40,35};

    int totalCaloriesGained = calculateTotalCalories(barseat);

    int totalCaloriesGained2 = calculateTotalCalories(barseat2);

    int combinedTotalCalories = totalCaloriesGained + totalCaloriesGained2;

    System.out.println("The calories you ate was: " + totalCaloriesGained + " calories.");

    System.out.println("The calories you ate AGAIN was: " + totalCaloriesGained2 + " calories.");

    System.out.println("The total calories you ate was: " + combinedTotalCalories + " calories.");


    scanner.close();

    }

    //create a function to calculate cals 

    public static int calculateTotalCalories(int[] energySources){

        int totalCalories = 0;

        for(int eachCalorieSource : calorieSources){

            totalCalorie += calorieSources[eachCalorieSource];
        }

        return totalEnergy;


    }

}
// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String drinkName, foodName;
        int optionDrink, optionFood;
        
        optionDrink = input.nextInt();
        optionFood = input.nextInt();
        if (optionDrink == 1) {
            drinkName = "Teh Hangat";
        } else {
            drinkName = "Es Kelapa Muda";
        }
        if (optionFood == 1) {
            foodName = "Bakso Tenis";
        } else {
            if (optionFood == 2) {
                foodName = "Sate Padang";
            } else {
                if (optionFood == 3) {
                    foodName = "Udang Bakar";
                } else {
                    foodName = "---";
                }
            }
        }
        System.out.println(drinkName + "#" + foodName);
    }
}


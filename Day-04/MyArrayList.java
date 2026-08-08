import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("Pizza");
        food.add("Burger");
        food.add("Pasta");
        food.set(1, "Sandwich");
        food.remove(2);
        System.out.println(food);
    }

    
}

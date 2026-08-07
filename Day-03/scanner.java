import java .util.Scanner;
public class scanner {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("hi " + name);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("you are " + age + "years old");
        scanner.close();
        System.out.println(" Enter your favourite food : ");
        String food = scanner.nextLine();
        System.out.println("your favourite food is " + food);
        scanner.close();

    }
}
    


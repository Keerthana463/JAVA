import java.util.Scanner; 
public class loop {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String name="";
      do{
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
      }while(name.trim().isEmpty());

      System.out.println("Hello " + name);
    }
    
}




    


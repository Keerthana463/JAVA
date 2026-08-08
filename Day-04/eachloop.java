import java .util.ArrayList;
public class eachloop {
    public static void main (String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        for (String i : animals) {
            System.out.println(i);
        }
    }
}
        

public class overload {
    public static void main (String[] args) {
       int x = add (3,4);
       System.out.println(x);
    }

       static int add (int a, int b) {
           return a + b;
       }
       static double add (double a, double b) {
           return a + b;
       }
    }
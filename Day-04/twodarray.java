public class twodarray {
    public static void main(String[] args) {
        String[][] cars =  { {"Volvo", "BMW", "Ford"},
                             {"Mazda", "Toyota", "Honda"},
                             {"Nissan", "Kia", "Hyundai"}
                             };
        
        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

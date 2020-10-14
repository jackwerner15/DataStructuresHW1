import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapCar {

    HashMap<String, String> car = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void run() {
        car.put("Civic", "Honda");
        car.put("Focus", "Ford");
        car.put("Equinox", "Chevy");
        car.put("Beetle", "Volkswagen");

        System.out.println("Which model are you looking for? ");
        String model = scanner.nextLine();

        for (HashMap.Entry<String, String> iterator : car.entrySet()) {
            if (iterator.getKey().equalsIgnoreCase(model)) {
                String key = iterator.getKey();
                String value = iterator.getValue();
                System.out
                        .println("Oh, you're looking for a " + key + "? Our " + value + " section is right over here.");
                break;
                
            }
            

        }
        
    }

}

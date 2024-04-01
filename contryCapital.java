import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class contryCapital {

    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("Bharat", "New Delhi");
        country.put("Japan", "Tokyo");
        country.put("Bangladesh", "Dhaka");
        country.put("Pakistan", "Islamabad");
        country.put("Shrilanka", "Columbo");
        country.put("Nepal", "Kathmandu");

        Scanner sc = new Scanner(System.in);
        String checkCountry = sc.next();

        if(country.containsKey(checkCountry)){
            System.out.println(checkCountry +" : "+ country.get(checkCountry));
        }else{
            System.out.println("I don't know about this.");
        }
    }
}
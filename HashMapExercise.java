import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
	    String carModel = "";
	    String carMake = "";
		HashMap<String,String> cars = new HashMap<>();
		cars.put("civic","Honda");
		cars.put("accord","Honda");
		cars.put("pilot","Honda");
		cars.put("odessey","Honda");
		cars.put("ls500","Lexus");
		cars.put("es500","Lexus");
		cars.put("gs350","Lexus");
		cars.put("tahoe","Chevy");
		cars.put("suburban","Chevy");
		cars.put("blazer","Chevy");
		cars.put("camry","Toyota");
		cars.put("corolla","Toyota");
		cars.put("prius","Toyota");
		cars.put("sienna","Toyota");
	
		System.out.println("What car model are you looking for?");
	    carModel = scan.nextLine();
	    carModel = carModel.toLowerCase();
	    
	    if (cars.containsKey(carModel) == true) {
	    	carMake = cars.get(carModel);
	    	System.out.println("Our " + carMake + " selection is right over here");
		//loop through the hash map and return each key/value pair
		for (Map.Entry<String, String> entry : cars.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			if (value == carMake){
			System.out.println(key.toUpperCase());
			}
			}
      }
    else
    {
    	System.out.println("Sorry we dont have that model car");
    }
    }
}



import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
    
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("Germany");        // if remove Berlin, Germany/Berlin still there. have to remove the key
        System.out.println(capitalCities.get("Germany"));
        System.out.println(capitalCities.size());
        System.out.println();

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " |" + " value: " + capitalCities.get(i));
          }
      }
}
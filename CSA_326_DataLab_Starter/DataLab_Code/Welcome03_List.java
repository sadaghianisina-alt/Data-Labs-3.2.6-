import java.util.ArrayList;

public class Welcome03_List {

   public static void main(String[] args) {

      ArrayList<WeatherStation> allstns = new ArrayList<WeatherStation>();


      allstns.add(new WeatherStation("New York", "KNYC", "NY", 40.77, -73.98));
      allstns.add(new WeatherStation("Los Angeles", "KLAX", "CA", 33.94, -118.40));
      allstns.add(new WeatherStation("Chicago", "KORD", "IL", 41.98, -87.90));


      System.out.println("Total stations: " + allstns.size());

      WeatherStation westMost = allstns.get(0);

      for (WeatherStation ws : allstns) {
         if (ws.getLong() < westMost.getLong()) {
            westMost = ws;
         }
      }

      System.out.println("Farthest west station:");
      System.out.println("  " + westMost.getId() + ": " + westMost.getName() +
                         " (lat: " + westMost.getLat() +
                         ", long: " + westMost.getLong() + ")");
   }
}
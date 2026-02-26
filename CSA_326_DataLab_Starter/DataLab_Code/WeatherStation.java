/*
 Represents information about a NWS weather station
*/

public class WeatherStation {
    private String name;   // station name (ex: "Hartsfield-Jackson Atlanta Intl")
    private String id;     // station id (ex: "KATL")
    private String state;  // state abbreviation (ex: "GA")
    private double lat;    // latitude
    private double lng;    // longitude
   
   public WeatherStation(String name, String id, String state, double lat, double lng) { 
      this.name = name;
      this.id = id;
      this.lat = lat;
      this.lng = lng;
      this.state = state;   
   }
   
   /* Produce the id of this station */
   public String getId() { 
      return id;
   }
   
   /* Produce the name of this station */
   public String getName() { 
      return name;
   }
   
   /* Produce the longitude of this station */
   public double getLong() { 
      return lng;
   }
   
      /* Produce the latitude of this station */
   public double getLat() { 
      return lat;
   }
   
    /* Determine if this weather station is located in the given state */
    public boolean isLocatedInState(String st) {
        // Compares this station's state to the user's input state.
        
        return this.state.equals(st);
    }
}
public class DebugTrip
{
   private String destination;
   private String departure;
   private String mode;

   private static final String DEFAULT_CITY = "Atlanta";
   private static final String DEFAULT_MODE = "car";

   public DebugTrip(String destination)
   {
      this(destination, DEFAULT_CITY, DEFAULT_MODE);
   }

   public DebugTrip(String destination, String departure)
   {
      this(destination, departure, DEFAULT_MODE);
   }

   public DebugTrip(String destination, String departure, String mode)
   {
      this.destination = destination;
      this.departure = departure;
      this.mode = mode;
   }

   public String getDestination()
   {
      return destination;
   }

   public String getDepartureCity()
   {
      return departure;
   }

   public String getMode()
   {
      return mode;
   }

   public static void main(String[] args)
   {
      DebugTrip trip1 = new DebugTrip("Miami");
      DebugTrip trip2 = new DebugTrip("New York", "Chicago");
      DebugTrip trip3 = new DebugTrip("Los Angeles", "Dallas", "plane");
   
      System.out.println("Trip 1: " + trip1.getDepartureCity() + " to " + trip1.getDestination() + " by " + trip1.getMode());
      System.out.println("Trip 2: " + trip2.getDepartureCity() + " to " + trip2.getDestination() + " by " + trip2.getMode());
      System.out.println("Trip 3: " + trip3.getDepartureCity() + " to " + trip3.getDestination() + " by " + trip3.getMode());
   }
}

public class Droid {
  
    int batteryLevel;
    public Droid() {
      
      batteryLevel = 100;
      
    }
    
    public void activate() {
      
      System.out.println("Activated. How can I help you?");
      batteryLevel = batteryLevel - 5;
      System.out.println("Battery decreased to " + batteryLevel + "%");
      
    }
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

    public void chargeBattery(int hours) {
    
        batteryLevel = batteryLevel + hours; 
        if (batteryLevel > 100) {
            batteryLevel = 100;
      	    System.out.println("Battery Level is " + batteryLevel + "% Droid fully charged. Please disconnect.");
        }
        else {
          
          System.out.println("Droid is charging...");
          System.out.println("Battery Level is " + batteryLevel + "%");
          
        }
    }
}
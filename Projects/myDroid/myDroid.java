// This program imitates a very basic human behavior from a robot perspective.

public class myDroid {
  
    int batteryLevel;
    public Droid() {
    
        batteryLevel = 100;
    
  }
  
    public void turnOn() {
    
        System.out.println("Hello human, how can I help you?");
        batteryLevel = batteryLevel - 5;
    
  }
  
    public void chargeBattery(int hours) {
    
        batteryLevel = batteryLevel + hours; 
        if (batteryLevel > 100) {
            batteryLevel = 100;
      	    System.out.println("Battery Level is " + batteryLevel + "% Droid fully charged. Please disconnect.");
          
        }
        else {
          
          System.out.println("Droid is charging...");
          System.out.println("Battery level is " + batteryLevel + "%");
          
        }
    }
       
    public int checkBatteryLevel() {
       
        
      	if (batteryLevel < 30) {
          
            System.out.println("I'm about to die... Please charge me :( (" + batteryLevel + "%)");
          
        }
      	else {
          
            System.out.println("Battery is all good, don't you worry! (" + batteryLevel + "%)");
          
        }
      	return batteryLevel;
       
     }
      
     public void hover(int feet) {
         
         if (feet > 2) {
             System.out.println("Error! I cannot hover above 2 feet.");    
         }
         else {
           
           System.out.println("Hovering...");
           batteryLevel = batteryLevel - 20;
           
         }
     }
  
  	 public void turnOff() {
       
         System.out.println("See you! :)");
       
     }
     
     public static void main(String[] args) {
       
         Droid myDroid = new Droid();
       	 myDroid.turnOn();
         myDroid.chargeBattery(3);
       	 myDroid.hover(2);
         myDroid.checkBatteryLevel();
       	 myDroid.turnOff();  
     }
    }    
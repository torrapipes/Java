import java.util.ArrayList;

public class GradeAnalyzer {
  
    public GradeAnalyzer(){

    }

    public int getAverage(ArrayList<Integer> grades){
      
        if (grades.size() < 1) {
          
          System.out.println("Error! The ArrayList is empty.");

          return 0;
          
        }
        
        else{
          
          int sum = 0;
          
          for (Integer grade : grades) {
            
            sum = sum + grade;
            
          }
          
          int average = sum / grades.size();
          
          System.out.println(average);
          
          return average;
          
        }
        
      }

      public int getLowestGrade(ArrayList<Integer> grades) {
      
        int lowest = grades.get(0);
        
        if (grades.size() < 1) {
          
          System.out.println("Error! The ArrayList is empty.");
          
          return 0;
          
        }
        
        else {
          
          for (int i = 0; i < grades.size(); i++) {
            
            if (grades.get(i) < lowest) {
              
              lowest = grades.get(i);
              
            }
           
         }
         
         System.out.println(lowest);
          
        }
        
        return lowest;
        
      }

      public int getHighestGrade(ArrayList<Integer> grades) {
      
        int highest = grades.get(0);
        
        if (grades.size() < 1) {
          
          System.out.println("Error! The ArrayList is empty.");
          
          return 0;
          
        }
        
        else {
          
          for (int i = 0; i < grades.size(); i++) {
            
            if (grades.get(i) > highest) {
              
              highest = grades.get(i);
              
            }
           
         }
         
         System.out.println(highest);
          
        }
        
        return highest;
        
      }

      public static void main(String[] args)  {
      
        ArrayList<Integer> myClassroom = new ArrayList<Integer>();
        
        myClassroom.add(98);
        myClassroom.add(92);
        myClassroom.add(88);
        myClassroom.add(75);
        myClassroom.add(61);
        myClassroom.add(89);
        myClassroom.add(95);
        
        GradeAnalyzer myAnalyzer = new GradeAnalyzer();
        
        myAnalyzer.getAverage(myClassroom);

        myAnalyzer.getLowestGrade(myClassroom);

        myAnalyzer.getHighestGrade(myClassroom);
        
      }
  
}
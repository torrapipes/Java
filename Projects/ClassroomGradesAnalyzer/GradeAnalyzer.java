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
  
}
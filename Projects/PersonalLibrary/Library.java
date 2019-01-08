import java.util.HashMap;

public class Library{
  
  public Library(){
    
  }

  public void getFinishedBooks(HashMap<String, Boolean> myBooks){

    if (myBooks.size() < 1) {

        System.out.println("Error! HashMap is empty.");

    }

    else {
        
        for (String book : myBooks.keySets()) {

            if (myBooks.get(book) == true) {

                System.out.println(book);

            }

        }

    }

  }

  public static void main(Strings[] args) {

    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();

    

  }
  
}
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

    myBooks.put("El código Da Vincci", true);
    myBooks.put("Barrufet", true);
    myBooks.put("Los pilares de la tierra", false);
    myBooks.put("El señor de los anillos", false);
    myBooks.put("La canción de hielo y fuego", false);

    Library myLibrary = new Library();

    myLibrary.getFinishedBooks(myBooks);

  }
  
}
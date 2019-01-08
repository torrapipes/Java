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

    myBooks.add("El código Da Vincci", true);
    myBooks.add("Barrufet", true);
    myBooks.add("Los pilares de la tierra", false);
    myBooks.add("El señor de los anillos", false);
    myBooks.add("La canción de hielo y fuego", false);

    Library myLibrary = new Library;

  }
  
}
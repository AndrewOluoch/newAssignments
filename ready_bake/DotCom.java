package ready_bake;
import java.util.*;

public class DotCom {

    private ArrayList<String> locationCells; //an ArrayList of cell locations
    private String name; // the DotCom's name

    public void setLocationCells(ArrayList<String> loc) {
        // A setter method that updates the DotCom's location.
        locationCells = loc;
        // (Random location provided by the GameHelper placeDotCom() method)
    }

    public void setName(String n) { // Your basic setter method
        name = n;
    }

    public String checkYourself(String userInput){

        String result = "miss";
        int index = locationCells.indexOf(userInput);
 /*/ The ArrayList indexOf() method in action!
 If the user guess is one of the entries in the ArrayList, indexOf()
 will return its ArrayList location.  If not, indexOf() will return -1.
 */
        if(index >= 0) {
            locationCells.remove(index);
// Using ArrayList's remove() method to delete an entry

            if (locationCells.isEmpty()) {
// Using the isEmpty() method to see if all of the locations have been guessed
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "     : ( ");
// Tell the user when a DotCom has been sunk
            } else {
                result = "hit";
            }
        }
        return result; // Return: 'miss' or 'hit' or 'kill'
    } // end method
} // close class
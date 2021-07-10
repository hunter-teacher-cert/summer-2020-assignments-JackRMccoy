import java.io.*;
import java.util.*;

public class PhoneBook {

  private ArrayList<Person>[] patriotsBook;

  public PhoneBook() {
    patriotsBook = new ArrayList[53]; //53 since a football team can only have 53 active players during the season
  }

  public void add(Person player) {
    // creates the hash index based on last name
		int index = hash(player.getLastName());
		if (patriotsBook[index] == null) {
			patriotsBook[index] = new ArrayList<Person>();
		} 
		// add the Player to the ArrayList at a given index
		patriotsBook[index].add(player); // adds the player to end of ArrayList at index
  }

  public ArrayList<Person> find(String lastName){
    ArrayList<Person> lastNames = new ArrayList();
		int index = hash(lastName);
		// Goes through the ArrayList at given hash index of theBook looking for right player
		for (Person fbp : patriotsBook[index]) {
			// if the lastName matches, return that Player's info
			if (fbp.getLastName().equals(lastName)) {
				lastNames.add(fbp);
			}
		}
		return lastNames;
  }

  public void remove(Person player){
    int index = hash(player.getLastName());
		// Goes through the ArrayList at given hash index of theBook looking for right player
		for (int i = 0; i < patriotsBook[index].size(); i++) {
			// if the player is found remove the player's information
			if (patriotsBook[index].get(i).equals(player)) {
				patriotsBook[index].remove(i);
				return;
			}
		}
  }

  //prints the current roster of players with first name, last name and number
  public void printList() {
		String roster = "";
		for (int i = 0; i < patriotsBook.length; i++) {
			if (patriotsBook[i] != null) {
				for (Person fbp : patriotsBook[i]) {
					if (!roster.contains(fbp.toString())) {
						roster += fbp + "\n";
          }
				}
			}
		}
		System.out.println(roster);

	}

  // Creates a hash index given the player's lastname (mod 53 for the 53 man roster)
	private int hash(String lastName) {
		int sum = 0;
		int i = 0;
    while (i < lastName.length()) {
			sum += lastName.charAt(i);
      i++;
		}
		return sum % 53;
	}

}

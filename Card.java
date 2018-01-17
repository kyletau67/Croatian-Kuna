import java.util.Map;
import java.util.HashMap;  //import mapping libraries

public class Card {

    public String suit;  //stores the suit of each card
    public int val;   //stores value of each card
    
    public Card(int key) {
	Cardkeys k = new Cardkeys();  //instantiate new object of cardkeys
	k.makeDeck();                //make a deck of the mapped cards
	String str = (String)k.get(key);  //creates a String version of the name of the card with a certain key
	//System.out.println(str);  tests whether the key is correct
	suit = str.substring(str.length()-1);  //suit is equal to the last word (ex. 2 of Diamonds)
	if (key % 13 == 9) {  //set the value for Tens
	    val = 10;
	}
	else {
	    try {
		val = Integer.parseInt(str.substring(0,1));  //try to set the val to the first substring of the name (ex. the 2 in 2 of diamonds)
	    }
	    catch (NumberFormatException e) {
		if (str.substring(0,1).equals("J")) {  //if the card is a face card, individually assign their values
		    val = 11;
		}
		else if (str.substring(0,1).equals("Q")) {
		    val = 12;
		}
		else if (str.substring(0,1).equals("K")) {
		    val = 13;
		}
		else {
		    val = 14;
		}
	    }
	}
    }

    public int compareTo(int i) {  //a new compareTo for card class
	return this.val - i;
    }

    public static void main(String[] args) {  //testing instantiation 
	Card TwoOfD = new Card(1);
	System.out.println(TwoOfD.suit);
	Card JackOfD = new Card(10);
	System.out.println(JackOfD.suit);
	System.out.println(JackOfD.val);
	Card AceOfD = new Card(13);
	System.out.println(AceOfD.val);
	Card TenOfD = new Card(9);
	System.out.println(TenOfD.val);
	Card TenOfC = new Card(22);
	System.out.println(TenOfC.val);
    }
}

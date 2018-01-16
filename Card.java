import java.util.Map;
import java.util.HashMap;

public class Card {

    public String suit;
    public Object val;
    
    public Card(int key) {
	Cardkeys k = new Cardkeys();
	k.makeDeck();
	String str = (String)k.get(key);
	suit = str.substring(str.length()-1);
	if (key % 13 == 9) {
	    val = 10;
	}
	else {
	    try {
		val = Integer.parseInt(str.substring(0,1));
	    }
	    catch (NumberFormatException e) {
		val = str.substring(0,1);
	    }
	}
    }

    public static void main(String[] args) {
	Card TwoOfD = new Card(1);
    }
}

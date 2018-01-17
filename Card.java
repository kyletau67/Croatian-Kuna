import java.util.Map;
import java.util.HashMap;

public class Card {

    public String suit;
    public int val;
    
    public Card(int key) {
	Cardkeys k = new Cardkeys();
	k.makeDeck();
	String str = (String)k.get(key);
	System.out.println(str);
	suit = str.substring(str.length()-1);
	int suitM = 0;
	if (suit.equals("C")) {
	    suitM = 1;
	}
	if (suit.equals("H")) {
	    suitM = 2;
	}
	if (suit.equals("S")) {
	    suitM = 3;
	}
	if (key % 13 == 9) {
	    val = 10 + (suitM * 13);
	}
	else {
	    try {
		val = Integer.parseInt(str.substring(0,1));
	    }
	    catch (NumberFormatException e) {
		if (str.substring(0,1).equals("J")) {
		    val = 11 + (suitM * 13);
		}
		else if (str.substring(0,1).equals("Q")) {
		    val = 12 + (suitM * 13);
		}
		else if (str.substring(0,1).equals("K")) {
		    val = 13 + (suitM * 13);
		}
		else {
		    val = 14 + (suitM * 13);
		}
	    }
	}
    }

    public int compareTo(int i) {
	return this.val - i;
    }

    public static void main(String[] args) {
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

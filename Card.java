import java.util.Map;
import java.util.HashMap;

public class Card {

    public String suit;
    public int val;
    
    public Card(int key) {
	Cardkeys k = new Cardkeys();
	String str = k.get(key);
	suit = str.substring(str.length()-1);
	if (key % 13 == 9) {
	    val = 10;
	}
	else {
	    val = Integer.parseInt(str.substring(0,1));
	}
    }

    public static void main(String[] args) {
       
    }
}

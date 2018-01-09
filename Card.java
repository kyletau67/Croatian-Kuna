import java.util.Map;
import java.util.HashMap;

public class Card implements Cardkeys{

    public String suit;
    public int val;
    
    public Card(int key) {
	String str = Card.get(key);
	suit = str.substring(str.length()-1);
	if (key % 13 == 9) {
	    val = 10;
	}
	else {
	    val = Integer.parseInt(str.substring(0,1));
	}
    }
    public String get(int key) {
	
    }
    public static void main(String[] args) {
    }
}

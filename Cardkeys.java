import java.util.Map;
import java.util.HashMap;

public class Cardkeys {
    public Cardkeys() {
	Map cards = new HashMap();

	for (int count = 1; count < 53; count++) {
	    cards.put(count, stringify(count));
	}

	for (Object key: cards.keySet())
	    System.out.println(key + " - " + cards.get(key)); }
    public static String stringifyS(int c) {
	String str = "";
	double suit = c / 13.0;
	if (suit <= 1) {
	    str += "D"; }
	else if (suit <= 2) {
	    str += "C"; }
	else if (suit <= 3) {
	    str += "H"; }
	else {
	    str += "S"; }
	return str;
    }
    public static String stringifyV(int c) {
	String str = "";
	int val = c % 13;
	if (val == 0) {
	    str += "A"; }
	else if (val < 10) {
	    str += val + 1;
	}
	else {
	    if (val == 10) {
		str += "J"; }
	    else if (val == 11) {
		str += "Q"; }
	    else if (val == 12) {
		str += "K"; } 
	}
	return str;}
	
    public static String stringify(int c) {
	return stringifyV(c) + " of " + stringifyS(c);
    }

    public static void main(String[] args) {
	/*Map cards = new HashMap();

	  for (int count = 1; count < 53; count++) {
	  cards.put(count, stringify(count));
	  }

	  for (Object key: cards.keySet())
	  System.out.println(key + " - " + cards.get(key));*/
    }

    //public abstract String get(int k);
    
}

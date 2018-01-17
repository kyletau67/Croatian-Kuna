import java.util.Map;
import java.util.HashMap;

public class Cardkeys {
    //public Cardkeys() {
    static Map ck = new HashMap();  //create mapkeys
    public static Map cards = ck;
    
    public static String stringifyS(int c) {  //changes the suit of the card into a string based on its key
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
    public static String stringifyV(int c) {  //changes the value of the card into a String based on its key
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
	
    public static String stringify(int c) {  //names each card by their value and suit
	return stringifyV(c) + " of " + stringifyS(c);
    }

    public static void makeDeck() {  //puts each individual card and their name into a map of cards
	for (int count = 1; count < 53; count++) {
	    cards.put(count, stringify(count));
	}
    }
    
    public static Object get(int k) {  //returns that card from the map
	return cards.get(k);
    }
    
    public static void main(String[] args) {  //tests the class by printing all the cards placed into the deck
	makeDeck();
	for (Object key: cards.keySet())
	    System.out.println(key + " - " + cards.get(key));
    }


    
}

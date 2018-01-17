import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

/* Deck.java contains an ArrayList that holds all the 52 cards. It also has a deck resetting method that will clear the arraylist and add in a fresh set of 52 cards*/
public class Deck {
    public static ArrayList<Card> deck = new ArrayList<Card>();
    public static Card c1 = new Card(1);
    public static Card c2 = new Card(2); 
    public static Card c3 = new Card(3);
    public static Card c4 = new Card(4);
    public static Card c5 = new Card(5);
    public static Card c6 = new Card(6);
    public static Card c7 = new Card(7);
    public static Card c8 = new Card(8);
    public static Card c9 = new Card(9);
    public static Card c10 = new Card(10);
    public static Card c11 = new Card(11);
    public static Card c12 = new Card(12);
    public static Card c13 = new Card(13);
    public static Card c14 = new Card(14);
    public static Card c15 = new Card(15);
    public static Card c16 = new Card(16);
    public static Card c17 = new Card(17);
    public static Card c18 = new Card(18);
    public static Card c19 = new Card(19);
    public static Card c20 = new Card(20);
    public static Card c21 = new Card(21);
    public static Card c22 = new Card(22);
    public static Card c23 = new Card(23);
    public static Card c24 = new Card(24);
    public static Card c25 = new Card(25);
    public static Card c26 = new Card(26);
    public static Card c27 = new Card(27);
    public static Card c28 = new Card(28);
    public static Card c29 = new Card(29);
    public static Card c30 = new Card(30);
    public static Card c31 = new Card(31);
    public static Card c32 = new Card(32);
    public static Card c33 = new Card(33);
    public static Card c34 = new Card(34);
    public static Card c35 = new Card(35);
    public static Card c36 = new Card(36);
    public static Card c37 = new Card(37);
    public static Card c38 = new Card(38);
    public static Card c39 = new Card(39);
    public static Card c40 = new Card(40);
    public static Card c41 = new Card(41);
    public static Card c42 = new Card(42);
    public static Card c43 = new Card(43);
    public static Card c44 = new Card(44);
    public static Card c45 = new Card(45);
    public static Card c46 = new Card(46);
    public static Card c47 = new Card(47);
    public static Card c48 = new Card(48);
    public static Card c49 = new Card(49);
    public static Card c50 = new Card(50);
    public static Card c51 = new Card(51);
    public static Card c52 = new Card(52);

    public static void resetDeck() {
       	deck.clear();
        deck.add(c1);
	deck.add(c2);
        deck.add(c3);
        deck.add(c4);
        deck.add(c5);
        deck.add(c6);
        deck.add(c7);
        deck.add(c8);
        deck.add(c9);
        deck.add(c10);
        deck.add(c11);
        deck.add(c12);
        deck.add(c13);
        deck.add(c14);
        deck.add(c15);
        deck.add(c16);
        deck.add(c17);
        deck.add(c18);
        deck.add(c19);
        deck.add(c20);
        deck.add(c21);
        deck.add(c22);
        deck.add(c23);
        deck.add(c24);
        deck.add(c25);
        deck.add(c26);
        deck.add(c27);
        deck.add(c28);
        deck.add(c29);
        deck.add(c30);
        deck.add(c31);
        deck.add(c32);
        deck.add(c33);
        deck.add(c34);
        deck.add(c35);
        deck.add(c36);
        deck.add(c37);
        deck.add(c38);
        deck.add(c39);
        deck.add(c40);
        deck.add(c41);
        deck.add(c42);
        deck.add(c43);
        deck.add(c44);
        deck.add(c45);
        deck.add(c46);
        deck.add(c47);
        deck.add(c48);
        deck.add(c49);
        deck.add(c50);
	deck.add(c51);
	deck.add(c52);
	//System.out.println(deck);
    }

    public static ArrayList<Card> getDeck() {
	return deck;
    }
    
    public static void main(String[] args) {
	resetDeck();
	for (Object o: deck) {
	    System.out.println(o);
	}
    }
}

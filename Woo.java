import java.util.Scanner;
import java.util.ArrayList;

public class Woo {
    public static ArrayList<Card> table = new ArrayList<Card>();
    public static double bet;
    public static double pot;
    public static Player p1 = new Player();
    static Scanner sc1 = new Scanner(System.in);
    public static ArrayList<Card> comHand = new ArrayList<Card>();
    public static int comHandType;
    public static int pHandType; 
    
    public static void deal() {
      	int deal = (int) (Math.random() * (Deck.getDeck().size() + 1));
       	p1.addHand(deal); 
    } //passes out cards from deck.java to table and hand of player
    public static void displayTable() {
	for (Card t: table) {
	    if (t.suit == "D") {
		if (t.val == 13 ) {
		    System.out.print("\u2666" + "K ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2666" + "A ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2666" + "Q");
		}
	       	else if (t.val == 11) {
		    System.out.print("\u2666" + "J ");
		}
		else {
		    System.out.print("\u2666" + t.val + " ");
	        }
	    }
	    else if (t.suit == "C") {
		if (t.val == 13) {
		    System.out.print("\u2663" + "K ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2663" + "A ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2663" + "Q");
		}
		else if (t.val == 11) {
		    System.out.print("\u2663" + "J ");
		}
		else {
		    System.out.print("\u2663" + t.val + " ");
		}
	    }
	    else if (t.suit == "H") {
		if (t.val == 13) {
		    System.out.print("\u2764" + "K ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2764" + "A ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2764" + "Q");
		}
		else if (t.val == 11) {
		    System.out.print("\u2764" + "J ");
		}
		else {
		    System.out.print("\u2764" + t.val + " ");
		}
	    }
	    else {
		if (t.val == 13) {
		    System.out.print("\u2660" + "K ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2660" + "A ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2660" + "Q");
		}
		else if (t.val == 11) {
		    System.out.print("\u2660" + "J ");
		}
		else {
		    System.out.print("\u2660" + t.val + " ");
		}
	    }
	}
	System.out.println();
    } //prints the table
    public static void displayHand() {
	for (Card h: p1.hand) {
	    if (h.suit == "D") {
		if (h.val == 13) {
		    System.out.print("\u2666" + "K ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2666" + "A ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2666" + "Q");
		}
		else if (h.val == 11) {
		    System.out.print("\u2666" + "J ");
		}
		else {
		    System.out.print("\u2666" + h.val + " ");
		}
	    }
	    else if (h.suit == "C") {
		if (h.val == 13) {
		    System.out.print("\u2663" + "K ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2663" + "A ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2663" + "Q");
		}
		else if (h.val == 11) {
		    System.out.print("\u2663" + "J ");
		}
		else {
		    System.out.print("\u2663" + h.val + " ");
		}
	    }
	    else if (h.suit == "H") {
		if (h.val == 13) {
		    System.out.print("\u2764" + "K ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2764" + "A ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2764" + "Q");
		}
		else if (h.val == 11) {
		    System.out.print("\u2764" + "J ");
		}
		else {
		    System.out.print("\u2764" + h.val + " ");
		}
	    }
	    else {
		if (h.val == 13) {
		    System.out.print("\u2660" + "K ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2660" + "A ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2660" + "Q");
		}
		else if (h.val == 11) {
		    System.out.print("\u2660" + "J ");
		}
		else {
		    System.out.print("\u2660" + h.val + " ");
		}
	    }
	}
	System.out.println();
    } //prints the hand
    public static void bet() {
	bet = Integer.parseInt(sc1.next());
    }
    public static void call() {
	pot += 100.0;    //set player bet to comp's bet
    }
    public static void raise() {
	bet = Integer.parseInt(sc1.next());  //set the bet to user input
	pot += bet;  
    }
    public static void comCall() {
	pot += bet; //add another amt of bet to the pot 
    }
    public static void comRaise() {
	pot += 100.0;
    }
    public static void fold() {
	//lose();
    }
    // public static void comTurn() {
    //	if 
    //}
    public static void playTurn() {
	deal();
	displayTable();
	displayHand();
	System.out.println("(1) Call\n(2) Raise\n(3) Fold");
	if (sc1.next() == "1") {
	    call(); }
	else if (sc1.next() == "2") {
	    System.out.println("How much would you like to raise?");
	    raise(); }
	else if (sc1.next() == "3") {
	    fold(); }
	//comTurn();
    }


    public static Card retGet(ArrayList<Card> hand, int i) {
	return hand.get(hand.size()-i);
    }
    
    public static boolean straight(ArrayList<Card> hand) {
	for (int x = 0; x < hand.size(); x++) {
	    if (!(((retGet(hand, x).val) - (retGet(hand, x+1).val)) == 1)) {
		return false; }
	}  
	return true;
    }
    
    public static boolean fourOfAKind(ArrayList<Card> hand) {
	for (int x = 0; x < hand.size()-3; x++) {
	    if (!(retGet(hand, x).val == retGet(hand, x+1).val && retGet(hand, x+1).val == retGet(hand, x+2).val && retGet(hand, x+2).val == retGet(hand, x+3).val)) {
		return false;
	    }
	}
	return true;
    }

    public static boolean threeOfAKind(ArrayList<Card> hand) {
	for (int x = 0; x < hand.size()-2; x++) {
	    if (!(retGet(hand, x).val == retGet(hand, x+1).val && retGet(hand, x+1).val == retGet(hand, x+2).val)) {
		return false;
	    }
	}
	return true;
    }


    public static boolean highCard(ArrayList<Card> hand) {
	if (!(straight(hand)) && !(fourOfAKind(hand)) && !(threeOfAKind(hand)) && !(twoPair(hand)) && !(pair(hand)) && !(flush(hand)) && !(fullHouse(hand))) {
	    return true;
	}
	else {
	    return false;
      	}
    }

    public static boolean straightFlush(ArrayList<Card> hand) {
	if (straight(hand) && flush(hand)) {
	    return true;
	}
	else {
	    return false;
	}
    }


    public static boolean royalFlush(ArrayList<Card> hand) {
	boolean ret = false;
	for (int x = 0; x < hand.size()-5; x++) {
	    if (straightFlush(hand) && retGet(hand, x).val == 10) {
		return true;
	    }
	}
	return ret;
    }

    public static boolean twoPair(ArrayList<Card> hand) {
	int  count = 0;
	for (int x = 0; x < hand.size() - 1; x++) {
	    if (( hand.get(x).val) == (hand.get(x+1).val)) {
		count += 1; 
	    }
	}
	if (count == 2) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public static boolean pair(ArrayList<Card> hand) {
	int  count = 0;
	for (int x = 0; x < hand.size() - 1; x++) {
	    if (( hand.get(x).val) == (hand.get(x+1).val)) {
		count += 1; 
	    }
	}
	if (count == 1) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public static boolean fullHouse(ArrayList<Card> hand) {
        
        int thisVal = -1; 
	for (int x = 0; x < hand.size()-2; x++) {
	    if (!(retGet(hand, x).val == retGet(hand, x+1).val && retGet(hand, x+1).val == retGet(hand, x+2).val)) {
                thisVal = retGet(hand, x).val;
		return false;
	    }
	}

	ArrayList<Card> tmpHand = new ArrayList<Card>();
        for (int x =0; x < hand.size(); x++) {
	    if ( retGet(hand, x).val != thisVal) {
		tmpHand.add(retGet(hand, x));
	    }
	}

	return pair(tmpHand);
    }


    public static boolean flush(ArrayList<Card> hand) {
	int matchCount = 0;
	for (int x = 0; x < hand.size(); x++) {
	    for (int b = x + 1; b < hand.size(); b++) {
		if (retGet(hand, x).suit.equals( retGet(hand, b).suit)) {
		    matchCount++;
		}
	    }
        }
	    return matchCount >= 5;
    }
    

    public static int findHandType(ArrayList<Card> all) {
	//sort first
	for( int partition = 1; partition < all.size(); partition++ ) {
	    //System.out.println( all ); 
	    for( int i = partition; i > 0; i-- ) {
		if ((all.get(i)).compareTo(all.get(i-1).val) < 0) {
		    all.set( i, all.set( i-1, all.get(i) ) ); 
		}
		else {
		    break;
		}
	    }
	}
	//distinguish type of hand
        if (royalFlush(all)) {
	    return 10; }
	else if (straightFlush(all)) {
	    return 9; }
	else if (fourOfAKind(all)) {
	    return 8; }
	else if (fullHouse(all)) {
	    return 7; }
	else if (flush(all)) {
	    return 6; }
	else if (straight(all)) {
	    return 5; }
	else if (threeOfAKind(all)) {
	    return 4; }
	else if (twoPair(all)) {
	    return 3; }
	else if (pair(all)) {
	    return 2; }
	else {
	    return 1; }
    }

    public static void main(String[] args) {
	int table1 = (int) (Math.random() * (Deck.deck.size() + 1));
	table.add(Deck.deck.get(table1));
	comHand.add(Deck.deck.get(table1));
	Deck.deck.remove(table1);
	int table2 = (int) (Math.random() * (Deck.deck.size() + 1));
	table.add(Deck.deck.get(table2));
	comHand.add(Deck.deck.get(table2));
	Deck.deck.remove(table2);
	System.out.println("Hello, "+p1.name+". Your balance is 10000. Let's Play Texas Hold Em!");
	while (p1.balance > 0) {
	    playTurn();
	}
    }
}

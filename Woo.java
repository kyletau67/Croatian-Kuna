import java.util.Scanner;
import java.util.ArrayList;

public class Woo {
    public static ArrayList<Card> table = new ArrayList<Card>(); //cards on the table
    public static double bet;  //stores the amount you are betting
    public static double pot;  //stores the total amount you and the comp are betting
    public static Player p1 = new Player(); //create a new player to start the game
    static Scanner sc1 = new Scanner(System.in);  //takes in user input for bet
    public static ArrayList<Card> comHand = new ArrayList<Card>();  //hand of the computer
    public static int comHandType;  //what type of hand comp has
    public static int pHandType;   //what type of hand you have
    
    public static void deal() {  //deals out the card into both hands and the table and remove it from deck
      	int deal = (int) (Math.random() * (Deck.getDeck().size()));
	table.add(Deck.deck.get(deal));
	comHand.add(Deck.deck.get(deal));
	p1.addAll(deal);
    } //passes out cards from deck.java to table and hand of player
    public static void displayTable() {  //prints out the display of the table
       	System.out.println("\n");
	System.out.print("Table:   ");
	for (Card t: table) {
	    if (t.suit.equals("D")) {
		if (t.val == 13 ) {
		    System.out.print("\u2666" + "K  ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2666" + "A  ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2666" + "Q  ");
		}
	       	else if (t.val == 11) {
		    System.out.print("\u2666" + "J  ");
		}
		else {
		    System.out.print("\u2666" + t.val + "  ");
	        }
	    }
	    else if (t.suit.equals("C")) {
		if (t.val == 13) {
		    System.out.print("\u2663" + "K  ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2663" + "A  ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2663" + "Q  ");
		}
		else if (t.val == 11) {
		    System.out.print("\u2663" + "J  ");
		}
		else {
		    System.out.print("\u2663" + t.val + "  ");
		}
	    }
	    else if (t.suit.equals("H")) {
		if (t.val == 13) {
		    System.out.print("\u2764" + "K  ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2764" + "A  ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2764" + "Q  ");
		}
		else if (t.val == 11) {
		    System.out.print("\u2764" + "J  ");
		}
		else {
		    System.out.print("\u2764" + t.val + "  ");
		}
	    }
	    else {
		if (t.val == 13) {
		    System.out.print("\u2660" + "K  ");
		}
		else if (t.val == 14) {
		    System.out.print("\u2660" + "A  ");
		}
		else if (t.val == 12) {
		    System.out.print("\u2660" + "Q  ");
		}
		else if (t.val == 11) {
		    System.out.print("\u2660" + "J  ");
		}
		else {
		    System.out.print("\u2660" + t.val + "  ");
		}
	    }
	}
	System.out.println();
    } //prints the table
    

    public static void displayHand() {  //prints out the hand  
       	System.out.println("\n");
	System.out.print("Hand:   ");
	for (Card h: p1.hand) {
	    if (h.suit.equals("D")) {
		if (h.val == 13) {
		    System.out.print("\u2666" + "K  ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2666" + "A  ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2666" + "Q  ");
		}
		else if (h.val == 11) {
		    System.out.print("\u2666" + "J  ");
		}
		else {
		    System.out.print("\u2666" + h.val + "  ");
		}
	    }
	    else if (h.suit.equals("C")) {
		if (h.val == 13) {
		    System.out.print("\u2663" + "K  ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2663" + "A  ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2663" + "Q  ");
		}
		else if (h.val == 11) {
		    System.out.print("\u2663" + "J  ");
		}
		else {
		    System.out.print("\u2663" + h.val + "  ");
		}
	    }
	    else if (h.suit.equals("H")) {
		if (h.val == 13) {
		    System.out.print("\u2764" + "K  ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2764" + "A  ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2764" + "Q  ");
		}
		else if (h.val == 11) {
		    System.out.print("\u2764" + "J  ");
		}
		else {
		    System.out.print("\u2764" + h.val + "  ");
		}
	    }
	    else {
		if (h.val == 13) {
		    System.out.print("\u2660" + "K  ");
		}
		else if (h.val == 14) {
		    System.out.print("\u2660" + "A  ");
		}
		else if (h.val == 12) {
		    System.out.print("\u2660" + "Q  ");
		}
		else if (h.val == 11) {
		    System.out.print("\u2660" + "J  ");
		}
		else {
		    System.out.print("\u2660" + h.val + "  ");
		}
	    }
	}
	System.out.println();
    } //prints the hand
    
    public static void bet() {  //method to choose how much you bet
	String num = sc1.next();
	bet = Integer.parseInt(num);
	pot += bet;
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
	System.out.println("Computer calls");
    }
    public static void comRaise() {  //computer raises the bet and you have to decide to match or not match it
	pot += 100.0;
	System.out.println("Computer raises $100\nMatch?\n (1) Yes (2) No");
	if (sc1.next() == "1") {
	    call(); }
	else {
	    fold();}
	
    }
    public static void comFold() {  //comp gives up
	System.out.println("Computer folds.");
	win();
    }
    public static void fold() {  //you give up
	System.out.println("You lost " + bet);
	lose();
    }
    public static void win() {  //adds money to your balance when you win and resets variables
	p1.balance += pot;
	System.out.println("You won $$$.");
	pot = 0;
	bet = 0;
	System.out.println("Your $$: " + p1.balance);
    }
    public static void lose() {  //subtract money from your balance 
	p1.balance -= bet;
	System.out.println("You lost $$$.");
	pot = 0;
	bet = 0;
	System.out.println("Your $$: " + p1.balance);
    }
    public static void comTurn() {   //actions that the computer will randomly take
	comHandType = findHandType(comHand);
	if (comHandType > 5) {
	    comRaise(); }
	else if (comHandType > 3) {
	    comCall(); }
	else {
	    if (Math.random() > 0.6) {
		comCall(); }
	    else {
		comFold(); }
	}
    }
    public static void playTurn() {  //dictates the flow of the game
	deal();
	displayTable();
	displayHand();
	System.out.println("(1) Bet\n(2) Raise\n(3) Fold");
	String response = sc1.next();
	if (response == "1") {
	    bet(); }
	else if (response == "2") {
	    System.out.println("How much would you like to raise?");
	    raise(); }
	else if (response == "3") {
	    fold(); }
	comTurn();
    }


    public static Card retGet(ArrayList<Card> hand, int i) {  
	return hand.get(hand.size()-i-1);
    }
    
    public static boolean straight(ArrayList<Card> hand) {  //checks for straight hand
	for (int x = 0; x < hand.size()-1; x++) {
	    if (!(((retGet(hand, x).val) - (retGet(hand, x+1).val)) == 1)) {
		return false; }
	}  
	return true;
    }
    
    public static boolean fourOfAKind(ArrayList<Card> hand) {  //checks for 4 of a kind hand
	for (int x = 0; x < hand.size()-3; x++) {
	    if ((retGet(hand, x).val == retGet(hand, x+1).val && retGet(hand, x+1).val == retGet(hand, x+2).val && retGet(hand, x+2).val == retGet(hand, x+3).val)) {
		return true;
	    }
	}
	return false;
    }

    public static boolean threeOfAKind(ArrayList<Card> hand) {  //checks for 3 of a kind hand
	for (int x = 0; x < hand.size()-2; x++) {
	    if (!(retGet(hand, x).val == retGet(hand, x+1).val && retGet(hand, x+1).val == retGet(hand, x+2).val)) {
		return false;
	    }
	}
	return true;
    }


    public static boolean highCard(ArrayList<Card> hand) {  //checks for highcard hand
	if (!(straight(hand)) && !(fourOfAKind(hand)) && !(threeOfAKind(hand)) && !(twoPair(hand)) && !(pair(hand)) && !(flush(hand)) && !(fullHouse(hand))) {
	    return true;
	}
	else {
	    return false;
      	}
    }

    public static boolean straightFlush(ArrayList<Card> hand) {  //checks for straight flush hand
	if (straight(hand) && flush(hand)) {
	    return true;
	}
	else {
	    return false;
	}
    }


    public static boolean royalFlush(ArrayList<Card> hand) { //checks for royal flush hand
	boolean ret = false;
	for (int x = 0; x < hand.size()-5; x++) {
	    if (straightFlush(hand) && retGet(hand, x).val == 10) {
		return true;
	    }
	}
	return ret;
    }

    public static boolean twoPair(ArrayList<Card> hand) {  //checks for 2 pair hand
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

    public static boolean pair(ArrayList<Card> hand) {  //checks for one pair hand
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

    public static boolean fullHouse(ArrayList<Card> hand) {  //checks for a full house hand
        
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


    public static boolean flush(ArrayList<Card> hand) {  //checks for a flush hand
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
    

    public static int findHandType(ArrayList<Card> all) {  //finds what type of hand you have
	//sort first
	for( int partition = 1; partition < all.size(); partition++ ) {
	    for( int i = partition; i > 0; i-- ) {
		if ((all.get(i)).compareTo(all.get(i-1).val) < 0) {
		    all.set( i, all.set( i-1, all.get(i) ) ); 
		}
		else {
		    break;
		}
	    }
	}
	
	
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

    public static String getHandType(int handType) {
	if (handType == 10) return("Royal Flush");
	if (handType == 9) return("Straight Flush");
	if (handType == 8) return("Four of a Kind");
	if (handType == 7) return("Full House");
	if (handType == 6) return("Flush");
	if (handType == 5) return("Straight");
	if (handType == 4) return("Three of a Kind");
	if (handType == 3) return("Two Pair");
	if (handType == 2) return("Pair");
	if (handType == 1) return("High Card");
	return("");
    }
    
    public static void compare() {  //compare your final hand to comp's final hand to find winner
	System.out.println("Final Comparisons!");
	System.out.println("Computer had: " + getHandType(comHandType));

	p1.all.add(table.get(0));
	p1.all.add(table.get(1));
	
	pHandType = findHandType(p1.all);
	System.out.println("You had: " + getHandType(pHandType));
	if (pHandType > comHandType) {
	    win(); }
	else if (pHandType < comHandType) {
	    lose(); }
	else {
	    lose(); }//subject to change, if we actually want to compare
    }
    public static void main(String[] args) {  //runs the whole game
	int table1 = (int) (Math.random() * (Deck.deck.size()));
	table.add(Deck.deck.get(table1));
	comHand.add(Deck.deck.get(table1));
	Deck.deck.remove(table1);
	int table2 = (int) (Math.random() * (Deck.deck.size()));
	table.add(Deck.deck.get(table2));
	comHand.add(Deck.deck.get(table2));
	Deck.deck.remove(table2);

	int com1  = (int) (Math.random() * (Deck.deck.size()));
	comHand.add(Deck.deck.get(com1));
	Deck.deck.remove(com1);
	int com2  = (int) (Math.random() * (Deck.deck.size()));
	comHand.add(Deck.deck.get(com2));
	Deck.deck.remove(com2);

	System.out.println("Hello, "+p1.name+". Your balance is 10000. Let's Play Texas Hold Em!");
	while ((p1.balance > 0)&&(table.size() < 5)&&table.size()>0) {
	    playTurn();
	}
	compare();
	
	table.clear();
	p1.hand.clear();
	comHand.clear();
    }
}

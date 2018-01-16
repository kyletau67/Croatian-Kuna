import java.util.Scanner;
import java.util.ArrayList;

public class Woo {
    public static ArrayList<Comparable> table;
    public static double bet;
    public static double pot;
    static Player p1 = new Player();
    static Scanner sc1 = new Scanner(System.in);
    public static ArrayList<Comparable> comHand;
    public static String handType;
    
    public static void deal() {
      	int deal = (int) (Math.random() * (Deck.getDeck().size() + 1));
       	p1.addHand(deal); 
    } //passes out cards from deck.java to table and hand of player
    public static void displayTable() {
    } //prints the table
    public static void displayHand() {
    } //prints the hand
    public static void bet() {
	bet = sc1.next();
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


    public boolean straight() {
	 if( for (int x = 0; x < all.size(); x++) {
		 (((Card)all.get(all.size()-x)).value - ((Card)all.get(all.size()-(x+1))).value == 1);
	     }
	     ) {
	     return true;
	 }
    }
    public boolean fourOfAKind() {
	 if( for (int x = 0; x < all.size()-3; x++) {
		 if (!((Card)all.get(x).value) == ((Card)all.get(x+1).value) == ((Card)all.get(x+2).value) == ((Card)all.get(x+3).value)) {
		     break;
		 }
	     }
	     ) {
	     return true;
	 }
    }

    public boolean threeOfAKind() {
	 if ( for (int x =0; x < all.size()-2; x++) {
		 if (!((Card)all.get(x).value) == ((Card)all.get(x+1).value) == ((Card)all.get(x+2).value)) {
		     break;
		 }
	     }
	     ) {
	     return true;
	 }
    }

    

    public static void findHandType(ArrayList<Comparable> all) {
	all = comHand;
	//sort first
	for( int partition = 1; partition < all.size(); partition++ ) {
	    //System.out.println( all ); 
	    for( int i = partition; i > 0; i-- ) {
		if ((all.get(i)).compareTo(all.get(i-1)) < 0) {
		    all.set( i, all.set( i-1, all.get(i) ) ); 
		}
		else {
		    break;
		}
	    }
	}
	//distinguish type of hand
	}
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

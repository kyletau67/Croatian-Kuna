import java.util.Scanner;
import java.util.ArrayList;

public class Woo {
    public ArrayList<Comparable> table;
    public double bet;
    public double pot;
    static Player p1 = new Player();

    public static void deal() {
      	int deal = (int) (Math.random() * (Deck.getDeck().size() + 1));
       	p1.addHand(deal); 
    } //passes out cards from deck.java to table and hand of player
    public static void displayTable() {
    } //prints the table
    public static void displayHand() {
    } //prints the hand
    public static void call() {
	bet = comp.bet;    //set player bet to comp's bet
	pot = bet * 2; //money on the table = both your bet's
    }
    public static void raise() {
	bet = sc1.next();  //set the bet to user input
	pot = bet + comp.bet;  //comp.bet is computer's bet, subject to change
    }
    public static void fold() {
	lose();
    }
    public static void playTurn() {
        deal();
	displayTable();
	displayHand();
	System.out.println("(1) Call\n(2) Raise\n(3) Fold");
	
    }
    
    public static void main(String[] args) {
	System.out.println("Hello, "+p1.name+". Your balance is 10000. Let's Play Texas Hold Em!");
	while (p1.balance > 0) {
	    playTurn();
	}
    }
}

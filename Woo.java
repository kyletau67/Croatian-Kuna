import java.util.Scanner;

public class Woo {
    public ArrayList<Comparable> table;

    public static void deal() {
    } //passes out cards from deck.java to table and hand of player
    public static void displayTable() {
    } //prints the table
    public static void displayHand() {
    } //prints the hand
    public static void playTurn() {
        deal();
	displayTable();
	displayHand();
	System.out.println("(1) Call\n(2) Raise\n(3) Fold");
	
    }
    
    public static void main(String[] args) {
	Player p1 = new Player();
	System.out.println("Hello, "+p1.name+". Your balance is 10000. Let's Play Texas Hold Em!");
	while (p1.balance > 0) {
	    playTurn();
	}
    }
}
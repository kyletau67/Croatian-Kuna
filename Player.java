import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    public String name;
    public double balance;
    private ArrayList<Comparable> hand;
    public ArrayList<Comparable> all;
    public ArrayList<Comparable> table;
    Scanner sc = new Scanner(System.in);
    
    public Player() {
	balance = 10000;
	System.out.println("What is your name?");
	name = sc.next();
	int hand1 = Math.random() * (Deck.getDeck().length + 1);
	addHand(hand1);
	int hand2 = Math.random() * (Deck.getDeck().length + 1);
	addHand(hand2);
	int table1 = Math.random() * (Deck.getDeck().length + 1);
	table.add(Deck.getDeck.get(table1));
	Deck.deck.remove(table1);
	int table2 = Math.random() * (Deck.getDeck().length + 1);
	table.add(Deck.getDeck().get(table2));
	Deck.getDeck().remove(table2);
    }

    public static void addHand(int deal) {
	hand.add(Deck.getdeck().get(deal));
	all.add(Deck.getdeck().get(deal));
	Deck.getDeck().remove(deal);
    }
    
    public static void main(String[] args) {
    }
}
    

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
	int hand1 = (int) (Math.random() * (Deck.getDeck().size() + 1));
	addHand(hand1);
	int hand2 = (int) (Math.random() * (Deck.getDeck().size() + 1));
	addHand(hand2);
	int table1 = (int) (Math.random() * (Deck.getDeck().size() + 1));
	table.add(Deck.getDeck().get(table1));
	Deck.deck.remove(table1);
	int table2 = (int) (Math.random() * (Deck.getDeck().size() + 1));
	table.add(Deck.getDeck().get(table2));
	Deck.getDeck().remove(table2);
    }

    public static void addHand(int deal) {
	hand.add(Deck.getDeck().get(deal));
	all.add(Deck.getDeck().get(deal));
	Deck.getDeck().remove(deal);
    }
    
    public static void main(String[] args) {
    }
}
    

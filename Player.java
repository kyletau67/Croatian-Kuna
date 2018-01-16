import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    public String name;
    public double balance;
    private static ArrayList<Comparable> hand;
    public static ArrayList<Comparable> all;
    public ArrayList<Comparable> table;
    Scanner sc = new Scanner(System.in);
    
    public Player() {
	balance = 10000;
	System.out.println("What is your name?");
	name = sc.next();
	int hand1 = (int) (Math.random() * (Deck.deck.size() + 1));
	addHand(hand1);
	int hand2 = (int) (Math.random() * (Deck.deck.size() + 1));
	addHand(hand2);
	int table1 = (int) (Math.random() * (Deck.deck.size() + 1));
	table.add(Deck.deck.get(table1));
	Deck.deck.remove(table1);
	int table2 = (int) (Math.random() * (Deck.deck.size() + 1));
	table.add(Deck.deck.get(table2));
	Deck.deck.remove(table2);
    }

    public static void addHand(int deal) {
	hand.add(Deck.deck.get(deal));
	all.add(Deck.deck.get(deal));
	Deck.deck.remove(deal);
    }
    
    public static void main(String[] args) {
    }
}
    

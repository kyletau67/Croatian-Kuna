import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    public String name;
    public double balance;
    public static ArrayList<Card> hand;
    public static ArrayList<Card> all;
    public ArrayList<Card> table;
    Scanner sc = new Scanner(System.in);
    
    public Player() {
	Deck.resetDeck();
	balance = 10000;
	System.out.println("What is your name?");
	name = sc.next();
	int hand1 = (int) (Math.random() * (Deck.deck.size() + 1));
	addHand(hand1);
	int hand2 = (int) (Math.random() * (Deck.deck.size() + 1));
	addHand(hand2);
    }

    public static void addHand(int i) {
	hand.add(Deck.deck.get(i));
	all.add(Deck.deck.get(i));
	Deck.deck.remove(i);
    }
    
    public static void main(String[] args) {
    }
}
    

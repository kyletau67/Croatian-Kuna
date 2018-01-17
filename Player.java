import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    public String name;
    public double balance;
    public static ArrayList<Card> hand = new ArrayList<Card>();
    public static ArrayList<Card> all = new ArrayList<Card>();
    public ArrayList<Card> table = new ArrayList<Card>();
    Scanner sc = new Scanner(System.in);
    public static Deck dk = new Deck();
    
    public Player() {
	dk.resetDeck();
	System.out.println("yo");
	balance = 10000;
	System.out.println("What is your name?");
	name = sc.next();
	int hand1 = (int) (Math.random() * (dk.deck.size() + 1));
	addHand(hand1);
	int hand2 = (int) (Math.random() * (dk.deck.size() + 1));
	addHand(hand2);
    }

    public static void addHand(int i) {
	hand.add(dk.deck.get(i));
	all.add(dk.deck.get(i));
	dk.deck.remove(i);
    }
    
    public static void main(String[] args) {
    }
}
    

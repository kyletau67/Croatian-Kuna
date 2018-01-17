import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    
    public String name;  //name of player
    public double balance;  //balance of player
    public static ArrayList<Card> hand = new ArrayList<Card>(); //player's hand
    public static ArrayList<Card> all = new ArrayList<Card>(); //hand + table
    public ArrayList<Card> table = new ArrayList<Card>();  //table cards
    Scanner sc = new Scanner(System.in);  //user input for name
    public static Deck dk = new Deck();  //create a new deck to play
    
    public Player() {
	dk.resetDeck();  //add cards into the deck to play
	System.out.println("yo");
	balance = 10000;  //init the balance you have
	System.out.println("What is your name?");
	name = sc.next();  //take name input as name
	int hand1 = (int) (Math.random() * (dk.deck.size()));
	addHand(hand1);  //draw your first card
	int hand2 = (int) (Math.random() * (dk.deck.size()));
	addHand(hand2);  //draw your second card
    }

    public static void addHand(int i) {  //takes a card from the deck and add it to your hand and all
	hand.add(dk.deck.get(i));
	all.add(dk.deck.get(i));
	dk.deck.remove(i);
    }

    public static void addAll(int i) {  //takes a card from the deck and add it to all
	all.add(dk.deck.get(i));
	dk.deck.remove(i);
    }
    
    public static void main(String[] args) {
    }
}
    

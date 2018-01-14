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
    }
    public static void main(String[] args) {
    }
}
    

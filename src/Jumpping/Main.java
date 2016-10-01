package Jumpping;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Game game = new Game();
        String input;
        int counter = 0;
        
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        do {
            System.out.print("  Participant name: ");
            input = read.nextLine();
            game.addPlayer(input);
        } while(!input.isEmpty());
        
        System.out.println("\nThe tournament begins!\n");
        
        do {
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        input = read.nextLine();
        if(input.equals("jump")){ counter++; 
            game.playRound(counter); }
        } while(input.equals("jump"));
        
        game.finalResults(counter);        
    }
    
}

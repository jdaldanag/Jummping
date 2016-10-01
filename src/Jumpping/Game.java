package Jumpping;
import java.util.*;

public class Game {
    private ArrayList<Player> jumpers = new ArrayList<Player>();
    private Comparator<Player> compare =  new Comparator<Player>(){
        public int compare(Player c1, Player c2) {
        return c1.finalScore() - c2.finalScore(); } };
    
    public Game(){ }
    
    public void addPlayer(String name){
        if(!name.isEmpty()){
        Player x = new Player(name);
        jumpers.add(x); } }
    
    public void playRound(int counter){
        System.out.println("\nRound " + counter + "\n");
        Collections.sort(jumpers,compare);
        System.out.println("Jumping order:");
        
        int n = 1;
        for(Player x : jumpers){
            System.out.println("  " + n + ". " + x.getName() + "(" + x.finalScore() + ")");
            x.jump(); n++; }
        
        System.out.println("\nResults of Round " + counter);
        for(Player x : jumpers){
            System.out.print("  " + x.getName() + "\n    lenght: " + x.getLenght(counter-1) + "\n    judge votes: ");
            for(int i=0;i<5;i++){
                System.out.print(x.getJudges(i) + " "); }
            System.out.println(""); }
        System.out.println(""); }
    
    public void finalResults(int counter){
        System.out.print("\n\nThanks!\n\nTournament results:\nPosition    Name");
        int n = 1;
        
        for(Player x : jumpers){
            System.out.println("\n" + n + "           " + x.getName() + "(" + x.finalScore() + " points)");
            System.out.print("            jump lenghts: ");
            for(int i=0; i<counter; i++){
                System.out.print(x.getLenght(i) + " m. "); }
            n++; System.out.println(""); } }
    
}

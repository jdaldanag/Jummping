package Jumpping;
import java.util.*;

public class Player {
    private ArrayList<Integer> lenghts = new ArrayList<Integer>();
    private ArrayList<Integer> judges = new ArrayList<Integer>();
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private String name;
    
    public Player(String name){
        this.name = name; }
    
    public String getName(){
        return this.name; }
    
    public int finalScore(){
        int fs = 0;
        for(int i : scores){
            fs += i; }
        return fs; }
    
    public int getLenght(int index){
        return this.lenghts.get(index); }
    
    public int getJudges(int index){
        return this.judges.get(index); }
    
    public int getScores(int index){
        return this.scores.get(index); }
    
    public void jump(){
    int lenght = 60 + new Random().nextInt(60);
    lenghts.add(lenght);
    for(int i = 0; i<5; i++){
        int judge = 10 + new Random().nextInt(10); 
        judges.add(i, judge);}
    Collections.sort(judges);
    for(int i = 1; i<4; i++){
        lenght += judges.get(i); }
    this.scores.add(lenght); }
    
    
    
}

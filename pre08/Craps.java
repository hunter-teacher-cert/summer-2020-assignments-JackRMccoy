import java.io.*;
import java.util.*;

public class Craps{
  public static void main(String[] args){
    int numPlays;
    Scanner in = new Scanner(System.in);
    System.out.println("How many games do you want to play?");
    numPlays = in.nextInt();
    System.out.println("Ok, Lets play " + numPlays + " games!");
    int i = 1;
    while (i <= numPlays) {
      round();
      i++;
    }
    System.out.println("We hope you enjoyed playing Craps!");
  }

//Assign random value to dice roll
//Are there other wasy to calcualte line 23?
  public static int roll(int diceRoll){
    return (int)(Math.random()*diceRoll)+1;
  }

//Pass 2 dice and max of 6 through
  public static int shoot(int numDice, int maxValue){
    int s = 0;
    int i = 0;
    while (i < numDice) {
      s = s + roll(maxValue);
      i++;
    }
    return s;
  }

//check win, lose or keep playing, each round
  public static void round(){
    int diceResult1 = shoot(2,6);
    int point = 0;
    if (diceResult1 == 7 || diceResult1 == 11){
      System.out.println("You rolled " + diceResult1 + " - You Win");
      System.out.println("  Winning isn't everything, It's the only thing!!!");
    } else if (diceResult1 == 2 || diceResult1 == 3 || diceResult1 == 12){
      System.out.println("You rolled " + diceResult1 + " - You Lose");
      System.out.println("  Awwwwww, CRAPS!!!");
    } else {
      System.out.println("You rolled " + diceResult1 + " - You need to Keep Rolling.");
      System.out.println("  Good Luck!!!");
      int gameStatus = 0;
      while (gameStatus < 2) {
        point = diceResult1;
        int subsequentRoll = shoot(2,6);
        if (subsequentRoll == point) {
          System.out.println("You rolled " + subsequentRoll +" - You hit the point! You Win!");
          System.out.println("  Winning isn't everything, It's the only thing!!!");
          gameStatus = 2;
        } else if (subsequentRoll == 7){
          System.out.println("You rolled " + subsequentRoll +" - You Lose!");
          System.out.println("  Awwwwww, CRAPS!!!");
          gameStatus = 2;
        } else {
          System.out.println("You rolled " + subsequentRoll +" You need to keep rolling!");
          gameStatus = 1;
        }
      }
    }
  }
}

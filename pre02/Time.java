import java.io.*;
import java.util.*;

public class Time{

public static void main(String[] args){
  int hour = 8;
  int minute = 35;
  int second = 22;
  int secondsPassed = hour * 3600 + minute * 60 + second;
  int secondsLeft = 86400 - secondsPassed;
  double percentPassed = secondsPassed * 100 / 86400;
  int currentHour = 9;
  int currentMinute = 03;
  int currentSecond = 47;
  int elapsedTime = ((currentHour - hour) * 3600) + ((currentMinute - minute) * 60) + (currentSecond - second);

  System.out.print("Number of seconds since midnight: ");
  System.out.println(secondsPassed);
  System.out.print("Number of seconds left in the day: ");
  System.out.println(secondsLeft);
  System.out.print("Percent of the day that has passed: ");
  System.out.println(percentPassed);
  System.out.print("Elapsed time in seconds since working on this exercise: ");
  System.out.println(elapsedTime);

  }
}

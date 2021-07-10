import java.io.*;
import java.util.*;
import java.lang.Math.*;
import java.awt.*;


public class Time {

    // your time class code goes in here
    private int hour;
    private int minute;
    private double second;

    public Time() {
      this.hour = 0;
      this.minute = 0;
      this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
    }

    /*
    public static void printTime(Time t) {
      System.out.print(t.hour);
      System.out.print(":");
      System.out.println(t.minute);
      System.out.print(":");
      System.out.println(t.second);
    }
    */

    public static void printTime(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n",
            t.hour, t.minute, t.second);
    }

    //checks equivalence ref
    public boolean equals(Time that) {
    return this.hour == that.hour
        && this.minute == that.minute
        && this.second == that.second;
    }

    //adding times ref
    public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;
    if (sum.second >= 60.0) {
       sum.second -= 60.0;
       sum.minute += 1;
    }
    if (sum.minute >= 60) {
       sum.minute -= 60;
       sum.hour += 1;
    }
   return sum;
  }


}
//Time time = new Time();

import java.io.*;
import java.util.*;
import java.lang.Math.*;
import java.awt.*;

public class Driver{
  public static void main(String[] args) {
    Time time = new Time(11,59, 59.9);
    System.out.println(time);
    Time.printTime(time);
  }
}

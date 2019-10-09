package Task_Proj;

import java.util.Scanner;

public class Main_Task
{
  public static void main (String[] args)
  {
    System.out.println("TASK 1!"); //TASK 1
    First.firstTask();

    System.out.println("Press any key for continue!");
    Scanner s = new Scanner(System.in);
    String pause = s.nextLine();

    System.out.println("TASK 2!"); //TASK 2
    Second.loop_2();

    System.out.println();
    System.out.println("Press any key for continue!");
    //Scanner s = new Scanner(System.in);
    pause = s.nextLine();

    System.out.println("TASK 3!"); //TASK 3
    Third.loop_3();
  }
}

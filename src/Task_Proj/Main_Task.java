package Task_Proj;

import java.util.Scanner;

public class Main_Task
{
  public static void main (String[] args)
  {
    System.out.println("TASK 1!"); //TASK 1
    First.taskFirst();

    System.out.println("Press any key for continue!");
    Scanner s = new Scanner(System.in);
    String pause = s.nextLine();

    System.out.println("TASK 2!"); //TASK 2
    Second.taskSecond();

    System.out.println();
    System.out.println("Press any key for continue!");
    pause = s.nextLine();

    System.out.println("TASK 3!"); //TASK 3
    Third.taskThird();

    System.out.println("Press any key for continue!");
    pause = s.nextLine();

    System.out.println("TASK 4!"); //TASK 3
    Forth.taskForth();
  }
}

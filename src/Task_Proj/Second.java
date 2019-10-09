package Task_Proj;

class Second
{
  private static final int LIMIT_2 = 5000;

  static void loop_2()
  {
     for (int i = 0; i < LIMIT_2; i++)
     {
       if(i % 6 == 0)
       {
         System.out.print(i + ", ");
       }
     }
  }
}

package Task_Proj;

class Forth
{
    private static final String baseString = "Get the latest BBC World News: international news, features and analysis from Africa!";

    private static void getWordWithMinLength(String s)
    {
        //String[] str;
        //str = baseString.split(" ");
        for (String i : s.split(" "))
        {
            System.out.println(i);
        }
      //  return s;
    }

    static void taskForth()
    {
        getWordWithMinLength(baseString);
    }
}
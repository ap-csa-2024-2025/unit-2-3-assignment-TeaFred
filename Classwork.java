public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println(DelEnd("library", 5));
    System.out.println(CompareLowerCase("framing", "framING"));
    System.out.println(LengthFirst("Everything in its right place"));
    System.out.println(LengthFirst("Down is the new up"));
  }

  public static String firstLastN(String word, int n)
  {
    // word = dictionary
    // n = 3 
    // dicary
    String output = new String();

    // Getting the first n letters
    String firstN = word.substring(0,n); 

    // Geting the last n letters
    int indexOfNToLast = word.length() - n; // index of the nth to last letter
    String lastN = word.substring(indexOfNToLast); // last n letters, starting at nth to last letter 

    output = firstN + lastN; //this changes old variable
    return output;
  }
  public static String DelEnd(String word, int n)
  {
    String output2 = new String();
    output2 = word.substring(0, word.length() - n); //don't make a new variable
    return output2;
  }
  public static int CompareLowerCase(String a, String b)
  {
    return (a.toLowerCase()).compareTo(b.toLowerCase());
    //Parsing = bracket error
  }
  public static int LengthFirst(String a)
  {
    int spaceNum = a.indexOf(" ");
    String d = a.substring(0,spaceNum);
    return d.length();
  }
}


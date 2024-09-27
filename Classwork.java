public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println(DelEnd("library", 5));
  }

  public static String firstLastN(String word, int n)
  {
    // word = dictionary
    // n = 3 
    // dicary
    String output = newString();

    // Getting the first n letters
    String firstN = word.substring(0,n); 

    // Geting the last n letters
    int indexOfNToLast = word.length() - n; // index of the nth to last letter
    String lastN = word.substring(indexOfNToLast); // last n letters, starting at nth to last letter 

    output = firstN + LastN;
    return output;
  }
}

public static String DelEnd(String word, int n)
}
{
  String output = new String();
  int wordlength = word.length();
  String output = word.substring(0, wordlength - n);
  return output;
}
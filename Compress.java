public class Compress
{
public static void main(String[] args)
{
System.out.println("Enter a sequence of characters");
String input = IO.readString();
IO.outputStringAnswer(compress(input));
}
public static String compress (String original)
{ String encoded = "";
  int count = 1;
  for (int i = 0; i < original.length(); i++)
  {
    if (i+1 < original.length() && original.charAt(i) == original.charAt(i+1))
    count++;
    else 
      {if (count == 1)
        encoded = encoded +original.charAt(i);
        else
        encoded = encoded + count +original.charAt(i);
        count = 1;
      }
  }
  return encoded;
}
}

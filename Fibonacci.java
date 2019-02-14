public class Fibonacci
{
public static void main (String[] args)
{
  System.out.println("What number in the Fibonacci sequence do you want?");
  int n = IO.readInt();
  IO.outputIntAnswer(sequence(n));
}
public static int sequence(int n)
{
  if(n ==1 || n ==2)
  return 1;
  else
    return sequence (n-1) + sequence(n-2);
}
}

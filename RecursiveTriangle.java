public class RecursiveTriangle
{
public static void main (String[] args)
{
  System.out.println("How high do you want the triangle");
  int n = IO.readInt();
  /* while(n > 0)
  {pyramid(n);
    n--;
    System.out.println();
  } */
  for (int i = 1; i <= n; i++)
  {
    pyramid(i);
    System.out.println();
  }
}
public static void pyramid(int n)
{
if (n == 0)
{
  System.out.println();
  return;
}
System.out.print("*");
pyramid(n - 1);
}
}

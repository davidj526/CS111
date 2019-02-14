public class Zoo
{
public static void main (String args[])
{
int totalGiraffes = 0;
int totalLions = 0;
int totalSnakes = 0;
  System.out.println ("Enter number of Zoos");
  int zoo = IO.readInt();
  for(int i = 1; i <= zoo; i++)
  {
    System.out.println("How many giraffes for zoo " +i);
    int tempGiraffes = IO.readInt();
    System.out.println("How many lions for zoo " +i);
    int tempLions = IO.readInt();
    System.out.println("How many snakes for zoo " +i);
    int tempSnakes = IO.readInt();
    totalGiraffes += tempGiraffes;
    totalLions += tempLions;
    totalSnakes += tempSnakes;
  }
IO.outputIntAnswer(totalGiraffes);
IO.outputIntAnswer(totalLions);
IO.outputIntAnswer(totalSnakes);
}
}

public class DonateToPaws
{
  public static void main (String[] args)
  {
System.out.println("Enter donation amount.");
double donation = IO.readDouble();
IO.outputDoubleAnswer(donationFee(donation));
  }
  public static double donationFee(double donationAmount)
  {double total = 0;
    if (donationAmount <= 150)
    total = 3;
    else if (donationAmount > 150 && donationAmount < 1500)
    {
      if ((donationAmount * .04) > 8)
      total = donationAmount * .04;
      else
      total = 8;
    }
    else if (donationAmount >= 1500 && donationAmount < 15000)
    {if ((donationAmount * .01) > 20)
    total = donationAmount * .01;
  else
total = 20;
    }

    else if (donationAmount >= 15000)
    {if (donationAmount == 15000)
      total = 15000* .01;
      else if((donationAmount - 15000) >= 1 && (donationAmount - 15000) <= 4000)
      total = 15000 * .01 + (donationAmount - 15000)*.02;
      else if ((donationAmount - 19000) >= 1)
      total = 15000 * .01 + 4000 * .02 + (donationAmount - 19000)*.03;
    }
return total;
  }

}

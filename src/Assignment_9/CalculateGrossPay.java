package Assignment_9;

import java.util.Scanner;

public class CalculateGrossPay
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Calculate the Monthly Sales \n\n");

        System.out.print("Enter the monthly sales : "); //To get the Monthly sales
        double sales = read.nextDouble();

        System.out.print("Enter the amount of advanced pay : "); //To get Advance pay.
        double advance = read.nextDouble();

        double commissionRate=0.0;

        if(sales>=0 &&sales < 10000)
        {
            commissionRate = 5.0;
        }
        else if(sales>=10000 && sales <= 14999)
        {
            commissionRate = 10.0;
        }
        else if(sales>=15000 && sales <= 17999)
        {
            commissionRate = 12.0;
        }
        else if(sales>=18000 && sales <= 21999)
        {
            commissionRate = 15.0;
        }
        else if(sales >=22000 )
        {
            commissionRate = 16.0;
        }
        else
        {
            System.out.println("Sales can't be negative. ");
            System.exit(1);
        }
            double commission = commissionRate * sales / 100;
            double grossPay = commission - advance;
            System.out.println("Commission : $"+commission);

        }
}

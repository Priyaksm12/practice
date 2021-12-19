import java.util.Scanner;

public class leapyear {
    public static void main(String[] args)
    {

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        year = sc.nextInt();
        boolean isLeap=true;
        sc.close();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    isLeap=true;
                else
                    isLeap=false;
            }
            else
                isLeap=true;
        }
        else{
            isLeap=false;
        }

        if(isLeap==true)
            System.out.println("the entered year is leap year");
        else
            System.out.println("the entered year is not a leap year");

    }
}


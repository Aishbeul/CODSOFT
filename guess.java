import java.util.*;
class guess
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int r,guess,i,nr,s=0;        
        System.out.println("Try your luck guessing!\nEnter a number between 1-100 and we'll tell you if you're guess is correct!");
        System.out.println("Enter number of rounds you want to play\nNOTE: Each correct guess carries 5 points and you have 3 turns per round.");
        nr=sc.nextInt();
        for(i=1;i<=nr;i++)
        {
            System.out.println("ROUND "+i+":");
            r=1+(int)(Math.random()*(100-1));
            int fl=0,ro=0;
            for(int j=1;j<=3;j++)
            {
                System.out.println("Enter your guess:");
                guess=sc.nextInt();
                if(guess!=r)
                {
                    System.out.println("Your guess is incorrect!");
                }
                else if(guess==r)
                {
                    s=s+5;
                    System.out.println("Your guess is correct!");
                    fl=1;
                    ro=i;
                    break;
                }
            }
            if(fl==1)
                System.out.println("Your score as of round "+ro+" is: "+s);
            else
            {System.out.println("Try Again! Your score as of round "+ro+" is: "+s);
                System.out.println("The random number generated was:"+r);
            }
        }
        System.out.println("Final score after "+nr+"round(s) is: "+s);
    }
}
import java.util.*;
class marks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=0,s=0;
        float avg=0.0F;
        String g="";
        System.out.println("Enter number of subjects:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter marks in each subject out of 100:");
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter marks in subject "+i+":");
            a[i-1]=sc.nextInt();
            s+=a[i-1];
        }
        avg=s/n;
        if(avg>=90)
        g="O";
        if(avg>=80 && avg<90)
        g="A+";
        if(avg>=70 && avg<80)
        g="A";
        if(avg>=60 && avg<70)
        g="B+";
        if(avg>=50 && avg<60)
        g="B";
        System.out.println("Total in "+n+" subjects is: "+s+" out of "+(n*100)+"\nAverage percentage is: "+avg+"\nGrade secured= "+g);
    }
}   
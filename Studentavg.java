import java.io.*;
import java.util.*;
class Studentavg
{
    public static void main(String args[])
    {
        int sm1,sm2,sm3,sm4,sm5;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 students: ");
        sm1 = sc.nextInt();
        sm2 = sc.nextInt();
        sm3 = sc.nextInt();
        sm4 = sc.nextInt();
        sm5 = sc.nextInt();
        avg = (sm1+sm2+sm3+sm4+sm5)/5;
        System.out.println("Student avg is "+avg);
        if(avg>=80)
        {
            System.out.println("Student is passed in First distinction");

        }
        else if(avg>=70 && avg<80)
        {
            System.out.println("Student is passed in first class");
        }
        else if(avg>=50 && avg<70)
        {
            System.out.println("Student is passed in second class");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Student is passed in third class");
        }
        else
        {
            System.out.println("Student is failed");
        }

    }
}
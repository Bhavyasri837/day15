import java.util.Random;
import java.util.Scanner;
 public class PasswordGenerator
 {
  void numberPassword(Scanner sc)
        {
        System.out.println("enter password length:");
        int npl=sc.nextInt();
        String password="";
        Random r=new Random();
        for(int i=0;i<npl;i++)
        {
            password+=r.nextInt(10);
        }
        System.out.println(password);
        }
    void alphabeticPassword(Scanner sc)
    {
       
       Random r1=new Random();
       String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
       System.out.println("enter password length:");
       int apl=sc.nextInt();
       String password1="";
       for(int i=0;i<apl;i++)
       {
        char res=letters.charAt(r1.nextInt(letters.length()));
        password1+=res;
       }
       System.out.println(password1);
    }
    void specialSymbolPassword(Scanner sc)
    {
       Random r2=new Random();
       String symbols="!@#$%^&*()_+=-><";
       System.out.println("enter password length:");
       int spl=sc.nextInt();
       String password2="";
       for(int i=0;i<spl;i++)
       {
        char res1=symbols.charAt(r2.nextInt(symbols.length()));
        password2+=res1;
       }
       System.out.println(password2);
    }

    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    PasswordGenerator p=new PasswordGenerator();
         char option='\0';
        System.out.println("select your password type:");
        System.out.println("options are:");
        System.out.println("A.numberpassword");
        System.out.println("B.alphabeticpassword");
        System.out.println("C.specialsymbolpassword");
        do{
            option=Character.toUpperCase(sc.next().charAt(0));
            switch(option)
            {
            case 'A':
            System.out.println("generating number password:");
            p.numberPassword(sc);
            break;
            case 'B':
            System.out.println("generating alphabetical password:");
            p.alphabeticPassword(sc);
            break;
            case 'C':
            System.out.println("generating password using symbols:");
            p.specialSymbolPassword(sc);
            break;
            default:
            System.out.println("invalid option");
            break;
            }
        }while(option!='A'||option!='B'||option!='C');
        sc.close();
    }

}


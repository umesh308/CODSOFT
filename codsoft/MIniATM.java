import java.util.Scanner;
public class MIniATM{
    public static void main(String[] args) {
        int a, b, c, d,e ,f ,g, h,i , temp;    
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Set your 4 digit ATM Pin : ");
        short pin = sc.nextShort();
        System.out.print("Enter your name : ");
        sc.nextLine();
        String name = sc.nextLine();
        String user;
        do{
        System.out.print("\n Press 1 : Withdrawal \n Press 2 : Deposit \n Press 3 : Check balance \n Enter your choise :  ");
        byte ip = sc.nextByte();
        
        switch (ip) {
            case 1:
            {
            System.out.print("Enter the amount for withdrawal : ");
            int withamount = sc.nextInt();
            if(amount>0)
            {
            System.out.print("Welcome " + name + " Please verify your ATM pin : ");
            int get = sc.nextInt();
            System.out.println("\n");
    
            temp = withamount;  
            
            if (pin==get){
            
                if (withamount>=500){
                    a = withamount/500;
                    withamount%=500;
                    System.out.println(a +" * 500" + " = "+ a*500);
                }
                if (withamount>=200){
                    b = withamount/200;
                    withamount%=200;
                    System.out.println(b +" * 200" + " = "+ b*200);
                }
                if (withamount>=100){
                    c = withamount / 100;
                    withamount%=100;
                    System.out.println(c+" * 100 = " + c*100);
                }
                if (withamount>=50){
                    d = withamount / 50;
                    withamount%=50;
                    System.out.println(d+" * 50 = " + d*50);
                }
                if (withamount>=20){
                    e = withamount / 20;
                    withamount%=20;
                    System.out.println(e+" * 20 = " + e*20);
                }
                if (withamount>=10){
                    f = withamount / 10;
                    withamount%=10;
                    System.out.println(f+" * 10 = " + f*10);
                }
                if (withamount>=5){
                    g = withamount / 5;
                    withamount%=5;
                    System.out.println(g+" * 5 = " + g*5);
                }
                if (withamount>=2){
                    h = withamount / 2;
                    withamount%=2;
                    System.out.println(h+" * 2 = " + h*2);
                }
                if (withamount>=1){
                    i = withamount / 1;
                    withamount%=1;
                    System.out.println(i+" * 1 = " + i*1);
                }
    
               System.out.println("\nTotal Withdrawal Money : " + (float)temp);
               System.out.println("\nThank you .....Have a nice day!!");
               amount = amount - temp;
            }
            else{
                System.out.println("Invalid ATM pin!!");
            }
        }
        else
        {
            System.out.println("Unsufficient Balance");
        }
                break;
        }
        case 2:
        {
            System.out.print("Enter the amount for deposit : ");
            int depamount = sc.nextInt();
            System.out.print("Welcome " + name + " Please verify your ATM pin : ");
            int get = sc.nextInt();
            System.out.println("\n");
    
            temp = depamount;  
            
            if (pin==get){
            
                if (depamount>=500){
                    a = depamount/500;
                    depamount%=500;
                    System.out.println(a +" * 500" + " = "+ a*500);
                }
                if (depamount>=200){
                    b = depamount/200;
                    depamount%=200;
                    System.out.println(b +" * 200" + " = "+ b*200);
                }
                if (depamount>=100){
                    c = depamount / 100;
                    depamount%=100;
                    System.out.println(c+" * 100 = " + c*100);
                }
                if (depamount>=50){
                    d = depamount / 50;
                    depamount%=50;
                    System.out.println(d+" * 50 = " + d*50);
                }
                if (depamount>=20){
                    e = depamount / 20;
                    depamount%=20;
                    System.out.println(e+" * 20 = " + e*20);
                }
                if (depamount>=10){
                    f = depamount / 10;
                    depamount%=10;
                    System.out.println(f+" * 10 = " + f*10);
                }
                if (depamount>=5){
                    g = depamount / 5;
                    depamount%=5;
                    System.out.println(g+" * 5 = " + g*5);
                }
                if (depamount>=2){
                    h = depamount / 2;
                    depamount%=2;
                    System.out.println(h+" * 2 = " + h*2);
                }
                if (depamount>=1){
                    i = depamount / 1;
                    depamount%=1;
                    System.out.println(i+" * 1 = " + i*1);
                }
    
               System.out.println("\nTotal deposit Money : " + (float)temp);
               System.out.println("\nThank you .....Have a nice day!!");
               amount = amount + temp;
            }
            else{
                System.out.println("Invalid ATM pin!!");
            }
                break;  
        }
            case 3:
            {
                System.out.print("Welcome " + name + " Please verify your ATM pin : ");
                int get = sc.nextInt();
                System.out.println("\n");
                if(get == pin){
                System.out.println("Your account balance is : " + (float)amount);
                }
                else{
                    System.out.println("Invalid Pin!!");
                }
                break;
            }
            default:
                System.out.println("Please provide proper input!!");
                break;
    
        }
        System.out.println("Are you want to continue(y) or exit(n) : ");
        sc.nextLine();
        user = sc.nextLine();
        }
        while(user.equalsIgnoreCase("y"));
        sc.close();
        }
    }

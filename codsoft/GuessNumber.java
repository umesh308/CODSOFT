    import java.util.Scanner;
    import java.util.Random;
    public class GuessNumber {
        public static void main(String [] args)
        {
            Random random= new Random();
            Scanner sc=new Scanner(System.in);
    
            int randomNumber=random.nextInt(100)+1;
            int tCount=1;
            int round=1;
            System.out.println("                                                  ROUND 1");
           
                    while(true)
                    {  
                        
                        System.out.print("Enter the number (1-100) with only 5 count : ");
                            int number=sc.nextInt();
                            if(1>=number  || number<=100)
                               {
                                  tCount++;
                    
                                if(tCount<=5)
                                {
                                    if(randomNumber==number)
                                    {
                                        System.out.println("You Guess Right! "+"\nRandom Number Was : "+ randomNumber+"\nYour Number is : "+number);
                                        System.out.println("Your Try count is : "+(tCount-1));
                                        System.out.println("You won the game in Round: "+round);
                                        break;
                                        
                                    }
                                    else if(randomNumber>number)
                                    {   
                                        
                                        System.out.println("You Guess Wrong!. Please Enter The Higher Number. Try count left :"+(6-tCount)+"\n");
                                        
                                    }
                                    else
                                    {
                                        System.out.println("You Guess Wrong!. Please Enter The Lower Number. Try count left :"+(6-tCount)+"\n");
                                    }
                                
                                }
                                else
                                {
                                    System.out.println("You Lose the game ! "+" The number was : "+ randomNumber+"\n(Your try count is over which was 3) PLAY AGAIN !");
                                    round++;
                                    System.out.println("\n Enter the 'y' if you want to play further round if not then 'n");
                                    char nextRound=sc.next().charAt(0);
                                    if(nextRound=='y')
                                    {
                                          System.out.println("                                 ROUND "+round);
                                           randomNumber=random.nextInt(100)+1;
                                           tCount=1;
                                    }
                                    else
                                    {   
                                        System.out.println("SEE YOU SOON ! BETTER LUCK NEXT TIME!");
                                        break;
                                    }
                                }
                            }

                            else
                            {
                                System.out.println("Please enter number between 1 to 100 only\n");
                            }
                           
                    } 
        }
    }
            
            
    
        
    
      


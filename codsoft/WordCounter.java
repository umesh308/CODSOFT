import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordCounter
 {

  public static void main(String[] args)
    {
       
            try {
                File file = new File("input.txt");
                Scanner fileScanner = new Scanner(file);

                String data="";
                while (fileScanner.hasNextLine())
               {
                     data = fileScanner.nextLine();
                    
                }
                String str = data.toString();

                fileScanner.close();

                System.out.println("Text in the File or String: " + str+"\n");
                System.out.println("Number of words in the file or string: " + countWd(str));
                System.out.println("Number of characters in the file or string: " + countChar(str));
            } 
            catch (FileNotFoundException e)
             {
                System.out.println("File not found.");
                e.printStackTrace();
             }
            
        }
        public static int countWd(String str) {
            int count = 0;
            if ( !(" ".equals(str.substring(str.length() - 1)))||!(" ".equals(str.substring(0, 1))) ) {
               
                for (int i = 0; i < str.length(); i++)
                 {
                    if (str.charAt(i) == ' ') 
                    {
                        count++;
                    }
                }
                count =count + 1;
            }
            return count;
        }
    
        public static int countChar(String str) {
            return str.length()-1;
        }
    }
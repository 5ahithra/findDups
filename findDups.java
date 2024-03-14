//Sahithra Kesavan
//Period 4
import java.util.Scanner;
import java.util.HashSet;

public class findDups 
{
    
    public static void main(String [] args) 
    {
        HashSet<String> words = new HashSet<String>();
        Scanner keyboard = new Scanner(System.in);
        String word = "";
        
        while (!(word.equals("exit")))
        		{
            System.out.println("Enter a word");
            word = keyboard.nextLine();
            
            if (words.contains(word)) 
            {
                System.out.println("Duplicate detected: " + word);
            } else 
            {
                words.add(word);
            }
        }
        
        System.out.println("size: " + words.size());
        System.out.println(words);
    }
}
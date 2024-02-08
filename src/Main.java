import java.util.Scanner;
import java.lang.String;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) throws WordNotFoundException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a paragraph : ");
        String paragraph=sc.nextLine();
        System.out.println("Enter the word to search");
        String word=sc.next();
        int frequency=0;
        for(String s : paragraph.split(" ")){
            if(s.equals(word)) {
                frequency++;
            }
        }
        if(frequency==0){
            throw new WordNotFoundException("Word not Found");
        }
        else System.out.println("Word found "+frequency+" times.");
    }
}
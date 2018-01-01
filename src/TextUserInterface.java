
import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {
   private Scanner reader;
   private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;

    }

    public void start(){
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        System.out.println("");

        while(true){
            System.out.println("Statement: ");
        String answer = reader.nextLine();


        if(answer.equals("quit")){
            System.out.println("Cheers!");
            break;
        }

        if(answer.equals("add")){
            add();
        }

        if(answer.equals("translate")){
            translate();
        } else {
            System.out.println("Unknown statement");
        }
        }

    }

    public void add(){
        String[] strings = new String[1];

        System.out.println("In Finnish: ");
        strings[0] = reader.nextLine().trim();
        System.out.println("Translation: ");
        strings[1] = reader.nextLine().trim();

        dictionary.add(strings[0],strings[1]);
    }

    public void translate(){
        System.out.println("Give a word: ");
        String key = reader.nextLine().trim();
        System.out.println("Translation: " + dictionary.translate(key));


    }
}

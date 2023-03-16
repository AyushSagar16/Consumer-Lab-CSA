import java.util.Scanner;

public class project {
    public static void main (String args[]) {

        // User Input
        
        wordFinder("Shubansai Madhav Gouru");

    }

    public static void wordFinder(String name){
        System.out.println("Hey " + name + "! Welcome to the word finder. Give us the text first and then we will take the word you need and will tell you where it is!");
        Scanner contentInput = new Scanner(System.in);
        String content = contentInput.nextLine();

        System.out.println("Please give me a word now.");

        String word = "";
        String space = " ";
        String empty = "";

        try (Scanner wordInput = new Scanner(System.in)) {
            word = wordInput.nextLine();
        } catch (Exception e) {
            if (word.equals(space) || word.equals(empty)) {
                System.out.println("Sorry that is not a word. Please give me a word.");
            }
        }

            System.out.println("Thank you for your input. I will now find your word's location.");

            // Word Finder

            int start = 0;
            int end = 0;
            String preWord = "";
            String postWord = "";
            String updatedWord = "";
            String updatedText = "";


            start = content.indexOf(word) + 1;
            end = content.indexOf(" ", start) + 1;

            preWord = content.substring(0, start - 1);
            postWord = content.substring(end, content.length());
            updatedWord = " *" + word + "* ";

            updatedText = preWord + updatedWord + postWord;

            int i = 0;
            while(i > updatedText.length()){
                i++;
            }



            // Results

            System.out.println("The word " + word + " starts at character " + start + " and ends at character " + end + ".");
            System.out.println("Here is your content with astrisks next to the word you were looking for!");
            System.out.println("Fun fact your sentence has " + i + " characters!");
            if (i>50)
                System.out.println("Wow that is a long sentence!");
            else
                System.out.println("That is a short sentence!");
            System.out.println(updatedText);
    }
}

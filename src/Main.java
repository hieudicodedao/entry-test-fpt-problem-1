import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //create instance scanner for reading input from console

        String inputString = sc.nextLine(); // catch first string was typed from user

        ArrayList<String> arrayContainWord = convertStringToArrayContainWords(inputString); // convert string with words and spaces into a array list that only contain words

        String longestWord = longestStringInArray(arrayContainWord); // call a function performs searching longest words in the array upon process

        System.out.println(longestWord); //print the result
    }

    public static ArrayList<String> convertStringToArrayContainWords(String inputString) {

        String word = ""; // initial word variable which we will catch up in each new word was found

        Character whitespace = ' '; // variable stores white space

        ArrayList<String> arrayContainWords = new ArrayList<>(); // create empty array list

        for (int i = 0; i < inputString.length(); i++) {  // loop through string input's length

            if(inputString.charAt(i) != whitespace  ) { // every time we meet a character NOT is a white space , add that character to variable word

                word += inputString.charAt(i);

            }else if( (inputString.charAt(i) == whitespace && word != "" ) ){ // meet a white space, and we store a word before , add word to array , reset dynamic variable to empty word

                arrayContainWords.add(word);

                word = "";

            }
        }

        if(word != "") arrayContainWords.add(word); // exception for case there's no empty space at last index of string input , we save word variable if it's an actual word

        return arrayContainWords;
    }

    public static String longestStringInArray (ArrayList<String> arrayWords) {

        String maxLengthWord = ""; // define variable to store longest word

        int maxLengthString = -999999; // store longest string length , init for infinite

        for (String word: arrayWords) { // iterate list array words

            if(word.length() > maxLengthString) { // find a word has length greater than index store before

                maxLengthWord = word; // save the longest word for now

                maxLengthString = word.length(); // save length of the longest word

            }
        }

        return  maxLengthWord;

    }
}

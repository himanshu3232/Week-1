import java.util.*;

class WordSplitter2D {

	 // Method to find the length of a string without using the length() method
    public static int findLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        return len;
    }

    // Method to count the number of words in the sentence
    public static int wordCounter(String sentence) {
        int wordcount = 1; // Initializing with 1 as there will always be at least one word
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordcount++; // Increment word count for each space found
            }
        }
        return wordcount;
    }

    // Method to split the sentence into words
    public static String[] splitter(String sentence) {
        int wordCount = wordCounter(sentence);
        int index = 0;
        String[] strArray = new String[wordCount];
        int low = 0;
        int high = 0;

        // Loop to break the sentence into words based on spaces
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                high++;
            } else {
                strArray[index] = sentence.substring(low, high);
                index++;
                high = high + 1;
                low = high;
            }
        }
        // Adding the last word
        strArray[index] = sentence.substring(low, high);
        return strArray;
    }

    // Method to return a 2D array containing words and their lengths
    public static String[][] findstrLenArray(String sentence) {
        String[] strArray = splitter(sentence);
        String[][] strLenArray = new String[strArray.length][2];

        // Storing words and their lengths in the 2D array
        for (int i = 0; i < strArray.length; i++) {
            strLenArray[i][0] = strArray[i];
            strLenArray[i][1] = Integer.toString(findLength(strArray[i]));
        }
        return strLenArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        // Printing the length of the sentence
        System.out.println("Length of your sentence is " + findLength(sentence));

        // Counting and printing the number of words
        int wordCount = wordCounter(sentence);
        System.out.println("Number of words = " + wordCount);

        // Splitting the sentence and printing the word array
        String strArray = Arrays.toString(splitter(sentence));
        System.out.println("The array is " + strArray);

        // Using built-in split() method to split the sentence into words
        String strArray2 = Arrays.toString(sentence.split(" "));
        System.out.println("The array is " + strArray2);

        // Generating and printing the 2D array of words and their lengths
        String[][] strLenArray = findstrLenArray(sentence);
        System.out.println("word    length");
        System.out.println("---------------");

        // Printing the 2D array in tabular format
        for (int i = 0; i < strLenArray.length; i++) {
            for (int j = 0; j < strLenArray[0].length; j++) {
                System.out.print(strLenArray[i][j] + "        ");
            }
            System.out.println();
        }
    }

   
}

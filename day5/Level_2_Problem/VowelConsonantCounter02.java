import java.util.Scanner;

public class VowelConsonantCounter02 {

    
    public static String checkCharacterType(char ch) {
        
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }

        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }


    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacterType(ch);

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount }; 
    }
	
	
	
	 public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2]; 
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacterType(ch);

           
            if (!type.equals("Not a Letter")) {
                result[index][0] = String.valueOf(ch); 
                result[index][1] = type; 
                index++;
            }
        }

       

        return result;
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

     
        int[] counts = countVowelsAndConsonants(input);
        String[][] res= findVowelsAndConsonants( input);
      
        System.out.println("\nResults:");
        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);
		
		System.out.println("Charactor\tType");
	   for(int i=0;i<res.length;i++)   
	   {
		   if(res[i][0]==null)
		   {
			   break;
		   }
		   System.out.println(res[i][0]+"\t\t"+res[i][1]);
	   }

        scanner.close();
    }
}

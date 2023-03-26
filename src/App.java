import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {

            // Input a string from the user

            System.out.print(  "Enter a string: ");
            String userText = input.nextLine();

            
            
            // Input a number key from the user

            System.out.print("Enter a key: ");
            int key = input.nextInt();

            System.out.print("[1] Encode\n[2] Decode\n\n==>");
            int option = input.nextInt();

            switch(option) {
                case 1:

                // Create an array with the string inputed

                char[] phrase = userText.toCharArray();
                for (int i = 0; i < phrase.length; i++) {
                
                
                
                    // Create a variable the receive one index of the array 

                    char nowLetter = phrase[i];
    
    
    
                    // Create a variable that sum the previous variable with the key, and use a involucre class to convert int to char. This is necessary because if it didn't exist the value of this variable would be the ASCII number

                    char newLetter = (char) (nowLetter + key);
    
                    // This condition checks whether the value of the variable nowLetter corresponds to a letter of the lowercase alphabet.

                    if (nowLetter >= 'a' && nowLetter <= 'z') {
                        
                        // This block will be executed when the newLetter variable exceeds 122, which is the ASCII code for 'z'. The variable dif will store the difference between the value of newLetter and 122, which is the excess value beyond the letter 'z'. This excess value is then added to the letter 'a', allowing the cipher to "wrap around" to the beginning of the lowercase alphabet. If the resulting letter still exceeds 122, this process will continue until a valid lowercase letter is obtained.

                        while (newLetter > 122) {
                            int dif = newLetter - 122;
                            newLetter =  (char) (97 + dif - 1);
                        }
                    
                         // This condition checks whether the value of the variable nowLetter corresponds to a letter of the uppercase alphabet.


                    } else if (nowLetter >= 'A' && nowLetter <= 'Z') {
    
                        
                        while (newLetter > 90) {
                            int dif = newLetter - 122;
                            newLetter =  (char) (97 + dif - 1);
                        }
                        
                    }
    
    
                    if (nowLetter < 'A' || nowLetter > 'z') {
                        newLetter = nowLetter;
                    } 
    
    
                    // Change each index for the value of newLetter

                    phrase[i] = newLetter;
                } 

                String newPhrase = new String(phrase);
                System.out.println(newPhrase);

                break;

                case 2:


                 phrase = userText.toCharArray();
                 for (int i = 0; i < phrase.length; i++) {
                 
                 
                 


                     char nowLetter = phrase[i];
     
     
     
                    

                     char newLetter = (char) (nowLetter - key);
     
                     if (nowLetter >= 'a' && nowLetter <= 'z') {
     
                         while (newLetter < 97) {
                             int dif = 97 - newLetter;
                             newLetter =  (char) (122 - dif + 1);
                         }
     
                     } else if (nowLetter >= 'A' && nowLetter <= 'Z') {
     

                        while (newLetter < 65) {
                            int dif = 65 - newLetter;
                            newLetter =  (char) (90 - dif + 1);
                        }
                         
                     }
     
     
                     if (nowLetter < 'A' || nowLetter > 'z') {
                         newLetter = nowLetter;
                     } 
     
     

                     phrase[i] = newLetter;
                 } 
 
                 newPhrase = new String(phrase);
                 System.out.println(newPhrase);
                 break;
                    

                }
    }
}

}

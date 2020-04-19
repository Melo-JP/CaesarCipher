import java.util.Arrays;
import java.util.Scanner;

public class FrequencyAnalysisCaesarCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter message to be decrypted: ");
        String encryptedText = input.nextLine().toLowerCase();

        int[] freq = new int[encryptedText.length()];
        int i;
        int j;

        //Converts given string into character array
        char string[] = encryptedText.toCharArray();
        Arrays.sort(string);

        for(i = 0; i <encryptedText.length(); i++) {

            freq[i] = 1;
            for(j = i+1; j <encryptedText.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                
                }
            }
        }

        //Displays each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);

        }
    }
}

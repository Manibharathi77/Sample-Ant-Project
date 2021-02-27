import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StringPermutationHelper {

    private String inputValueOne;
    private String inputValueTwo;

    private void getValuesFromCommandLine() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("Permutations of two strings will be checked below");
        System.out.println("Enter First String Value");
        this.inputValueOne = scanner.nextLine();
        System.out.println("Enter Second String Value");
        this.inputValueTwo = scanner.nextLine();
    }

    public boolean checkStringsPermutationEquality(){

        this.getValuesFromCommandLine();

        if(this.inputValueTwo.length()!= this.inputValueOne.length())
            return false;

        char[] characterArrayOne = this.inputValueOne.toLowerCase().toCharArray();
        char[] characterArrayTwo = this.inputValueTwo.toLowerCase().toCharArray();

        characterArrayOne = this.sortCharArrayUsingBubbleSort(characterArrayOne);
        characterArrayTwo = this.sortCharArrayUsingBubbleSort(characterArrayTwo);

        System.out.println(characterArrayOne);
        System.out.println(characterArrayTwo);

        for (int i = 0; i < inputValueOne.length(); i++){
            if (characterArrayOne[i] != characterArrayTwo[i])
                return false;
        }

        return true;
    }

    public char[] sortCharArrayUsingBubbleSort(char[] charArray){

        char tempHolder;

        for (int i = 0; i <charArray.length; i++) {
            for ( int j = 0; j < charArray.length; j++) {

                if(charArray[j]>charArray[i]){
                    tempHolder=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=tempHolder;
                }
            }

        }

        return charArray;
    }

}

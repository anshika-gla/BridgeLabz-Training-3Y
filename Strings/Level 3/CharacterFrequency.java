import java.util.Scanner;
public class CharacterFrequency {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static int[][] findCharFrequency(String text) {
        int len = getLength(text);
        int[] freq = new int[256]; 

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;      
                result[index][1] = freq[i]; 
                index++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequencies = findCharFrequency(input);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            char c = (char) frequencies[i][0];
            int count = frequencies[i][1];
            System.out.println(c + " -> " + count);
        }

        sc.close();
    }
}

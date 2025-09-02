import java.util.Scanner;
public class UniqueCharacterFrequency {
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
    public static char[] uniqueCharacters(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }
    public static String[][] findCharFrequency(String text) {
        int len = getLength(text);
        int[] freq = new int[256];

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }
        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]); 
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = findCharFrequency(input);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }

        sc.close();
    }
}

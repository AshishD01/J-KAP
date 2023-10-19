package StringPractice;

public class String1 {
	
    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(reverseWords("Hello World")); 
        System.out.println(reverseWords("The quick brown fox")); 
        System.out.println(reverseWords("Coding is fun")); 
    }
}

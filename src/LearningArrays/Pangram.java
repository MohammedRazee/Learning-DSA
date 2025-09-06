package LearningArrays;

public class Pangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpedoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    public static boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if (n < 26) return false;

        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(sentence.indexOf(ch) < 0) return false;
        }
        return true;
    }
}

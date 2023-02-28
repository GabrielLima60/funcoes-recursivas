public class Palindromo {
    //Esse algorítimo detecta se uma palávra é um palindromo ou não
    
    public static void palindromo(String word) {
        if (word.length() == 1 || word.length() == 0) {
            System.out.println("A palavra é um palindromo");
        }
        else {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                StringBuilder result = new StringBuilder(word);
                result = result.deleteCharAt(0);
                result = result.deleteCharAt(result.length() - 1);
                palindromo(result.toString());
            }
            else
                System.out.println("A palavra não é um palindromo");
        }
    }
    
    public static void main(String args[]) {
        palindromo("omississimo");
    }
}
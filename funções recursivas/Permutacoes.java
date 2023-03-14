
public class Permutacoes {
	
    public static void permutacoes(String palavra) {
        permutacoes(palavra.toCharArray(), 0);
    }
    
    private static void permutacoes(char[] letras, int contador) {
        if (contador == letras.length - 1) {
            System.out.println(String.valueOf(letras));
        }
 
        for (int i = contador; i < letras.length; i++) {
            trocar(letras, contador, i);
            permutacoes(letras, contador + 1);
            trocar(letras, contador, i);
        }
    }

    private static void trocar(char[] letras, int i, int j) {
        char temp = letras[i];
        letras[i] = letras[j];
        letras[j] = temp;
    }
	
	public static void main(String[] args) {
	    permutacoes("HUE");
	}
}
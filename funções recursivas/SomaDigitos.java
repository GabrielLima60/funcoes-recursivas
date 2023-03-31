public class SomaDigitos {
    
    public static void somaDigitos(int numero){
        somaDigitos(Integer.toString(numero), 0);
    }
    
    private static void somaDigitos(String numero, int soma){
        if (numero.length() == 0){
            System.out.println("A soma dos dígitos de " + numero + " é " + soma);
        }
        else {
            somaDigitos(numero.substring(1), soma + Character.getNumericValue(numero.charAt(0)));
        }
    }
    
    public static void main(String args[]) {
        somaDigitos(413);
    }
}


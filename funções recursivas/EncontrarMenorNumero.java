import java.util.List;

public class EncontrarMenorNumero {
    
    public static int encontrarMenorNumero(List<Integer> numeros) {
        return encontrarMenorNumero(numeros, Integer.MAX_VALUE, 0);
    } 
    
    private static int encontrarMenorNumero(List<Integer> numeros, int menor_numero, int contador) {
        if(numeros.size() == contador+1){
            if(numeros.get(contador) < menor_numero) 
                return numeros.get(contador);
            else
                return menor_numero;
        }
        else{
            if (numeros.get(contador) < menor_numero) 
                return encontrarMenorNumero(numeros, numeros.get(contador), contador+1);
            else
                return encontrarMenorNumero(numeros, menor_numero, contador+1);
        }
    }
    
    public static void main(String args[]) {
        System.out.println(encontrarMenorNumero(List.of(8, 6, 9, 2, 5)));
    }
}
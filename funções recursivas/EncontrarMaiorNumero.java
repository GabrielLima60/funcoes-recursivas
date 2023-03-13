import java.util.List;

public class EncontrarMaiorNumero {
    
    public static int encontrarMaiorNumero(List<Integer> numeros) {
        return encontrarMaiorNumero(numeros, Integer.MIN_VALUE, 0);
    } 
    
    private static int encontrarMaiorNumero(List<Integer> numeros, int maior_numero, int contador) {
        if(numeros.size() == contador+1){
            if(numeros.get(contador) > maior_numero) 
                return numeros.get(contador);
            else
                return maior_numero;
        }
        else{
            if (numeros.get(contador) > maior_numero) 
                return encontrarMaiorNumero(numeros, numeros.get(contador), contador+1);
            else
                return encontrarMaiorNumero(numeros, maior_numero, contador+1);
        }
    }
    
    public static void main(String args[]) {
        System.out.println(encontrarMaiorNumero(List.of(8, 6, 9, 2, 5)));
    }
}
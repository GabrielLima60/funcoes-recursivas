import java.util.List;

public class Somatorio {
    
    public static int somatorio(List<Integer> numeros){
        return somatorio(numeros, 0);
    }
    
    private static int somatorio(List<Integer> numeros, int contador) {
        if (contador >= numeros.size()) 
            return 0;
            
        else 
            return numeros.get(contador) + somatorio(numeros, contador+1);
    }
    
    public static void main(String args[]) {
        System.out.println(somatorio(List.of(1, 2, 1, 4)));
    }
}
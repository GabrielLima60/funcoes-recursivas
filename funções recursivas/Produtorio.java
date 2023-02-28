import java.util.List;

public class Produtorio {
    
    public static int produtorio(List<Integer> numeros){
        return produtorio(numeros, 0);
    }
    
    private static int produtorio(List<Integer> numeros, int contador) {
        if (contador >= numeros.size()) 
            return 1;
            
        else 
            return numeros.get(contador) * produtorio(numeros, contador+1);
    }
    
    public static void main(String args[]) {
        System.out.println(produtorio(List.of(1, 2, 2, 4)));
    }
}
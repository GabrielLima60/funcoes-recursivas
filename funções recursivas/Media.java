import java.util.List;

public class Media {
    
    public static float media(List<Integer> numeros) {
        return media(numeros, 0, 0);
    } 
    
    private static float media(List<Integer> numeros, int tamanho, int contador) {
       if (numeros.size() == contador) {
           return (float) tamanho/numeros.size();
       }
       else {
           return media(numeros, tamanho + numeros.get(contador), contador+1);
       }
    }
    
    public static void main(String args[]) {
        System.out.println(media(List.of(9, 1, 6)));
    }
}
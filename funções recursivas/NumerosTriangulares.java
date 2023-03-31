import java.util.*;

public class NumerosTriangulares {
    
    public static void numerosTriangulares(int n) {
        List<Integer> sequencia = new ArrayList<>();
        numerosTriangulares(n, 1, sequencia);
    }
    
    private static void numerosTriangulares(int n, int contador, List<Integer> sequencia) {
        if (contador == n+1) {
            System.out.println("A sequencia é " + sequencia);
        }
        else {
            sequencia.add(contador*(contador+1)/2);
            numerosTriangulares(n, contador+1, sequencia);
        }
    }
    
    public static void main(String args[]) {
        numerosTriangulares(10);
    }
}



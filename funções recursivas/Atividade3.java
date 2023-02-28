public class DrescenteDecrescente {
    
    public static void crescenteDecrescente(int numero){
        crescenteDecrescente(numero, 0);
    }
    
    private static void crescenteDecrescente(int numero, int contador) {
        System.out.println(contador);
        if(numero <= 0) {
            if(contador > 0 )
                crescenteDecrescente(numero-1, contador-1);
        }
        else 
            crescenteDecrescente(numero-1, contador+1);
    }
    
    public static void main(String args[]) {
        crescenteDecrescente(5);
    }
}

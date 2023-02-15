public class Atividade3 {
    
    public static void CrescenteDecrescente(int numero){
        CrescenteDecrescente(numero, 0);
    }
    
    private static void CrescenteDecrescente(int numero, int contador) {
        System.out.println(contador);
        if(numero <= 0) {
            if(contador > 0 )
                CrescenteDecrescente(numero-1, contador-1);
        }
        else 
            CrescenteDecrescente(numero-1, contador+1);
    }
    
    public static void main(String args[]) {
        CrescenteDecrescente(5);
    }
}
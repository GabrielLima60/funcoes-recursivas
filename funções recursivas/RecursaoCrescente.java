public class RecursaoCrescente {
    
    public static void recursaoCrescente(int numero) {
        if(numero >= 0) {
            recursaoCrescente(numero-1);
            System.out.println(numero);
        }
    }
    
    public static void main(String args[]) {
        recursaoCrescente(7);
    }
}

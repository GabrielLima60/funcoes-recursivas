public class Atividade2 {
    
    public static void recursaoDecrescente(int numero) {
        if (numero >=0){
            System.out.println(numero);
            recursaoDecrescente(numero-1);
        }
    }
    
    public static void main(String args[]) {
        recursaoDecrescente(7);
    }
}
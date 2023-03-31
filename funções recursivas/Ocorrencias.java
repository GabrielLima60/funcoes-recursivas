import java.util.Arrays;

public class Ocorrencias { 

  public static void ocorrencias(int[] array, int elemento) {
    ocorrencias(array, elemento, 0);
  }
  
  private static void ocorrencias(int[] array, int elemento, int contador) {
    
    if (array.length == 0){
      System.out.println("O número de ocorrencias do número "+ elemento +" é de " + contador);
    }
    else {
      if (array[0] == elemento){
        ocorrencias(Arrays.copyOfRange(array, 1, array.length), elemento, contador+1);
      }
      else{
      ocorrencias(Arrays.copyOfRange(array, 1, array.length), elemento, contador);
      }
    }
  }
  
  public static void main(String[] args) {
    int[] array = {1,3,2,3,1,2,2};
    ocorrencias(array, 3);
  }
}

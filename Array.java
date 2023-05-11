import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
    
    int[] array = new int[10];
    int menorNumero = Integer.MAX_VALUE;
    int maiorNumero = Integer.MIN_VALUE;
    var random = new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(50) + 1;
        
        if(array[i] > maiorNumero){
            maiorNumero = array[i];
        }

        if(array[i] < menorNumero){
            menorNumero = array[i];
        }
    }

    System.out.println(Arrays.toString(array));
    System.out.println("O maior número encontrado foi o " + maiorNumero);
    System.out.println("O menor número encontrado foi o " + menorNumero);
    }
}

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        int tentativas = 0;

        while(tentativas < 5){
            System.out.println("Digite o número que você acha entre 0 e 10");
            int numero = leitura.nextInt();

            if(numero < numeroAleatorio){
                System.out.println("O Número escolhido é menor que o numero aleatorio!");
                tentativas++;
            } else if (numero > numeroAleatorio){
                System.out.println("O Número escolhido é maior que o número aleatório!");
                tentativas++;
            } else {
                System.out.println("Acertou o número!");
                System.out.println("O número era: "+ numeroAleatorio);
                break;
            }

            if(tentativas == 5){
                System.out.println("Número de tentativas excedido, encerrando programa.");
                break;
            }
        }

    }
}

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual seu filme favorito?");
        String filme = leitura.nextLine();
        System.out.println("Qual nota você dá pra esse filme?");
        int nota = leitura.nextInt();

        System.out.println("Filme favorito é : " + filme);
        System.out.println("Nota que dou para o filme: " + nota);
    }
}

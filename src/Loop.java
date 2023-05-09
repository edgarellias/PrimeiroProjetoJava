import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua nota para o filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média de avalições: " + mediaAvaliacao/3);

    }
}

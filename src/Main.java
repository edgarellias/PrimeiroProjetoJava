import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        String nomeDoFilme = "Top Gun: Maverick";
        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;


        boolean incluidoNoPlano = true;

        if(incluidoNoPlano) {
            System.out.println("Nome do Filme: " + nomeDoFilme);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            System.out.println("A nota do filme é : " + notaDoFilme);
        }
    }
}
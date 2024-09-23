import java.util.Scanner;

public class Beecrowd1040 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);

        float N1, N2, N3, N4, media;
        String sequencia;
        String[] partes;

        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        N1 = Float.parseFloat(partes[0]);
        N2 = Float.parseFloat(partes[1]);
        N3 = Float.parseFloat(partes[2]);
        N4 = Float.parseFloat(partes[3]);

        media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float exame, mediaFinal;
            exame = leitor.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            mediaFinal = (media + exame) / 2;
            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
    }
}

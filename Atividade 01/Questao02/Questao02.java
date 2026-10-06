import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de estudantes da turma: ");
        int qtdEstudantes = scanner.nextInt();

        double somaNotas = 0;
        double maiorNota = 0;
        double menorNota = 0;
        int aprovados = 0;

        for(int i = 1; i <= qtdEstudantes; i++) {
            
            System.out.print("Digite a nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            somaNotas += nota;

            if (i == 1) {
                maiorNota = nota;
                menorNota = nota;
            } else {
                
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
                if (nota < menorNota) {
                    menorNota = nota;
                }
            }

            if (nota >= 7.0) {
                aprovados++;
            }
        }

        double mediaTurma = somaNotas / qtdEstudantes;

        System.out.println("--- RESULTADO ---");
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Quantidade de estudantes aprovados: " + aprovados);

        scanner.close();
    }
}

import java.util.Scanner;

public class Questao01 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println ("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println ("Digite a sua cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.println ();
        System.out.println ("-----Dados do Estudante-----");
        System.out.println (nome);
        System.out.println (idade + " anos");
        System.out.println (cidade);
        
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Dados do primeiro objeto
        Aluno a1 = new Aluno();

        System.out.print("Digite o rm: ");
        a1.rm = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite o nome: ");
        a1.name = teclado.nextLine();

        System.out.print("Digite a idade: ");
        a1.idade = teclado.nextInt();

        System.out.print("Digite a nota 1: ");
        a1.nota1 = teclado.nextFloat();

        System.out.print("Digite a nota 2: ");
        a1.nota2 = teclado.nextFloat();

        // Dados do segundo Objeto
        Aluno a2 = new Aluno();

        System.out.print("Digite o rm: ");
        a2.rm = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite o nome: ");
        a2.name = teclado.nextLine();

        System.out.print("Digite a idade: ");
        a2.idade = teclado.nextInt();

         System.out.print("Digite a nota 1: ");
        a2.nota1 = teclado.nextInt();

        System.out.print("Digite a nota 2: ");
        a2.nota2 = teclado.nextInt();

        System.out.print("RM: \t" + a1.rm + "\nNome: \t" + a1.name + "\nIdade: \t" + a1.idade + "\nNota 1: \t" + a1.nota1 + "\nNota2: \t" + a1.nota2 + "\nMedia: \t" + a1.calcularMedia());
        System.out.println();
        System.out.print("RM: \t" + a2.rm + "\nNome: \t" + a2.name + "\nIdade: \t" + a2.idade + "\nNota 1: \t" + a2.nota1 + "\nNota2: \t" + a2.nota2 + "\nMedia: \t" + a2.calcularMedia());

        teclado.close();
    }
}
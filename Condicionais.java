import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("Olá %s! Você tem %s anos. Você pode dirigir! \n", name, age);
        } else {
            System.out.printf("Olá %s!\n", name);
            System.out.println("Você não pode dirigir!");
        }

        System.out.println("Fim da execução!");
    }
}

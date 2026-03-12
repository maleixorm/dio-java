import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Informe o seu nome: ");
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("Ola %s! Sua idade é %s anos. \n", name, age);
    }
}
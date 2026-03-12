import java.util.Scanner;

public class Inicio {

    private final static String WELCOME_MESSAGE = "Seja bem-vindo! Informe o seu nome: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("Olá %s! Sua idade é %s anos. \n", name, age);
    }
}
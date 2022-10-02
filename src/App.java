import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            System.out.println("O número digitado foi: " + numero);
        }
    }
}

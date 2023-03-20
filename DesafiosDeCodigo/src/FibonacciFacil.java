import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciFacil {

    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            try {
                int N = leitor.nextInt();
                int anterior = 0, atual = 1, proximo;
                for (int i = 1; i <= N; i++) {
                    if (i == N) {
                        System.out.println(anterior);
                    } else {
                        System.out.print(anterior + " ");
                        proximo = anterior + atual;
                        anterior = atual;
                        atual = proximo;
                    }
                }
            } catch (InputMismatchException err) {
                System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
            }
        }
    }
}
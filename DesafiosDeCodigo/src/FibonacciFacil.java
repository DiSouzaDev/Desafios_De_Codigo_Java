import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciFacil {

    public static void main(String[] args) throws IOException {

        boolean continueCodigo = false;

        do {
            try {
                Scanner leitor = new Scanner(System.in);
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
                continueCodigo = true;
                leitor.close();
            } catch (InputMismatchException err) {
                System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
            }
        } while (continueCodigo == false);
    }

}
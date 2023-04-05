import java.util.*;

public class Dragao {

    public static void main(String[] args) {

        boolean continueCodigo = false;

        do {
            try {
                Scanner ler = new Scanner(System.in);
                int casos, poderDeLuta;

                casos = ler.nextInt();

                for (int i = 0; i < casos; i++) {
                    poderDeLuta = ler.nextInt();

                    if (poderDeLuta <= 8000) {
                        System.out.println("Inseto!");
                    } else {
                        System.out.println("Mais de 8000!");
                    }
                }
                continueCodigo = true;
                ler.close();
            } catch (InputMismatchException err) {
                System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
            }
        } while (continueCodigo == false);
    }
}
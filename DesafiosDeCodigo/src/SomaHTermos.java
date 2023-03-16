import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaHTermos {

  public static void main(String[] Args) {
    try(Scanner sc = new Scanner(System.in);){
        try{
            double h = 0;
            double n = sc.nextDouble();
            for (int i = 1; i <= n; i++) {
                h = h + (double)1/i;
                //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            }
            //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
            System.out.println(Math.round(h));
        } catch (InputMismatchException err) {
            System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
        }
    }
  }
}
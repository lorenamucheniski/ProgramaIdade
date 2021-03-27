
import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int nasc = teclado.nextInt();
        int id = 2015-nasc;
        System.out.println("Sua idade é " + id );
        if (id>=18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

    }

}

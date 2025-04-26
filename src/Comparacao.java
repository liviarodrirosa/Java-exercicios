import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        System.out.println("Comparacao de numeros indicando o maior");

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um primeiro numero");
        int numero1 = scanner.nextInt();

        System.out.println("digite un segundo numero");
        int numero2 = scanner.nextInt();

        if (numero2 < numero1) {
            System.out.println("primeiro numero maior que o segundo numero");

            }

            else if (numero1 < numero2) {
            System.out.println("segundo numero maior que primeiro numero");

        }
                else {
                System.out.println("os dois numeros sao iguais");
                }

                scanner.close();
            }}






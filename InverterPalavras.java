import java.util.Scanner;
import java.util.Stack;

public class InverterPalavras {
    public static String inverterPalavras(String frase) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                pilha.push(c);
            } else {
                while (!pilha.empty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(' ');
            }
        }

        while (!pilha.empty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        System.out.println("Frase invertida: "+inverterPalavras(frase));
        input.close();
    }
}
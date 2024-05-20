import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o primeiro parametro: ");
        int parametroUm = ler.nextInt();
        System.out.print("Informe o segundo parametro: ");
        int parametroDois = ler.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println("Imprimindo numero: " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parametro deve ser maior que o primeiro!");
    }
}


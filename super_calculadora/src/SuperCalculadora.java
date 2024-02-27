import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String escolha;
        int valor1, valor2;

        System.out.println("Olá, seja bem vindo \nEscolha uma ação: ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1: Soma (+)");
        System.out.println("2: Subtração (-)");
        System.out.println("3: Multiplicação (*)");
        System.out.println("4: Divisão (/)");
        System.out.println("5: Potência (^)");
        System.out.println("6: Raiz Quadrada (R)");
        System.out.println("7: Módulo/Resto da Divisão (|)");
        System.out.println("8: Porcentagem (%)");
        System.out.println("9: Tabuada (T)");
        System.out.println("10: Trigonometria (L)");
        System.out.println("11: Área (A)");
        System.out.println("12: Volume (V)");
        System.out.println("13: Conversor de Unidades (C)");
        System.out.println("----------------------------------------------------------------\n");

        escolha = sc.next().toUpperCase();

        if (escolha.equals("6") || escolha.equalsIgnoreCase("R") || escolha.equals("9")
                || escolha.equalsIgnoreCase("T")) {
            System.out.println("Digite o valor");
            valor1 = sc.nextInt();
            valor2 = 0;

        } else {
            System.out.println("Digite o valor 1");
            valor1 = sc.nextInt();
            System.out.println("Digite o valor 2");
            valor2 = sc.nextInt();
        }

        System.out.println();

        switch (escolha) {
            case "1", "+":
                System.out.println("Resultado: " + (valor1 + valor2));
                break;

            case "2", "-":
                System.out.println("Resultado: " + (valor1 - valor2));
                break;

            case "3", "*":
                System.out.println("Resultado: " + valor1 * valor2);
                break;

            case "4", "/":
                if (valor2 == 0) {
                    System.out.println("Erro: Divisão por zero");
                } else {
                    System.out.println("Resultado: " + (double) valor1 / valor2);
                }
                break;

            case "5", "^":
                System.out.println("Resultado: " + (int) Math.pow(valor1, valor2));
                break;

            case "6", "R":
                if (valor1 < 0) {
                    System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
                } else {
                    System.out.println("Resultado: " + (int) Math.sqrt(valor1));
                }
                break;

            case "7", "|":
                System.out.println("Resultado: " + valor1 % valor2);
                break;

            case "8", "%":
                double porcentagem = (double) valor1 * valor2 / 100;
                System.out.println("Resultado: " + porcentagem);
                break;

            case "9", "T":
                for (int i = 1; i <= 10; i++) {
                    System.out.println(valor1 + " * " + i + " = " + valor1 * i);
                }
                break;

            case "13", "C":
                conversorDeUnidade(valor1);
                break;
            default:
                System.out.println("Operação inválida");
        }

    }

    public static void conversorDeUnidade(int valor) {
        Scanner unidade = new Scanner(System.in);
        System.out.println("Escolha a conversão que deseja: ");
        System.out.println("1: m -> cm");
        System.out.println("2: cm -> m");
        String escolhaUnidade = unidade.nextLine();

        switch (escolhaUnidade) {
            case "1":
                System.out.println("Resultado " + (double) valor / 100 + "cm");
                break;

            case "2":
                System.out.println("Resultado " + (double) valor * 100 + "m");
                break;

            default:
                break;
        }
    }
}

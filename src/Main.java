import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao TP 3 de Java de Samuel!");

        int x;

        do {
            System.out.println("\nEscolha um exercício para rodar:");
            System.out.print("Digite a opção desejada: ");
            System.out.println("0 - Sair");
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " - Exercício " + i);
            }

            x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 0 -> System.exit(0);
                case 1 -> ex1();
                case 2 -> ex2();
                case 3 -> ex3();
                case 4 -> ex4();
                case 5 -> ex5();
                case 6 -> ex6();
                case 7 -> ex7();
                case 8 -> ex8();
                case 9 -> ex9();
                case 10 -> ex10();
                case 11 -> ex11();
                case 12 -> ex12();
                default -> System.out.println("Valor inválido! Tente novamente.");
            }
        } while (x != 0);
        sc.close();
    }

    public static void ex1() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 1:");

        /*
        * 1. Classe: Pode ser considerada uma abstração de algo, além de um conjunto de funcionalidades e moldes expecificos dessa abstrção.
        * 2. Objeto: É a instância da própria classe, os objetos herdam as mesmas funcionalidades da classe, porém encapsulam tanto estado quanto comportamento de cada objeto, assim se tornando único.
        * 3. Atributo: São as características da classe, ou seja, são as variáveis que definem o objeto na hora da criação.
        * 4. Método: São as funções que a classe pode executar, ou seja, são as ações que o objeto pode realizar.
        */

        System.out.println("Exemplo de criação de uma classe");
        class Carro {
            String marca;
            String modelo;
            int ano;
            String cor;

            void getInfo() {
                System.out.println("Explicação: Esse método exibe os valores dos atributos passados ao objeto anteriormente.");

                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Ano: " + ano);
                System.out.println("Cor: " + cor);
            }

            void acelerar() {
                System.out.println("Acelerando...");
            }

            void frear() {
                System.out.println("Freando...");
            }
        }

        System.out.println("Exemplo de criação de um novo objeto.");
        Carro carro1 = new Carro();
        
        System.out.println("Exemplo de atribuição dos valores dos atributos do objeto.");
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2021;
        carro1.cor = "Vermelho";

        System.out.println("Exemplo de chamada dos método com os valores do objeto e métodos da classe.");
        carro1.acelerar();
        carro1.frear();
        carro1.getInfo();

        System.out.println("\n==============\n");
    }

    public static void ex2() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 2:");
        System.out.println("\n==============\n");
    }

    public static void ex3() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 3:");
        System.out.println("\n==============\n");
    }

    public static void ex4() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 4:");
        System.out.println("\n==============\n");
    }

    public static void ex5() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 5:");
        System.out.println("\n==============\n");
    }

    public static void ex6() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 6:");
        System.out.println("\n==============\n");
    }

    public static void ex7() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 7:");
        System.out.println("\n==============\n");
    }

    public static void ex8() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 8:");
        System.out.println("\n==============\n");
    }

    public static void ex9() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 9:");
        System.out.println("\n==============\n");
    }

    public static void ex10() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 10:");
        System.out.println("\n==============\n");
    }

    public static void ex11() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 11:");
        System.out.println("\n==============\n");
    }

    public static void ex12() {
        System.out.println("\n==============\n");
        System.out.println("Exercício 12:");
        System.out.println("\n==============\n");
    }
}
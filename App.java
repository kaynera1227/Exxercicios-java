package Exercicios;

import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);

    public void calcular() {
        System.out.println("Informe o 1 numero");
        double numero1 = sc.nextInt();
        System.out.println("Informe o 2 numero");
        double numero2 = sc.nextInt();
        System.out.println("Informe a operacao desejada, 1 = Adicao, 2 = Subtracao, 3 = Divisao, 4 = multiplicacao");
        int operacao = sc.nextInt();
        double resultado;
        if (operacao == 1) {
            resultado = numero1+numero2;
            System.out.println("O resultado da adição" + resultado);
        }
        if (operacao == 2) {
            resultado = numero1-numero2; 
            System.out.println("O resultado da subtração" + resultado );
            
        }
        if (operacao == 3) {
            resultado = numero1/numero2;
            System.out.println("O resultado da divisao" + resultado );
        }
        if (operacao == 4) {
            resultado = numero1*numero2;
            System.out.println("O resultado da multiplicacao" + resultado );
        }

    }
    
    public void times() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número de matrícula do aluno: ");
            int matricula = scanner.nextInt();
            int time = matricula % 4;
            switch (time) {
                case 0:
                    System.out.println("O aluno " + matricula + " foi adicionado ao Time do Chris.");
                    break;
                case 1:
                    System.out.println("O aluno " + matricula + " foi adicionado ao Time do Greg.");
                    break;
                case 2:
                    System.out.println("O aluno " + matricula + " foi adicionado ao Time do Caruso.");
                    break;
                case 3:
                    System.out.println("O aluno " + matricula + " foi adicionado ao Time do Jerome.");
                    break;
            }
            scanner.close();
        }
        public void quitanda(){
            final double PRECO_MORANGO = 3.50;
        final double PRECO_MACA = 2.30;
        final double PRECO_BANANA = 1.80;
        final double DESCONTO = 0.10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de morangos (em Kg): ");
        double qtdMorango = scanner.nextDouble();
        System.out.print("Quantidade de maçãs (em Kg): ");
        double qtdMaca = scanner.nextDouble();
        System.out.print("Quantidade de bananas (em Kg): ");
        double qtdBanana = scanner.nextDouble();

        double valorTotal = qtdMorango * PRECO_MORANGO + qtdMaca * PRECO_MACA + qtdBanana * PRECO_BANANA;
        if (valorTotal > 30 || qtdMorango + qtdMaca + qtdBanana > 15) {
            double desconto = valorTotal * DESCONTO;
            valorTotal -= desconto;
            System.out.println("Parabéns! Você ganhou um desconto de " + DESCONTO * 100 + "%");
        }

        System.out.printf("Total a pagar: R$ %.2f", valorTotal);
        scanner.close();
    }

        }
    
    


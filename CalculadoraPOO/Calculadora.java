package CalculadoraPOO;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do professor:");
        String nome = teclado.nextLine();

        System.out.println("Digite o regime de pagamento:");
        System.out.println("1-CLT");
        System.out.println("2-Horista");
        System.out.println("3-PJ");

        int regimePagamento = teclado.nextInt();
        double salario = 0;

        if(regimePagamento == 1){
            System.out.println("Digite o salário mensal do professor ");
            double salario_Mensal = teclado.nextDouble();
            ProfessorCTL professorCLT = new ProfessorCTL(nome, salario_Mensal);
            salario = professorCLT.calcularSalario();
        }
        else if(regimePagamento == 2){
            System.out.println("Digite o valor da hora de trabalhado");
            double valor_Hora = teclado.nextDouble();
            System.out.println("Digite a quantidade de horas trabalhadas");
            int horas_Trabalhadas = teclado.nextInt();
            ProfessorHora professorHora =  new ProfessorHora(nome, horas_Trabalhadas, valor_Hora);
            salario = professorHora.calcularSalario();
        }   
        else if(regimePagamento == 3){
            System.out.println("Digite do valor combinado no contrato");
            double valor_Contrato = teclado.nextDouble();
            ProfessorPJ professorPJ = new ProfessorPJ(nome, valor_Contrato);
            salario = professorPJ.calcularSalario();       
        }
        else {
          System.out.println("Regime inválido! Tente novamente.");
          System.exit(0);
          }

        teclado.close();
          
          System.out.println("Nome do professor: " + nome);
          System.out.println("Salário do professor: " + salario);
  }
}
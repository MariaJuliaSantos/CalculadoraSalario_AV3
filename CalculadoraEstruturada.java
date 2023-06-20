import java.util.Scanner;

public class CalculadoraEstruturada {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o nome do professor:");
    String nome = teclado.nextLine();

    System.out.println("Digite o regime de pagamento");
    System.out.println("1-CLT");
    System.out.println("2-Horista");
    System.out.println("3-PJ");
    int regimePagamento = teclado.nextInt();

    double salario = 0;

    if (regimePagamento == 1) {
        System.out.print("Digite o salário mensal:");
        double salarioMensal = teclado.nextDouble();
        salario = salarioMensal;
        } 
    else if (regimePagamento == 2) {
        System.out.print("Digite o número de horas trabalhadas:");
        int horasTrabalhadas = teclado.nextInt();
        System.out.print("Digite o valor da hora de trabalho:");
        double valorHora = teclado.nextDouble();
        salario = horasTrabalhadas * valorHora;
        } 
    else if (regimePagamento == 3) {
        System.out.print("Digite o valor do contrato: ");
        double valorContrato = teclado.nextDouble();
        salario = valorContrato;
        } 
    else {
        System.out.println("Regime inválido! Tente novamente.");
        System.exit(0);
        }

    System.out.println("Nome do professor: " + nome);
    System.out.println("Salário do professor: " + salario);

    teclado.close();
    }
}
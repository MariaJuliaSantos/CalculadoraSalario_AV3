package CalculadoraPOO;

public class ProfessorCTL extends Professor {
  private double salario_Mensal;
public ProfessorCTL(String nome, double salario_Mensal) {
  this.nome = nome;
  this.salario_Mensal = salario_Mensal;
}
public double getValorContrato() {
  return salario_Mensal;
}
public void setValorContrato(double salario_Mensal) {
  this.salario_Mensal = salario_Mensal;
}

public double calcularSalario() {
  return salario_Mensal;
}
}

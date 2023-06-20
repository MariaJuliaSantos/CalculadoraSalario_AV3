package CalculadoraPOO;

public class ProfessorPJ extends Professor {
  private double valor_Contrato;
public ProfessorPJ(String nome, double valor_Contrato) {
  this.nome = nome;
  this.valor_Contrato = valor_Contrato;
}
public double getValorContrato() {
  return valor_Contrato;
}
public void setValorContrato(double valor_Contrato) {
  this.valor_Contrato = valor_Contrato;
}

public double calcularSalario() {
  return valor_Contrato;
}
}

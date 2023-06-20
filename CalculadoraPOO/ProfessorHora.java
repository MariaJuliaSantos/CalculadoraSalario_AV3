package CalculadoraPOO;

public class ProfessorHora extends Professor {
  private int horas_Trabalhadas;
  private double valor_Hora;
public ProfessorHora(String nome, int horas_Trabalhadas, double valor_Hora) {
  this.nome = nome;
  this.horas_Trabalhadas = horas_Trabalhadas;
  this.valor_Hora = valor_Hora;
}
public int getHorasTrabalhadas(int horas_Trabalhadas) {
  return horas_Trabalhadas;
}
public void setHorasTrabalhadas(int horas_Trabalhadas) {
  this.horas_Trabalhadas = horas_Trabalhadas;
}

public double getValorHora() {
  return valor_Hora;
}
public void setValorHora(double valor_Hora) {
  this.valor_Hora = valor_Hora;
}

public double calcularSalario() {
  return horas_Trabalhadas * valor_Hora;
}  
}

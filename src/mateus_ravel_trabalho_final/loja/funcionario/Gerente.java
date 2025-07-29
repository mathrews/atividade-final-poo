package mateus_ravel_trabalho_final.loja.funcionario;

public class Gerente extends Funcionario {
	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	@Override
	public double calcularSalario() {
		setSalarioBase(getSalarioBase() + 2000.0);
		return getSalarioBase();
	}
}

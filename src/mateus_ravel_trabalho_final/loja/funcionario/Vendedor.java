package mateus_ravel_trabalho_final.loja.funcionario;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + (getSalarioBase() / 10);
	}
}

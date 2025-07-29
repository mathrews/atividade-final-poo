package mateus_ravel_trabalho_final.loja.funcionario;

public class Main {
	public static void main(String[] args) {
		Vendedor sailor = new Vendedor("Jorge", 2000);
		Gerente manager = new Gerente("Haroldo", 4000);
		
		System.out.println(String.format("Salario do vendedor: %.2f;\nSalário do gerente: %.2f.\n", sailor.calcularSalario(), manager.calcularSalario()));
	}
}

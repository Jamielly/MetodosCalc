package Ex_1D;

public class Principal {
public static void main(String[] args) {
	//calculadora
	System.out.println("Cálculos básicos da calculadora");
	Calc.soma(3, 6);
	Calc.subtracao(9, 1.8);
	Calc.multiplicacao(7, 8);
	Calc.divisao(5, 2.5);
	
	//Mensagem
	System.out.println("Exercicio mensagem");
	Mensagem.obterMensagem(9);
	Mensagem.obterMensagem(14);
	Mensagem.obterMensagem(1);
	
	//Emprestimo
	System.out.println("Exercicio emprestimo");
	Emprestimo.calcEmprestimo( 1000, Emprestimo.getDuasParcelas());
	Emprestimo.calcEmprestimo( 1000, Emprestimo.getTresParcelas());
	Emprestimo.calcEmprestimo(1000, 5);
}
}

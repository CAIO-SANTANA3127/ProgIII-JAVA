package exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class lista01 {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	System.out.print("Digite a matricula do primeriro emprego:");
	int matricula1 = scanner.nextInt();
	
	System.out.print("Digite seu primeiro salario:");
	double salario1 = scanner.nextDouble();
	
	System.out.print("Digite sua segunda matricula:");
	int matricula2 = scanner.nextInt();
	
	System.out.print("Digite o seu segundo salario:");
	double salario2 = scanner.nextDouble();
	
	double desconto = salario1 * 0.05;
	double acrescimo = salario2 * 0.09;
	
	double salarioFinal1 = salario1 - desconto;
	double salarioFinal2 = salario2 + acrescimo;
	
	System.out.print("Valor do deseconto:" + df.format(desconto));
	System.out.println("Valor do acrescimo:" + df.format(acrescimo));
	System.out.println("Salario final empregado 1" + df.format(salarioFinal1));
	System.out.println("Salario final empregado 2" + df.format(salarioFinal2));
	
	}
}

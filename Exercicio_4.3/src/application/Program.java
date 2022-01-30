package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite seu nome e as 3 notas em sequência: ");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());
		if (aluno.notaFinal() < 60.0) {
		System.out.println("REPROVADO!");
		System.out.printf("FALTAM %.2f PONTOS%n", aluno.faltaPontos());
		}
		else {
		System.out.println("PARABÉNS, VOCÊ PASSOU");
		}
		
		
		sc.close();
		
		
		
	}

}

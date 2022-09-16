package br.edu.univas;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] poligonos = {"Triângulo", "Quadrado", "Trapézio", "Retângulo"};
		boolean menu = true;
		do {
			System.out.println("1- " + poligonos[0]);
			System.out.println("2- " + poligonos[1]);
			System.out.println("3- " + poligonos[2]);
			System.out.println("4- " + poligonos[3]);
			System.out.println("9- Sair");
			String escolha = scanner.next();
			
			switch(escolha) {
			case "1":
				System.out.println("Qual o valor da base do " + poligonos[0] + "?");
				float baseTriangulo = scanner.nextFloat();
				System.out.println("Qual o valor da altura do " + poligonos[0] + "?");
				float alturaTriangulo = scanner.nextFloat();
				float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
				System.out.println("A área do "+ poligonos[0] + " é igual a: " + areaTriangulo + "\n");
				break; 
			case "2":
				System.out.println("Qual o valor do primeiro lado do " + poligonos[1] + "?");
				float baseQuadrado = scanner.nextFloat();
				System.out.println("Qual o valor do segundo lado do " + poligonos[1] + "?");
				float alturaQuadrado = scanner.nextFloat();
				float areaQuadrado = (baseQuadrado * alturaQuadrado);
				System.out.println("A área do " + poligonos[1] + " é igual a: " + areaQuadrado + "\n");
				break;
			case "3":
				System.out.println("Qual o valor da base do " + poligonos[2] + "?");
				float baseMenorTrapezio = scanner.nextFloat();
				System.out.println("Qual o valor da Base do " + poligonos[2] + "?");
				float baseMaiorTrapezio = scanner.nextFloat();
				System.out.println("Qual o valor da altura do " + poligonos[2] + "?");
				float alturaTrapezio = scanner.nextFloat();
				float areaTrapezio = ((baseMenorTrapezio + baseMaiorTrapezio) * alturaTrapezio) / 2;
				System.out.println("A área do " + poligonos[2] + " é igual a: " + areaTrapezio + "\n");
				break; 
			case "4":
				System.out.println("Qual o valor da base do " + poligonos[3] + "?");
				float baseRetangulo = scanner.nextFloat();
				System.out.println("Qual o valor da altura do " + poligonos[3] + "?");
				float alturaRetangulo = scanner.nextFloat();
				float areaRetangulo = (baseRetangulo * alturaRetangulo) / 2;
				System.out.println("A área do "+ poligonos[0] + " é igual a: " + areaRetangulo + "\n");
				break;
			case "9":
				menu = false;
				break;
			 default:
				 System.out.println("Opção inválida! Por favor, digite uma opção correta!\n");
			} 
		}	while(menu == true);
		scanner.close();
	}
}

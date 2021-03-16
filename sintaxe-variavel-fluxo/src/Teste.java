
public class Teste {
	public static void main(String[] args) {
		System.out.println("OLA");

		int idade;
		idade = 18;
		System.out.println("IDADE: " + idade);

		double salario = 1000.50;
		System.out.println("Salario = " + salario);

		double divisao = 5.0 / 2;
		System.out.println(divisao);

		int valor = (int) salario;
		System.out.println(valor);

		long numeroGrande = 3423587235245345230L;
		System.out.println(numeroGrande);

		char letra = 'a';
		System.out.println(letra);

		String palavra = "batata 2";
		System.out.println(palavra);

		int quantidade = 2;
		boolean a = quantidade >= 2;
		if (idade >= 18 && a) {
			System.out.println("Para bens");

		} else {
			System.out.println("Toddynho");

		}

		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println(total);

		total = 0;
		for (int i = 0; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
package br.org.serratec.model;

public class ExemploRepeticao {

	public static void main(String[] args) {
		
		
		System.out.println("-------------------------");
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------------------------");
		
		int j = 1;
		
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);

		System.out.println("-------------------------");
		
		for (int k = 1; k < 10; k++) {
			if (k == 5 ) {
				break;
			}
			System.out.println(k);
		}
		
		System.out.println("-------------------------");
		
		for (int k = 1; k < 10; k++) {
			if (k == 5 ) {
				continue;
			}
			System.out.println(k);
		}
	}

}

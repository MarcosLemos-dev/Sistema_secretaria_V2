package cursojava.executavel;

public class Arrayvetor {
/* usado para executar o codigo*/
	public static void main(String[] args) {
		/* array pode ser de todos os tipos de dados e objetos tambem*/
		/*array sempre deve ter a quantidade de posiões definidas*/
		double notas[] = new double[4];
		notas[0] = 2.9;
		notas[1] = 6.7;
		notas[2] = 2.0;
		notas[3] = 2.7;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("a nota " + (i + 1) + " é" + notas[i] );
		}
	}
}

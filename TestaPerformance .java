/*
    Compilador online usado para testes: https://www.jdoodle.com/online-java-compiler/
	Source: https://www.eadunifatecie.com.br/mod/assign/view.php?id=222640
    By: Guilherme Silva(Encrypton)
	
    Código para fins de trabalho escolar 
*/

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance
{
	static long tempoArrayList;
	static long tempoHashSet;

	public static void main(String[] args)
	{
		String maisRapido;	

		//teste com 30 mil arrays
		metodoArrayList(30000);
		metodoHashSet(30000);
		maisRapido = tempoArrayList > tempoHashSet ? "HashSet" : "ArrayList";

		System.out.println("Teste de varredura de 30.000 Arrays");
		System.out.println("Método: ArrayList \t Descrição: " + tempoArrayList + " milisegundos ");
		System.out.println("Método: HashSet \t Descrição: " + tempoHashSet + " milisegundos \t Melhor Performace: " + maisRapido + "\n\n");


		//teste com 50 mil arrays
		metodoArrayList(50000);
		metodoHashSet(50000);
		maisRapido = tempoArrayList > tempoHashSet ? "HashSet" : "ArrayList";

		System.out.println("Teste de varredura de 50.000 Arrays");
		System.out.println("Método: ArrayList \t Descrição: " + tempoArrayList + " milisegundos ");
		System.out.println("Método: HashSet \t Descrição: " + tempoHashSet + " milisegundos \t Melhor Performace: " + maisRapido + "\n\n");


		//teste com 100 mil arrays
		metodoArrayList(100000);
		metodoHashSet(100000);
		maisRapido = tempoArrayList > tempoHashSet ? "HashSet" : "ArrayList";

		System.out.println("Teste de varredura de 100.000 Arrays");
		System.out.println("Método: ArrayList \t Descrição: " + tempoArrayList + " milisegundos ");
		System.out.println("Método: HashSet \t Descrição: " + tempoHashSet + " milisegundos \t Melhor Performace: " + maisRapido + "\n\n");


		//teste com 150 mil arrays
		metodoArrayList(150000);
		metodoHashSet(150000);
		maisRapido = tempoArrayList > tempoHashSet ? "HashSet" : "ArrayList";

		System.out.println("Teste de varredura de 150.000 Arrays");
		System.out.println("Método: ArrayList \t Descrição: " + tempoArrayList + " milisegundos ");
		System.out.println("Método: HashSet \t Descrição: " + tempoHashSet + " milisegundos \t Melhor Performace: " + maisRapido + "\n\n");


		//teste com 200 mil arrays
		metodoArrayList(200000);
		metodoHashSet(200000);
		maisRapido = tempoArrayList > tempoHashSet ? "HashSet" : "ArrayList";

		
		System.out.println("Teste de varredura de 200.000 Arrays");
		System.out.println("Método: ArrayList \t Descrição: " + tempoArrayList + " milisegundos ");
		System.out.println("Método: HashSet \t Descrição: " + tempoHashSet + " milisegundos \t Melhor Performace: " + maisRapido + "\n\n");
	}

	public static long metodoArrayList(int valores){
		long inicio = System.currentTimeMillis();
		Collection<Integer> teste = new ArrayList<>();

		int total = valores;

		for (int i = 0; i < total; i++)
		{
			teste.add(i);
		}

		for (int i = 0; i < total; i++)
		{
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempoArrayList = fim - inicio;
		//System.out.println("ArrayList: " + tempoArrayList + " milisgundos");
		return tempoArrayList;
    }

	public static long metodoHashSet(int valores){
		long inicio = System.currentTimeMillis();
		Collection<Integer> teste = new HashSet<>();

		int total = valores;

		for (int i = 0; i < total; i++)
		{
			teste.add(i);
		}

		for (int i = 0; i < total; i++)
		{
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempoHashSet = fim - inicio;
		//System.out.println("HashSet: " + tempoArrayList + " milisgundos");
		return tempoHashSet;
    }
}
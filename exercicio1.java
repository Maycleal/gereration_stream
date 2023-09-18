package stream;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;


public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		ArrayList<String> cor = new ArrayList<String>();
		
		int contador;
		
		
		for(contador = 1; contador <6; contador++) {
			System.out.println("\nDigite a " + contador + "º cor: ");
			cor.add(ler.next());
					
		}
		
		
		System.out.println("\nLista de todas as cores:" + cor);
		
		Collections.sort(cor);
		
		System.out.println("\nLista de todas as cores ordenadas:" + cor);
		
		System.out.println("Stream: " + cor.stream()
        .filter(x -> x.toUpperCase().charAt(0) == 'A')
		. collect(Collectors.toList()));
		
		

	}

}

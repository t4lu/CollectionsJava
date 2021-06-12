package ExerciciosCollection;

import java.util.*;

public class TestaFuncoes {

	public static void main(String[] args) {
	
		String estoque1 = "Calçados";
		String estoque2 = "Camisetas Unissex";
		String estoque3 = "Jeans";
		String estoque4 = "Vestidos Estampados";
		
		ArrayList<String> estoque = new ArrayList <>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		estoque.remove(2);
		System.out.println(estoque);
	}
	
}

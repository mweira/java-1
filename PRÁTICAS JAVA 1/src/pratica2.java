
public class pratica2 {
	
	public static void main(String[] args) {
	
	int idade = 17;
	boolean carteira = true;
	boolean maturidade = idade >=18; 
	
	if(carteira && maturidade) { 
		System.out.println("Você já pode dirigir");
	} 
	
	if(maturidade) { 
		System.out.println("Você já pode tirar sua carta");
	} else { 
		System.out.println("Você não tem idade suficiente pra tirar sua carta");
		}
	} 
} 

// carteira = true e maturidade = true -> Já pode dirigir 
// maturidade = true -> Já pode tirar carta 
// maturidade = false -> Ainda não pode tirar carta 
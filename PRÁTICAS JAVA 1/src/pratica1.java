
public class pratica1 {

	public static void main(String[] args) {
		
		int idade = 18;
		boolean permissao = idade >= 18; 
		
		if(permissao) { 
			System.out.println("Você pode tirar sua carteira de motorista");
		} 
		
		else { 
			System.out.println("Você ainda não pode tirar sua carteira de motorista"); 
		} 
		
	} 
	
} 

// alterando o valor da idade, altera o booleano (permissao) que será true/if caso idade >=18 
// e false/else caso idade <18 
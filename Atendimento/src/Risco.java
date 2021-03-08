import java.util.Scanner;

public class Risco {
	public void Perguntas(){
		Scanner scan = new Scanner (System.in);
		String resposta = scan.next();
		int cont = 0;
		
		System.out.println("sente dor forte no peito associado com nausea, vomitos, sudorezi profusa, falta de ar?");
		if(resposta == "sim") {
			cont++;
		}
		System.out.println("algum membro faltando?");
		if(resposta == "sim") {
			cont++;
		}
		System.out.println("paciente responde a estimulos?");
		if(resposta == "sim") {
			cont++;
		}
		System.out.println("teve contato com algo que tem alergia?");
		if(resposta == "sim") {
			cont++;
		}
		int risco = cont++;
	}
	
	public enum RiscoEnum {
		Emergencia(1), Urgente(2), PoucoUrgente(3), NaoUrgente(4);

			private final int valor;
			RiscoEnum(int valorOpcao){
				valor = valorOpcao;
			}
			public int getValor(){
				return valor;
			}
		}
	
}

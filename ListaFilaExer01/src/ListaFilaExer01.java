
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ListaFilaExer01 {

	public static void main(String[] args) {
		//01 - Crie um programa em java para gerenciar uma 
		//playlist da sua festa em	casa de final de ano.
		//Organize as músicas que deverão ser todas na ordem e
		//insiram em uma fila. 
		//		Inserir musica
		//		Consultar música
		//		Remover música
		//		Sair. 
		Scanner musicaInformada = new Scanner(System.in);
		Scanner opcaoUsuario = new Scanner(System.in);
		Queue<String>objetoFila= new LinkedList<String>(); 
		if(objetoFila.isEmpty()) {
			System.out.println("Sua fila está vazia!");
		}else {
			System.out.println("Fila cheia!");
		}
		int qtd=0;
		do {
			System.out.print("Usuário escolha a opção"
					+ "\n(1) Inserir música"
					+ "\n(2) Consultar música"
					+ "\n(3) Remover música"
					+ "\n(4) Sair");

			int operacao = opcaoUsuario.nextInt();
			switch(operacao) {
			//adicionar
			case 1:
				String musica =recebeMusica(musicaInformada);//método para receber musica
				System.out.println("Musica informada!");
				objetoFila.add(musica);
				System.out.println("Musica adicionada a fila!");	
				System.out.println("Os elementos da sua fila são: ");
				Iterator<String> objetoInterator1 = objetoFila.iterator();
				while (objetoInterator1.hasNext()) {
					System.out.println(objetoInterator1.next());
				}

				break;
			case 2:					
		//consultar
		String musicaConsulta = recebeMusica(musicaInformada);
		if(objetoFila.contains(musicaConsulta)) {
			System.out.println("Essa musica já está na fila!");
		}else {
			System.out.println("Essa musica não está na fila!");
		}
				
		break;
			case 3:
				//remover
				if (objetoFila.size()>0) {
					System.out.println("Preparando para excluir...");
					objetoFila.remove();
					System.out.println("musica excluída!");
					System.out.println("Os elementos da sua fila são: ");
					Iterator<String> objetoInterator2 = objetoFila.iterator();	
					while (objetoInterator2.hasNext()) {
						System.out.println(objetoInterator2.next());
					}
				}
				else {
					System.out.println("Sua fila está vazia!");
				}
				break;
			case 4:
				//sair
				qtd = 10;	
				break;
			default:
				System.out.println("Operação inválida!!!!");
			}

		}while(qtd<5);
		opcaoUsuario.close();
			}
	public static String recebeMusica(Scanner musicaInformada){
		System.out.println("Usuário qual a música?");
		String musica= musicaInformada.nextLine();
		return musica;
	}
}

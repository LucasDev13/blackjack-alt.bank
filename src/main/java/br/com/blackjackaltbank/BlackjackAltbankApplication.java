package br.com.blackjackaltbank;

import br.com.blackjackaltbank.domain.Card;
import br.com.blackjackaltbank.domain.Cheap;
import br.com.blackjackaltbank.domain.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class BlackjackAltbankApplication {

	private static Cheap cheap;
	private static ArrayList<Player> players;
	private static Scanner in = new Scanner(System.in);
	private static int opcaoJogo = 1;
	private static int pontosMaior = 0;
	public static void main(String[] args) {
		SpringApplication.run(BlackjackAltbankApplication.class, args);
		int option = 1;
		Player player;
		String name;

		//Loading
		System.out.println("Loading...");
		cheap = new Cheap();
		cheap.startDeck();
		cheap.shuffle();

		players = new ArrayList<>();

		player = new Player();
		player.setName("Banca");
		players.add(player);
		System.out.printf("Add player.");


		//Initial
		while(option >= 1){

			//home menu
			System.out.println();
			System.out.println("---------- BlackJack ----------");
			System.out.println("------ Digite sua opção -------");
			System.out.println();
			System.out.println("1 - Adicionar Jogador");
			System.out.println("2 - Iniciar Jogo");
			System.out.println("0 - Sair");
			option = in.nextInt();

			//Add player
			if(option == 1){
				player = new Player();
				System.out.println("\nDigite o nome do jogador:");
				name = new String(in.next());
				player.setName(name);
				players.add(player);
			}

			//Game
			if(option == 2){
				if(players.size() < 2){
					System.out.println("Voce precisa adicionar jogadores!!!");
				}
				else{
					while(opcaoJogo >= 1){

						//primeira rodada
						if(opcaoJogo == 1){
							giveCardsFromTheDeck(players, cheap);
							opcaoJogo = 2;
						}

						//demais rodadas
						else if(opcaoJogo == 2){

							for(int p = (players.size() - 1); p >= 0; p--){
								while(players.get(p).getPoint() <= 21 && opcaoJogo != 3){

									toPlay(players.get(p), cheap);

								}
								opcaoJogo = 2;
							}

							opcaoJogo = -1;
							winer();
						}
					}
					option = -1;
				}
			}
		}
	}

	public static void  giveCardsFromTheDeck(ArrayList<Player> players, Cheap cheap){
		for(int i = 1; i <= 2; i++){
			for(Player p: players){
				p.addCard(cheap.remove());
			}
		}
	}

	public static void showTable(ArrayList<Player> jogadores){
		System.out.println();
		System.out.println("|¨¨   Mesa   ¨¨|");

		for(Player p: jogadores){
			System.out.println("-------------------------");
			System.out.print("Player: ");
			System.out.print("\t" + p.getName());
			System.out.println("\nCartas:");

			for(Card c: p.getHand()){
				System.out.println("\t" + c.getName() + " de " + c.getSuit());
			}

			System.out.println("Pontos -> ");
			System.out.println("\t" + p.getPoint());
			System.out.println();
		}
		System.out.println("|__   Mesa   __|");
		System.out.println();
	}

	public static void toPlay(Player player, Cheap cheap){

		showTable(players);
		System.out.println();
		System.out.println("Player: " + player.getName());
		System.out.println("------ Digite sua opção -------");
		System.out.println("2 - Hint (receber uma carta)");
		System.out.println("3 - Stand (encerrar mao)");
		opcaoJogo = in.nextInt();

		//hint
		if(opcaoJogo == 2){
			player.addCard(cheap.remove());
		}

		//stand
		if(opcaoJogo == 3){
			System.out.println("Opcao:  Stand -> Pontos: " + player.getPoint());
		}

		if(player.getPoint() >= pontosMaior && player.getPoint() <= 21){
			pontosMaior = player.getPoint();
		}
	}

	public static void winer(){
		int contEmpate = 0;

		System.out.println("--------------");
		System.out.println("     \\o/     ");
		System.out.println();
		System.out.println("Vencedor(es): ");
		System.out.println();

		for(Player p: players){
			if(p.getPoint() == pontosMaior){
				System.out.println(p.getName() + " Pontos -> " + p.getPoint());
				contEmpate++;
			}
		}
		if(contEmpate > 1){
			System.out.println("Portanto, tivemos um empate!!!!");
		}
		System.out.println();
		System.out.println("     \\o/     ");
		System.out.println("--------------");
		System.out.println();
	}
}


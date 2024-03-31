package model.application;

import model.entities.*;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);

        System.out.printf("__________CAMPEONATO HANDBALL__________\n\n");

        //Endereco
        System.out.println("___________Endereços___________");
        Endereco e1 = new Endereco();

        System.out.println("ID: ");
        e1.setId(input.nextInt()); input.nextLine();

        System.out.println("Logradouro: ");
        e1.setLogradouro(input.nextLine());

        System.out.println("Numero: ");
        e1.setNumero(input.nextInt());
        input.nextLine();

        System.out.println("Complemento: ");
        e1.setComplemento(input.nextLine());

        System.out.println("Bairro: ");
        e1.setBairro(input.nextLine());

        Endereco e2 = new Endereco();

        System.out.println("ID: ");
        e2.setId(input.nextInt()); input.nextLine();

        System.out.println("Logradouro: ");
        e2.setLogradouro(input.nextLine());

        System.out.println("Numero: ");
        e2.setNumero(input.nextInt());
        input.nextLine();

        System.out.println("Complemento: ");
        e2.setComplemento(input.nextLine());

        System.out.println("Bairro: ");
        e2.setBairro(input.nextLine());

        System.out.println("TIME 1");

        //Jogador 1
        System.out.println("___________Jogadores___________");
        Jogador j1 = new Jogador();

        System.out.print("ID: ");
        j1.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome do Capitão: ");
        j1.setNome(input.nextLine());

        System.out.print("Nascimento (dd/MM/yyyy): ");
        j1.setNascimento(LocalDate.parse(input.nextLine(), dtf));

        System.out.print("Genero: ");
        j1.setGenero(input.nextLine());

        System.out.print("Altura: ");
        j1.setAltura(input.nextDouble());

        //Jogador 2
        Jogador j2 = new Jogador();

        System.out.print("ID: ");
        j2.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        j2.setNome(input.nextLine());

        System.out.print("Nascimento (dd/MM/yyyy): ");
        j2.setNascimento(LocalDate.parse(input.nextLine(), dtf));

        System.out.print("Genero: ");
        j2.setGenero(input.nextLine());

        System.out.print("Altura: ");
        j2.setAltura(input.nextDouble());

        System.out.println("TIME 2");

        //Jogador 3
        Jogador j3 = new Jogador();

        System.out.print("ID: ");
        j3.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome do Capitão: ");
        j3.setNome(input.nextLine());

        System.out.print("Nascimento (dd/MM/yyyy): ");
        j3.setNascimento(LocalDate.parse(input.nextLine(), dtf));

        System.out.print("Genero: ");
        j3.setGenero(input.nextLine());

        System.out.print("Altura: ");
        j3.setAltura(input.nextDouble());

        //Jogador 4
        Jogador j4 = new Jogador();

        System.out.print("ID: ");
        j4.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        j4.setNome(input.nextLine());

        System.out.print("Nascimento (dd/MM/yyyy): ");
        j4.setNascimento(LocalDate.parse(input.nextLine(), dtf));

        System.out.print("Genero: ");
        j4.setGenero(input.nextLine());

        System.out.print("Altura: ");
        j4.setAltura(input.nextDouble());

        System.out.println("TIME 3");

        //Jogador 5
        Jogador j5 = new Jogador();

        System.out.print("ID: ");
        j5.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome do Capitão: ");
        j5.setNome(input.nextLine());

        System.out.print("Nascimento (dd/MM/yyyy): ");
        j5.setNascimento(LocalDate.parse(input.nextLine(), dtf));

        System.out.print("Genero: ");
        j5.setGenero(input.nextLine());

        System.out.print("Altura: ");
        j5.setAltura(input.nextDouble());

        //Jogador 6
        Jogador j6 = new Jogador();

        System.out.print("ID: ");
        j6.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        j6.setNome(input.nextLine());

        System.out.print("Nascimento (dd/MM/yyyy): ");
        j6.setNascimento(LocalDate.parse(input.nextLine(), dtf));

        System.out.print("Genero: ");
        j6.setGenero(input.nextLine());

        System.out.print("Altura: ");
        j6.setAltura(input.nextDouble());

        //Estádio
        System.out.println("___________Estádios___________");
        Estadio ee1 = new Estadio();

        System.out.print("ID: ");
        ee1.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        ee1.setNome(input.nextLine());

        //Times
        System.out.println("___________Times___________");
        Time t1 = new Time();

        System.out.print("ID: ");
        t1.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        t1.setNome(input.nextLine());

        t1.setCapitao(j1);
        t1.addJogador(j1);
        t1.addJogador(j2);
        t1.addVitoria(2, 0);
        t1.addDerrota(1, 3);

        Time t2 = new Time();

        System.out.print("ID: ");
        t2.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        t2.setNome(input.nextLine());

        t2.setCapitao(j3);
        t2.addJogador(j3);
        t2.addJogador(j4);
        t2.addDerrota(0,2);
        t2.addEmpate(2, 2);


        Time t3 = new Time();

        System.out.print("ID: ");
        t3.setId(input.nextInt());
        input.nextLine();

        System.out.print("Nome: ");
        t3.setNome(input.nextLine());

        t3.setCapitao(j5);
        t3.addJogador(j5);
        t3.addJogador(j6);
        t3.addEmpate(2, 2);
        t3.addVitoria(3, 1);

        //Partidas

        List<Time> times = List.of(t1, t2, t3);
        Partida p1 = new Partida(LocalDate.of(2023, 1, 1), t1, t2, 1, 2, true, ee1);
        Partida p2 = new Partida(LocalDate.of(2023, 1, 2), t2, t3, 2, 0, true, ee1);
        Partida p3 = new Partida(LocalDate.of(2023, 1, 3), t1, t3, 3, 0, false, ee1);
        Partida p4 = new Partida(LocalDate.of(2023, 1, 4), t2, t1, 2, 2, true, ee1);
        Partida p5 = new Partida(LocalDate.of(2023, 1, 5), t3, t2, 4, 0, true, ee1);
        Partida p6 = new Partida(LocalDate.of(2023, 1, 6), t3, t1, 1, 1, true, ee1);

        List<Partida> partidas = new ArrayList<>();
        partidas.add(p1);
        partidas.add(p2);
        partidas.add(p3);
        partidas.add(p4);
        partidas.add(p5);
        partidas.add(p6);

        Campeonato campeonato = new Campeonato(1, 2023, "Brasileirão");

        int opcao;

        do {
            System.out.println("\n\n ---ESCOLHA UMA OPÇÃO---");
            System.out.println("0 -. Sair");
            System.out.println("1 - Partidas ocorridas");
            System.out.println("2 - Partidas não ocorridas");
            System.out.println("3 - Tabela do campeonato");
            System.out.println("4 - Endereço dos estádios");
            System.out.println("5 - Informações dos jogadores");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nPartidas ocorridas:");
                    campeonato.listarPartidasOcorridasComJogadores();
                    break;
                case 2:
                    System.out.println("\nPartidas não ocorridas:");
                    campeonato.listarPartidasNaoOcorridas();
                    break;
                case 3:
                    System.out.println("\nTabela do campeonato:");
                    campeonato.listarTabela(true);
                    break;
                case 4:
                    System.out.println("\nInformações sobre os estádios:");
                    for (Time time : times) {
                        System.out.println(time.getEstadioSede().getNome() + ":\n " + time.getEstadioSede().getEndereco());
                    }
                    break;
                case 5:
                    System.out.println("\n\nCaracteristicas dos jogadores:");
                    for (Time time : times) {
                        System.out.println("Time: " + time.getNome());
                        for (Jogador jogador : time.getJogadores()) {
                            System.out.println("Nome: " + jogador.getNome() + ", Gênero: " + jogador.getGenero() +
                                    ", Altura: " + jogador.getAltura() + "Capitão: " + time.getCapitao());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Fechando programa");
                    break;
                default:
                    System.out.println("Tente de novo!!!");
            }
        } while (opcao != 0);

        input.close();
    }
}
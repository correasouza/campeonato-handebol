package model.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Campeonato {
    private Integer id;
    private Integer ano;
    private String nome;
    private List<Time> times;
    private List<Partida> partidas = new ArrayList<>();
    private List<Partida> partidasOcorridas = new ArrayList<>();
    private List<Partida> partidasNaoOcorridas = new ArrayList<>();

    public Campeonato(Integer id, Integer ano, String nome) {
        this.id = id;
        this.ano = ano;
        this.nome = nome;
    }

    public void addPartida(Partida pt) {
        partidas.add(pt);
    }

    public void removePartida(Partida pt) {
        partidas.remove(pt);
    }

    public void addPartidasOcorridas(Partida pt) {
        partidasOcorridas.add(pt);
    }

    public void removePartidasOcorridas(Partida pt) {
        partidasOcorridas.remove(pt);
    }

    public void addPartidasNaoOcorridas(Partida pt) {
        partidasNaoOcorridas.add(pt);
    }

    public void removePartidasNaoOcorridas(Partida pt) {
        partidasNaoOcorridas.remove(pt);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarPartidasOcorridasComJogadores() {
        System.out.println("Partidas ocorridas:");
        for (Partida partida : partidas) {
            if (partida.isPartidaOcorrida()) {
                System.out.println("Data: " + partida.getData());
                System.out.println("Estádio: " + partida.getEstadio().getNome());
                System.out.println("Time Mandante: " + partida.getMandante().getNome());
                System.out.println("Jogadores Mandante: " + listarNomesJogadores(partida.getMandante()));
                System.out.println("Gols Mandante: " + partida.getGolsMandante());
                System.out.println("Time Visitante: " + partida.getVisitante().getNome());
                System.out.println("Jogadores Visitante: " + listarNomesJogadores(partida.getVisitante()));
                System.out.println("Gols Visitante: " + partida.getGolsVisitante());
                System.out.println("-----");
            }
        }
    }

    private String listarNomesJogadores(Time time) {
        StringBuilder nomes = new StringBuilder();
        List<Jogador> jogadores = time.getJogadores();

        for (int i = 0; i < Math.min(2, jogadores.size()); i++) {
            nomes.append(jogadores.get(i).getNome()).append(", ");
        }

        if (nomes.length() > 0) {
            nomes.delete(nomes.length() - 2, nomes.length());
        }

        return nomes.toString();
    }

    public void listarPartidasNaoOcorridas() {
        System.out.println("Partidas não ocorridas:");
        for (Partida partida : partidas) {
            if (!partida.isPartidaOcorrida()) {
                System.out.println("Data: " + partida.getData());
                System.out.println("Estádio: " + partida.getEstadio().getNome());
                System.out.println("Time Mandante: " + partida.getMandante().getNome());
                System.out.println("Time Visitante: " + partida.getVisitante().getNome());
                System.out.println("-----");
            }
        }
    }

    private void ordenarTimesPorClassificacao() {
        List<Time> timesMutaveis = new ArrayList<>(times);

        Collections.sort(timesMutaveis, Comparator.comparingInt(Time::getSaldoDeVitorias)
                .thenComparingInt(Time::getSaldoDeGols).reversed());

        times = List.copyOf(timesMutaveis);
    }

    public void listarTabela(boolean ordenarPorClassificacao) {
        if (ordenarPorClassificacao) {
            ordenarTimesPorClassificacao();
        }

        System.out.println("Tabela do campeonato:");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Time", "Vitórias", "Empates", "Derrotas", "Gols Marcados", "Gols Sofridos", "Saldo Vitórias", "Saldo Gols");

        for (Time time : times) {
            System.out.printf("%-15s %-10d %-10d %-10d %-15d %-15d %-15d %-10d\n",
                    time.getNome(), time.getVitorias(), time.getEmpates(), time.getDerrotas(),
                    time.getGolsMarcados(), time.getGolsSofridos(), time.getSaldoDeVitorias(), time.getSaldoDeGols());
        }
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "id=" + id +
                ", ano=" + ano +
                ", nome='" + nome + '\'' +
                ", partidas=" + partidas +
                ", partidasOcorridas=" + partidasOcorridas +
                ", partidasNaoOcorridas=" + partidasNaoOcorridas +
                '}';
    }
}
package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private Integer id;
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();
    private Jogador capitao;
    private Estadio estadioSede;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private Integer golsMarcados;
    private Integer golsSofridos;

    public Time() {}

    public Time(String nome, Estadio estadioSede) {
        this.nome = nome;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
        this.estadioSede = estadioSede;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public Integer getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofriodos (Integer golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public void addJogador (Jogador jg) {
        jogadores.add(jg);
    }

    public void setGolsSofridos (Integer golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public void removeJogador (Jogador jg) {
        jogadores.remove(jg);
    }

    public void addVitoria (int golsMarcado, int golsSofridos) {
        this.vitorias++;
        this.golsMarcados += golsMarcado;
        this.golsSofridos += golsSofridos;
    }
    public void addDerrota (int golsMarcado, int golsSofridos) {
        this.derrotas++;
        this.golsMarcados += golsMarcado;
        this.golsSofridos += golsSofridos;
    }
    public void addEmpate (int golsMarcado, int golsSofridos) {
        this.empates++;
        this.golsMarcados += golsMarcado;
        this.golsSofridos += golsSofridos;
    }
    public int getSaldoDeVitorias() {
        return vitorias - derrotas;
    }

    public int getSaldoDeGols() {
        return golsMarcados - golsSofridos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getCapitao() {
        return capitao;
    }

    public void setCapitao(Jogador capitao) {
        this.capitao = capitao;
    }

    public Estadio getEstadioSede() {
        return estadioSede;
    }

    public void setEstadioSede(Estadio estadioSede) {
        this.estadioSede = estadioSede;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", jogadores=" + jogadores +
                ", capitao=" + capitao +
                ", estadioSede=" + estadioSede +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                ", golsMarcados=" + golsMarcados +
                ", golsSofridos=" + golsSofridos +
                '}';
    }
}
package model.entities;

import java.time.LocalDate;

public class Partida {
    private Integer id;
    private LocalDate data;
    private Time mandante;
    private Time visitante;
    private Integer golsVisitante;
    private Integer golsMandante;
    private boolean partidaOcorrida;
    private Estadio estadio;


    public Partida() {}
    public Partida(LocalDate data, Time mandante, Time visitante, Integer golsVisitante, Integer golsMandante, boolean partidaOcorrida, Estadio estadio) {
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsVisitante = golsVisitante;
        this.golsMandante = golsMandante;
        this.partidaOcorrida = partidaOcorrida;
        this.estadio = estadio;

        if (partidaOcorrida) {
            Estatisticas();
        }
    }

    public void Estatisticas() {
        if (partidaOcorrida) {
            if (golsMandante > golsVisitante) {
                mandante.addVitoria(golsMandante, golsVisitante);
                visitante.addDerrota(golsMandante, golsVisitante);
            } else if (golsVisitante > golsMandante) {
                mandante.addDerrota(golsMandante, golsVisitante);
                visitante.addVitoria(golsVisitante, golsVisitante);
            } else {
                mandante.addEmpate(golsMandante, golsVisitante);
                visitante.addEmpate(golsMandante, golsVisitante);
            }
        }
    }

    public Time getMandante() {
        return mandante;
    }


    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public Integer getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(Integer golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public Integer getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(Integer golsMandante) {
        this.golsMandante = golsMandante;
    }

    public boolean isPartidaOcorrida() {
        return partidaOcorrida;
    }

    public void setPartidaOcorrida(boolean partidaOcorrida) {
        this.partidaOcorrida = partidaOcorrida;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", data=" + data +
                ", mandante=" + mandante +
                ", visitante=" + visitante +
                ", golsVisitante=" + golsVisitante +
                ", golsMandante=" + golsMandante +
                ", partidaOcorrida=" + partidaOcorrida +
                ", estadio=" + estadio +
                '}';
    }
}
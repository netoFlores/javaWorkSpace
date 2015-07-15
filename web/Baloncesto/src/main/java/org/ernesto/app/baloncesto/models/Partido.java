package org.ernesto.app.baloncesto.models;

import java.util.Date;

/**
 *
 * @author neto
 */
public class Partido {
    private Integer id;
    private Equipos equipoA;
    private Equipos equipoB;
    private Date fecha;
    private Integer scoreA;
    private Integer ScoreB;

    public Partido() {
    }

    public Partido(Equipos equipoA, Equipos equipoB, Date fecha, Integer scoreA, Integer ScoreB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.fecha = fecha;
        this.scoreA = scoreA;
        this.ScoreB = ScoreB;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Equipos getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(Equipos equipoA) {
        this.equipoA = equipoA;
    }

    public Equipos getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(Equipos equipoB) {
        this.equipoB = equipoB;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getScoreA() {
        return scoreA;
    }

    public void setScoreA(Integer scoreA) {
        this.scoreA = scoreA;
    }

    public Integer getScoreB() {
        return ScoreB;
    }

    public void setScoreB(Integer ScoreB) {
        this.ScoreB = ScoreB;
    }
    
    
}

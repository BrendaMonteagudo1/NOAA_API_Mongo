package ar.com.noaamongo.noaa.entities;
import java.util.*;


public class Muestra {
  

    private Date horario;

    private Double longitud;

    private Double latitud;
  
    private String matriculaEmbarcacion;
    

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getMatriculaEmbarcacion() {
        return matriculaEmbarcacion;
    }

    public void setMatriculaEmbarcacion(String matriculaEmbarcacion) {
        this.matriculaEmbarcacion = matriculaEmbarcacion;
    }

    public Double getAlturaNivelDelMar() {
        return alturaNivelDelMar;
    }

    public void setAlturaNivelDelMar(Double alturaNivelDelMar) {
        this.alturaNivelDelMar = alturaNivelDelMar;
    }

    private Double alturaNivelDelMar;
}

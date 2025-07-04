package ar.edu.unlam.pb2.cazadoresDeRecompensas;

public class CazadorRural extends Cazador {

    public CazadorRural(String nombre) {
        super(nombre);
    }

    @Override
    public Boolean puedeCapturar(Profugo p) {
        return this.experiencia > p.getInocencia() && p.esNervioso();
    }

    @Override
    public void intimidar(Profugo p) {
        p.reducirInocencia(2);
        p.setNervioso(true);
    }
}
package ar.edu.unlam.pb2.cazadoresDeRecompensas;

public class EntrenamientoElite implements IProfugo {
    private Profugo base;

    public EntrenamientoElite(Profugo base) {
        this.base = base;
    }

    @Override
    public Integer getInocencia() {
        return base.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return base.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return false; // Nunca nervioso, sin importar el base
    }

    @Override
    public void reducirInocencia(Integer cantidad) {
        base.reducirInocencia(cantidad);
    }

    @Override
    public void reducirHabilidad(Integer cantidad) {
        base.reducirHabilidad(cantidad);
    }

    @Override
    public void setNervioso(Boolean nervioso) {
        // Ignorado: nunca cambia el estado
    }

    @Override
    public String getNombre() {
        return base.getNombre();
    }
}

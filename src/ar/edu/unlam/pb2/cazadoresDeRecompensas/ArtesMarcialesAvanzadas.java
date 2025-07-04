package ar.edu.unlam.pb2.cazadoresDeRecompensas;

public class ArtesMarcialesAvanzadas implements IProfugo{

	private IProfugo base;

    public ArtesMarcialesAvanzadas(IProfugo base) {
        this.base = base;
    }

    @Override
    public Integer getInocencia() {
        return base.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        int habilidadOriginal = base.getHabilidad();
        int habilidadDoblada = habilidadOriginal * 2;

        if (habilidadDoblada > 100) {
            return 100;
        } else {
            return habilidadDoblada;
        }
    }

    @Override
    public Boolean esNervioso() {
        return base.esNervioso();
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
        base.setNervioso(nervioso);
    }

    @Override
    public String getNombre() {
        return base.getNombre();
    }

}

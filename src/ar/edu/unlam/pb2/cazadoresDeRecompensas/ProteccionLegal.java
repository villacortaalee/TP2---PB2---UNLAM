package ar.edu.unlam.pb2.cazadoresDeRecompensas;

public class ProteccionLegal implements IProfugo {
    private Profugo base;

    public ProteccionLegal(Profugo base) {
        this.base = base;
    }

    @Override
    public Integer getInocencia() {
        int inocenciaBase = base.getInocencia();
        if (inocenciaBase < 40) {
            return 40;
        } else {
            return inocenciaBase;
        }
    }

    @Override
    public Integer getHabilidad() {
        return base.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return base.esNervioso();
    }

    @Override
    public void reducirInocencia(Integer cantidad) {
        base.reducirInocencia(cantidad);
        if (base.getInocencia() < 40) {
            // Lo volvemos a subir a 40
            int diferencia = 40 - base.getInocencia();
            base.reducirInocencia(-diferencia); // sumar inocencia
        }
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

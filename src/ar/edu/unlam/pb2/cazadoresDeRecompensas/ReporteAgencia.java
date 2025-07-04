package ar.edu.unlam.pb2.cazadoresDeRecompensas;

import java.util.*;

public class ReporteAgencia {
    private List<Cazador> cazadores;

    public ReporteAgencia() {
        this.cazadores = new ArrayList<>();
    }

    public void agregarCazador(Cazador c) {
        this.cazadores.add(c);
    }

    public List<Cazador> getCazadores() {
        return new ArrayList<>(cazadores);
    }

    // 🔹 1. Todos los prófugos capturados por todos los cazadores
    public Set<Profugo> getTodosLosProfugosCapturados() {
        Set<Profugo> capturados = new HashSet<>();
        for (Cazador c : cazadores) {
            capturados.addAll(c.getCapturados());
        }
        return capturados;
    }

    // 🔹 2. El prófugo más hábil capturado
    public Profugo getProfugoMasHabilCapturado() {
        Profugo masHabil = null;
        int maxHabilidad = -1;

        for (Cazador c : cazadores) {
            for (Profugo p : c.getCapturados()) {
                if (p.getHabilidad() > maxHabilidad) {
                    maxHabilidad = p.getHabilidad();
                    masHabil = p;
                }
            }
        }

        return masHabil;
    }

    // 🔹 3. El cazador con más capturas realizadas
    public Cazador getCazadorConMasCapturas() {
        Cazador mejor = null;
        int maxCapturas = -1;

        for (Cazador c : cazadores) {
            if (c.cantidadCapturas() > maxCapturas) {
                maxCapturas = c.cantidadCapturas();
                mejor = c;
            }
        }

        return mejor;
    }
}
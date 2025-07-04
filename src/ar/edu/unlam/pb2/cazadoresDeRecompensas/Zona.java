package ar.edu.unlam.pb2.cazadoresDeRecompensas;

import java.util.*;

public class Zona {

	private String nombre;
	private Set<Profugo> profugos;

	public Zona(String nombre, Set<Profugo> profugos) {
		this.nombre = nombre;
		this.profugos = profugos;
	}

	public Set<Profugo> getProfugos() {
		return new HashSet<>(profugos);
	}

	public String getNombre() {
		return this.nombre;
	}

}

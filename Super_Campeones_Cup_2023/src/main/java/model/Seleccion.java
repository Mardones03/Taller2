package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Seleccion {
	private String id;
	private String nombrePais;
	private int rankingFifa;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private int arquerosCount = 0;
	private Set<Integer> numerosUtilizados = new HashSet<>();

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombrePais() {
		return this.nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public int getRankingFifa() {
		return this.rankingFifa;
	}

	public void setRankingFifa(int rankingFifa) {
		this.rankingFifa = rankingFifa;
	}

	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}

	public boolean agregarJugador(Jugador jugador) {

		if (numerosUtilizados.contains(jugador.getNumero()) || (jugador.getPosicion().equalsIgnoreCase("arquero") && arquerosCount >= 3)) {
			return false;
		}

		jugadores.add(jugador);
		numerosUtilizados.add(jugador.getNumero());

		if (jugador.getPosicion().equalsIgnoreCase("arquero")) {
			arquerosCount++;
		}

		return true;
	}
}
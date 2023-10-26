package controller;

import model.Seleccion;
import model.Jugador;

import java.util.ArrayList;

public class SeleccionController {
	private ArrayList<Seleccion> selecciones = new ArrayList<>();

	public boolean agregarSeleccion(Seleccion seleccion) {
		selecciones.add(seleccion);
		return true;
	}

	public boolean agregarJugadorASeleccion(Seleccion seleccion, Jugador jugador) {
		if (seleccion.getJugadores().size() < 23) {
			seleccion.agregarJugador(jugador);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Seleccion> obtenerSelecciones() {
		return selecciones;
	}
}
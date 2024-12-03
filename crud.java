package com.futbolmanagement.main;

import com.futbolmanagement.dao.JugadorDAO;
import com.futbolmanagement.model.Jugador;

public class MainApp {
    public static void main(String[] args) {
        JugadorDAO jugadorDAO = new JugadorDAO();

        // Crear un jugador
        Jugador jugador = new Jugador(1, "Carlos Pérez", 25, "Delantero", "1234567890", "carlos@mail.com");
        jugadorDAO.insertarJugador(jugador);

        // Consultar jugadores
        System.out.println("Jugadores:");
        jugadorDAO.obtenerJugadores().forEach(System.out::println);

        // Actualizar un jugador
        jugador.setNombre("Carlos Gómez");
        jugadorDAO.actualizarJugador(jugador);

        // Eliminar un jugador
        jugadorDAO.eliminarJugador(1);
    }
}

package com.futbolmanagement.dao;

import com.futbolmanagement.model.Jugador;
import com.futbolmanagement.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JugadorDAO {

    public void insertarJugador(Jugador jugador) {
        String query = "INSERT INTO jugador (ID_Jugador, Nombre, Edad, Posicion, Telefono, Email) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, jugador.getIdJugador());
            statement.setString(2, jugador.getNombre());
            statement.setInt(3, jugador.getEdad());
            statement.setString(4, jugador.getPosicion());
            statement.setString(5, jugador.getTelefono());
            statement.setString(6, jugador.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Jugador> obtenerJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
        String query = "SELECT * FROM jugador";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Jugador jugador = new Jugador(
                        resultSet.getInt("ID_Jugador"),
                        resultSet.getString("Nombre"),
                        resultSet.getInt("Edad"),
                        resultSet.getString("Posicion"),
                        resultSet.getString("Telefono"),
                        resultSet.getString("Email")
                );
                jugadores.add(jugador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jugadores;
    }

    public void actualizarJugador(Jugador jugador) {
        String query = "UPDATE jugador SET Nombre = ?, Edad = ?, Posicion = ?, Telefono = ?, Email = ? WHERE ID_Jugador = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, jugador.getNombre());
            statement.setInt(2, jugador.getEdad());
            statement.setString(3, jugador.getPosicion());
            statement.setString(4, jugador.getTelefono());
            statement.setString(5, jugador.getEmail());
            statement.setInt(6, jugador.getIdJugador());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarJugador(int idJugador) {
        String query = "DELETE FROM jugador WHERE ID_Jugador = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idJugador);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

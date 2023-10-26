package model.data.dao;

import model.Jugador;

import java.sql.Connection;
import java.util.ArrayList;

public class JugadorDAO {
    private Connection connection;

    public JugadorDAO(Connection connection) {
        this.connection = connection;
    }

  }
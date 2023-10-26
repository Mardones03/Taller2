package model.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Seleccion;

public class SeleccionDAO {
    private Connection connection;

    public SeleccionDAO(Connection connection) {
        this.connection = connection;
    }

}
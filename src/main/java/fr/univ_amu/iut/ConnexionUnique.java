package fr.univ_amu.iut;

import java.sql.*;

public final class ConnexionUnique
{
    private Connection connection;
    static private ConnexionUnique instance;

    final static private String CONNECT_URL = "jdbc:mysql://localhost:3306/GestionPedaBD";
    final static private String LOGIN = "monUser";
    final static private String PASSWORD = "monPassword";

    private ConnexionUnique() throws SQLException
    {
        connection = DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);
    }

    public Connection getConnection()
    {
        return connection;
    }

    public final static ConnexionUnique getInstance() throws SQLException
    {
        if(instance == null)
            instance = new ConnexionUnique();

        return instance;
    }
}

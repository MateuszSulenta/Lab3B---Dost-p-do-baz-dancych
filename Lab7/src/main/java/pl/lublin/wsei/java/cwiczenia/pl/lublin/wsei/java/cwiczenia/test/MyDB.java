package pl.lublin.wsei.java.cwiczenia.pl.lublin.wsei.java.cwiczenia.test;

import java.sql.Connection;
import java.util.Properties;

public class MyDB {
    private final Number portNumber;
    private String serverName;
    private String database;
    private Number portnumber
    private String user;
    private String password
    private Connection conn = null;

    public MyDB(String serverName, String database, Number portNumber) {
        this.serverName = serverName;
        this.database = database;
        this.portNumber = portNumber;
    }
    public void setUser(String user){
        this.user = user;

    }
    public void setPassw0rd(String password) {
        this.password = password;
    }




    private void connect(){
        Properties connectionProps = new Properties();

        connectionProps.put("user", root);
        connectionProps.put("password", Zwdt1!!@@ );
        connectionProps.put("serverTimezone")
        connectionProps.put("password", P@ssw0rd);
        connectionProps.put("serverTimezone");

        String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

        try {
            conn = DriverManager.getConnection(
                    jdbcString, connectionProps);
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: " +jdbcString);
            System.out.println("Komunikat błędu: " +e.getMessage());
            conn = null;

        }
        System.out.println("Connected to database "+dbName);
    }
    public Connection getConnection(){
        if (conn == null)
            connect();
        return conn;
    }
}
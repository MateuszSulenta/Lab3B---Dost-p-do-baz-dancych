module pl.lublin.wsei.java.cwiczenia.lab7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens pl.lublin.wsei.java.cwiczenia to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia;
}
package pl.lublin.wsei.java.cwiczenia.pl.lublin.wsei.java.cwiczenia.test;

import java.sql.Connection;

public class TestMyDB {
    public static void main(String[] args) {
      MyDB db = new MyDB("localhost", "mydb", 3306);
      db.setUser("root");
      db.setPassword("P@ssw0rd");
      Connection conn = db.getConnection();
      if (conn != null)
          System.out.println("Połączenie z bazą dancyh nawiązane");

    }
}

package org.arithmetic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcRepository implements IRepository {

  @Override
  public void upsert(int id, int val) {
    Connection connection = getConnection();
    // rest of the logic ... etc
  }

  @Override
  public int findById(int id) {
    Connection connection = getConnection();
    // rest of the logic ... etc
    return -1;
  }

  private Connection getConnection() {
    try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/myDb", "user1", "pass")) {
      return connection;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}

package pl.coderslab.injection;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DatabaseLogger implements Logger {

    private static final String INSERT_QUERY = "insert into Logs (created_date, message) values (?, ?)";

    @Override
    public void log(String message) {
        System.out.println("saving to database");

        try (Connection connection = DbUtil.getConnection()) {

            PreparedStatement prepState = connection.prepareStatement(INSERT_QUERY, Statement.RETURN_GENERATED_KEYS);
            prepState.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
            prepState.setString(2, message);

            prepState.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

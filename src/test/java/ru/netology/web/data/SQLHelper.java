package ru.netology.web.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLHelper {

    private static final QueryRunner runner = new QueryRunner();

    private static Connection getConn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "app", "pass");
    }

    @SneakyThrows
    public String getDebitStatus() {
        var debitStatusSQL = "SELECT status FROM payment_entity ORDER BY created DESC LIMIT 1";
        var conn = getConn();
        var debitStatus = runner.query(conn, debitStatusSQL, new ScalarHandler<String>());
        return debitStatus;
    }

    @SneakyThrows
    public String getCreditStatus() {
        var creditStatusSQL = "SELECT status FROM credit_request_entity ORDER BY created DESC LIMIT 1";
        var conn = getConn();
        var creditStatus = runner.query(conn, creditStatusSQL, new ScalarHandler<String>());
        return creditStatus;
    }

}

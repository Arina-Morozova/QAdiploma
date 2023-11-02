package ru.netology.web.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLHelper {

    private static final QueryRunner runner = new QueryRunner();

    public SQLHelper() {
    }

    @SneakyThrows
    public static Connection getConn() {
        String url = System.getProperty("url");
        String user = System.getProperty("user");
        String password = System.getProperty("password");
        return DriverManager.getConnection(url, user, password);
    }

    @SneakyThrows
    public static String getDebitStatus() {
        String statusSQL = "SELECT status FROM payment_entity ORDER BY created DESC LIMIT 1";
        Connection conn = getConn();
        return runner.query(conn, statusSQL, new ScalarHandler<String>());
    }

    @SneakyThrows
    public String getCreditStatus() {
        var creditStatusSQL = "SELECT status FROM credit_request_entity ORDER BY created DESC LIMIT 1";
        var conn = getConn();
        var creditStatus = runner.query(conn, creditStatusSQL, new ScalarHandler<String>());
        return creditStatus;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.budgetbites.database;
import java.sql.*;

/**
 *
 * @author Rahul
 */
public interface DbConnection {
    Connection openConnection();
    void closeConnection(Connection con);
    ResultSet runQuery(Connection con, String query);
    int executeUpdate(Connection con, String query);
}

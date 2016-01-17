/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schemadesing.services;

import schemadesing.model.Connection;

/**
 *
 * @author Andre
 */
public interface ConnectionService {
    public boolean testConnection(Connection connection);
    public boolean saveConnection(Connection connection);
    public Connection getLastConnection();
}

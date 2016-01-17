/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schemadesing.controller;

import java.util.HashMap;
import java.util.Map;
import schemadesing.implementservices.ConnectionServiceImplement;
import schemadesing.interfaces.ConnectionInterface;
import schemadesing.model.Connection;
import schemadesing.services.ConnectionService;

/**
 *
 * @author Andre
 */
public class ConnectionController implements ConnectionInterface{
    
    ConnectionService connectionService;
    Connection connection;
    public ConnectionController() {
        connectionService = new ConnectionServiceImplement();
    }    
    
    @Override
    public boolean testConnection(String connectiontype, String hostname, String databasename, String portnumber, String username, String password) {
        //Posteriormente fazer o tratamento de erros
        if(validateData(connectiontype, hostname, databasename, portnumber, username, password)){            
            connection = new Connection(connectiontype, hostname, databasename, portnumber, username, password);
            return connectionService.testConnection(connection);            
        }else
            return false;        
    }

    @Override
    public boolean saveConnection(String connectiontype, String hostname, String databasename, String portnumber, String username, String password) {
        if(testConnection(connectiontype, hostname, databasename, portnumber, username, password)){
            connection = new Connection(connectiontype, hostname, databasename, portnumber, username, password);
            return connectionService.saveConnection(connection);
        }else
            return false;
    }

    @Override
    public Map getLastConnection() {
        connection = connectionService.getLastConnection();
        Map<String,String> con = new HashMap<>();
        if(connection == null){            
            con.put("connectiontype", connection.getConnectiontype());
            con.put("hostname", connection.getHostname());
            con.put("databasename", connection.getDatabasename());
            con.put("portnumber", connection.getPortnumber());
            con.put("username", connection.getUsername());
            con.put("password", connection.getPassword());
        }
        return con;
    }

    private boolean validateData(String connectiontype, String hostname, String databasename, String portnumber, String username, String password) {
        return !(connectiontype.equals("") || hostname.equals("") || databasename.equals("") ||
                portnumber.equals("") || username.equals("") || password.equals(""));
    }
    
}

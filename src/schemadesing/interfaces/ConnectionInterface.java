/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schemadesing.interfaces;

import java.util.Map;

/**
 *
 * @author Andre
 */
public interface ConnectionInterface {
    public boolean testConnection(String connectiontype, String hostname, String databasename, String portnumber, String username, String password);
    public boolean saveConnection(String connectiontype, String hostname, String databasename, String portnumber, String username, String password);
    public Map getLastConnection();    
}

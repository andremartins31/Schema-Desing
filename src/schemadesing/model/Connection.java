/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schemadesing.model;

/**
 *
 * @author Andre
 */
public class Connection {
    private String connectiontype;
    private String hostname;
    private String databasename;
    private String portnumber;
    private String username;
    private String password;

    public Connection(String connectiontype, String hostname, String databasename, String portnumber, String username, String password) {
        this.connectiontype = connectiontype;
        this.hostname = hostname;
        this.databasename = databasename;
        this.portnumber = portnumber;
        this.username = username;
        this.password = password;
    }
    
    public String getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }

    
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDatabasename() {
        return databasename;
    }

    public void setDatabasename(String databasename) {
        this.databasename = databasename;
    }

    public String getPortnumber() {
        return portnumber;
    }

    public void setPortnumber(String portnumber) {
        this.portnumber = portnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Connection{" + "hostname=" + hostname + ", databasename=" + databasename + ", portnumber=" + portnumber + ", username=" + username + ", password=" + password + '}';
    }
    
    
}

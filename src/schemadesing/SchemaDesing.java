/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schemadesing;

import schemadesing.view.MainGui;

/**
 *
 * @author Andre
 */
public class SchemaDesing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainGui().setVisible(true);
        });
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author frangv1991
 */
@Named("saludador")
@SessionScoped
public class Saludador implements Serializable {

    private String saludo;

    public Saludador() {
        saludo = "Hola!";
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    public String saluda(){
        System.out.println(saludo);
        
        return "welcomePrimefaces";
    }
}

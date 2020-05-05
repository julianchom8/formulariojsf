
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.managedbean.Controlador;

import co.edu.unicundi.managedbean.Modelo.Usuario;
import co.edu.unicundi.managedbean.Servicio.servicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author usuario
 */
@Named(value = "listar")
@ViewScoped
public class listar implements Serializable{

    @EJB
    private servicio servicio;
    
    private List<Usuario> listaUsuarios;
    
    @PostConstruct
    public void init() {
       listaUsuarios= servicio.listar();
	}

    /**
     * @return the listaUsuarios
     */
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}

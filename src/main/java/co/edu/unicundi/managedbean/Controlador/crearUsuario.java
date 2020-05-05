/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.managedbean.Controlador;

import co.edu.unicundi.managedbean.Modelo.Usuario;
import co.edu.unicundi.managedbean.Servicio.servicio;
import java.io.IOException;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author usuario
 */
@Named(value = "crearUsuario")
@ViewScoped
public class crearUsuario implements Serializable {

    @EJB
    private servicio servicio;
    
    private Usuario usuario;
   
   private List<String> idiomas;
   
   private List<String> idioma_seleccionado;
   
   private int cont[];
   
    
    @PostConstruct
    public void init(){
        setIdiomas(servicio.idioma());
        usuario = new Usuario();
        
    }
    public String crear() throws IOException{
        usuario.getEstudio();
        usuario.setIdiomas(getIdioma_seleccionado());
        servicio.crear(usuario);
        servicio.sueldo(usuario);
        return "/datosTrabajador.xhtml";
    }

    /**
     * @return the servicio
     */
    public servicio getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   



    /**
     * @return the idiomas
     */
    public List<String> getIdiomas() {
        
        return idiomas;
    }

    /**
     * @param idiomas the idiomas to set
     */
    public void setIdiomas(List<String> idiomas) {
        
        this.idiomas = idiomas;
    }

    /**
     * @return the idioma_seleccionado
     */
    public List<String> getIdioma_seleccionado() {
        
        return idioma_seleccionado;
    }

    /**
     * @param idioma_seleccionado the idioma_seleccionado to set
     */
    public void setIdioma_seleccionado(List<String> idioma_seleccionado) {
        this.idioma_seleccionado = idioma_seleccionado;
    }




 

   

}

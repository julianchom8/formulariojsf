package co.edu.unicundi.managedbean.Servicio;

import co.edu.unicundi.managedbean.Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class servicio {

    private List<Usuario> usuarios = new ArrayList();
    private servicio servicio;

    public void crear(Usuario usuario) {
        usuario.setId(usuarios.size() + 1);
        usuarios.add(usuario);
    }

    public void sueldo(Usuario usuario) {
        
        if (usuario.getEstudio().equals("Tecnico")) {
            if (usuario.getIdiomas().size() == 1) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 10000 + 5000);
        } else if (usuario.getIdiomas().size() == 2) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 20000+ 5000);
        } else if (usuario.getIdiomas().size() == 3) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 30000+ 5000);
        } else if (usuario.getIdiomas().size() == 4) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 40000+ 5000);
        } else if (usuario.getIdiomas().size() == 5) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 50000+ 5000);
        } else if (usuario.getIdiomas().size() == 6) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 60000+ 5000);
        } else if (usuario.getIdiomas().size() == 7) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 70000+ 5000);
        }
        } else if (usuario.getEstudio().equals("Profesional")) {
            if (usuario.getIdiomas().size() == 1) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 10000 + 30000);
        } else if (usuario.getIdiomas().size() == 2) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 20000+ 30000);
        } else if (usuario.getIdiomas().size() == 3) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 30000+ 30000);
        } else if (usuario.getIdiomas().size() == 4) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 40000+ 30000);
        } else if (usuario.getIdiomas().size() == 5) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 50000+ 30000);
        } else if (usuario.getIdiomas().size() == 6) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 60000+ 30000);
        } else if (usuario.getIdiomas().size() == 7) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 70000+ 30000);
        } 
        } else if (usuario.getEstudio().equals("Magister")) {
             if (usuario.getIdiomas().size() == 1) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 10000 + 40000);
        } else if (usuario.getIdiomas().size() == 2) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 20000+ 40000);
        } else if (usuario.getIdiomas().size() == 3) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 30000+ 40000);
        } else if (usuario.getIdiomas().size() == 4) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 40000+ 40000);
        } else if (usuario.getIdiomas().size() == 5) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 50000+ 40000);
        } else if (usuario.getIdiomas().size() == 6) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 60000+ 40000);
        } else if (usuario.getIdiomas().size() == 7) {
            usuario.setSueldo(30000 * usuario.getDiasTrabajados() + 70000+ 40000);
        }
        }

    }


    public List<Usuario> listar() {
        return usuarios;

    }


    public List<String> idioma() {
        List<String> idiomas = new ArrayList();
        idiomas.add("Ingles");
        idiomas.add("Frances");
        idiomas.add("Portugues");
        idiomas.add("Mandarin");
        idiomas.add("Italiano");
        return idiomas;

    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

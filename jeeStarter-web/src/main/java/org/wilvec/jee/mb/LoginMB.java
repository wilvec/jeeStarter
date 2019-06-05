package org.wilvec.jee.mb;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.wilvec.jee.starter.ejb.IUsuarioService;
import org.wilvec.jee.starter.entity.Usuario;
import org.wilvec.jee.starter.exceptions.BusinessException;

/**
 *
 * @author GTX1050
 */
@Named
@SessionScoped
public class LoginMB implements Serializable {
    
    private static final long serialVersionUID = 4517354754816856520L;

    private String usuario;
    private String password;

    private Usuario usuarioLogueado;

    @Inject
    private IUsuarioService service;

    public LoginMB() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void acceder() {
         FacesContext context = FacesContext.getCurrentInstance();
        try {
            Usuario user = service.getUsuarioByLogin(usuario, password);
            setUsuarioLogueado(user);
            context.getExternalContext().redirect("main.xhtml");
        } catch (BusinessException ex) {
            Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, null, ex);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMensajeUsuario(), ex.getMensajeTecnico()));
        } catch (IOException ex) {
            Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, null, ex);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), ex.getMessage()));
        }
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

}

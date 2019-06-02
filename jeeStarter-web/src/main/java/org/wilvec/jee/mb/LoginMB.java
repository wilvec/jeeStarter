package org.wilvec.jee.mb;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.wilvec.jee.starter.ejb.IUsuarioService;
import org.wilvec.jee.starter.entity.Usuario;
import org.wilvec.jee.starter.exceptions.BusinessException;
import org.wilvec.jee.starter.exceptions.InvalidUserCredencialException;


/**
 *
 * @author GTX1050
 */

@SessionScoped
@Named
public class LoginMB implements Serializable {

    private static final long serialVersionUID = 4517354754816856520L;
    
    
    private String usuario;
    private String password;
    
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
    
    public void acceder(){
        try {
            Usuario user = service.getUsuarioByLogin(usuario, password);
            if(user==null){
                Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, "El usuario es nulo");
            }else {
                Logger.getLogger(LoginMB.class.getName()).log(Level.INFO, "todo ok");
            }
        } catch (InvalidUserCredencialException ex) {
            Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, "Credenciales invalidas!", ex);
        } catch (BusinessException ex) {
            Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, "Error de negocio", ex);
        }
    }
}

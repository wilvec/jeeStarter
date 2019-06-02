package org.wilvec.jee.starter.ejb;

import java.util.List;
import javax.ejb.Local;
import org.wilvec.jee.starter.entity.Rol;
import org.wilvec.jee.starter.entity.Usuario;
import org.wilvec.jee.starter.exceptions.BusinessException;
import org.wilvec.jee.starter.exceptions.InvalidUserCredencialException;
import org.wilvec.jee.starter.exceptions.ObjectNotFoundException;

/**
 *
 * @author wilmanjose.vega
 */
@Local
public interface IUsuarioService {
    
    List<Usuario> listAll();
    
    void save(final Usuario usuario) throws BusinessException;
    
    Usuario findById(final Long id) throws ObjectNotFoundException;
    
    void delete(Usuario usuario) throws BusinessException;
    
    Usuario getUsuarioByLogin(String stLogin, String stPassword) throws InvalidUserCredencialException, BusinessException;
    
    List<Rol> getListaRolesUusario(Usuario usuario) throws BusinessException;
}

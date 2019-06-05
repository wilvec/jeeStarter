package org.wilvec.jee.starter.dao;

import java.util.List;
import javax.ejb.Local;
import org.wilvec.jee.starter.entity.Rol;
import org.wilvec.jee.starter.entity.Usuario;
import org.wilvec.jee.starter.exceptions.BusinessException;

/**
 *
 * @author wjvega
 */
@Local
public interface IUsuarioDAO {
    
    List<Usuario> listAll();
    
    void save(final Usuario usuario) throws BusinessException;
    
    Usuario findById(final Long id) throws BusinessException;
    
    void delete(Usuario usuario) throws BusinessException;
    
    Usuario getUsuarioByLogin(String stLogin, String stPassword) throws BusinessException;
    
}
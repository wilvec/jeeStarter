package org.wilvec.jee.starter.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.wilvec.jee.starter.dao.IUsuarioDAO;
import org.wilvec.jee.starter.entity.Rol;
import org.wilvec.jee.starter.entity.Usuario;
import org.wilvec.jee.starter.exceptions.BusinessException;
import org.wilvec.jee.starter.exceptions.InvalidUserCredencialException;
import org.wilvec.jee.starter.exceptions.ObjectNotFoundException;

/**
 *
 * @author GTX1050
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService {
    
    @Inject
    private IUsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listAll() {
        return usuarioDAO.listAll();
    }

    @Override
    public void save(Usuario usuario) throws BusinessException {
        usuarioDAO.save(usuario);
    }

    @Override
    public Usuario findById(Long id) throws ObjectNotFoundException {
        return usuarioDAO.findById(id);
    }

    @Override
    public void delete(Usuario usuario) throws BusinessException {
        usuarioDAO.delete(usuario);
    }

    @Override
    public Usuario getUsuarioByLogin(String stLogin, String stPassword) throws InvalidUserCredencialException, BusinessException {
        return usuarioDAO.getUsuarioByLogin(stLogin, stPassword);
    }

    @Override
    public List<Rol> getListaRolesUusario(Usuario usuario) throws BusinessException {
        try {
            Usuario user = this.findById(usuario.getId());
            return user.getRoles();
        } catch (ObjectNotFoundException ex) {
            throw new BusinessException(ex);
        }
    }
    
}

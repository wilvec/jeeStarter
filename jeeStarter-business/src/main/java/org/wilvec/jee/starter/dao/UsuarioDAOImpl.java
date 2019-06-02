package org.wilvec.jee.starter.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.wilvec.jee.starter.entity.Rol;
import org.wilvec.jee.starter.entity.Usuario;
import org.wilvec.jee.starter.exceptions.BusinessException;
import org.wilvec.jee.starter.exceptions.InvalidUserCredencialException;

/**
 *
 * @author wjvega
 */
public class UsuarioDAOImpl implements IUsuarioDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Usuario> listAll() {
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

    @Override
    public void save(Usuario usuario) {
        if(usuario == null || usuario.getId() == null){
            em.persist(usuario);
        }else{
            em.merge(usuario);
        }
    }

    @Override
    public Usuario findById(Long id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public void delete(Usuario usuario) {
        em.remove(usuario);
    }

    @Override
    public Usuario getUsuarioByLogin(String stLogin, String stPassword) throws InvalidUserCredencialException,
            BusinessException {
        Query q = em.createNativeQuery("SELECT * FROM Usuarios WHERE "
                + "NOMBRE_USUARIO=:nombreUsuario AND PASSWORD = SHA1(:passWord)", Usuario.class);
        q.setParameter("nombreUsuario", stLogin);
        q.setParameter("passWord", stPassword);
        try {
            return (Usuario) q.getSingleResult();
        } catch (NoResultException e) {
            throw new InvalidUserCredencialException(e);
        } catch (NonUniqueResultException e){
            throw new BusinessException(e);
        }
    }

    @Override
    public List<Rol> getListaRolesUusario(Usuario usuario) {
        return null;
    }
    
}

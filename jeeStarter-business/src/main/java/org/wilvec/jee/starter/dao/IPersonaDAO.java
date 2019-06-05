package org.wilvec.jee.starter.dao;

import java.util.List;
import javax.ejb.Local;
import org.wilvec.jee.starter.entity.Persona;
import org.wilvec.jee.starter.exceptions.BusinessException;

/**
 *
 * @author wjvega
 */
@Local
public interface IPersonaDAO {
    
    List<Persona> listAll();
    
    void save(final Persona persona) throws BusinessException;
    
    Persona findById(final Long id) throws BusinessException;
    
    void delete(Persona persona) throws BusinessException;
    
}

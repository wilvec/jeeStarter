package org.wilvec.jee.starter.ejb;

import java.util.List;
import javax.inject.Inject;
import org.wilvec.jee.starter.dao.IPersonaDAO;
import org.wilvec.jee.starter.entity.Persona;
import org.wilvec.jee.starter.exceptions.BusinessException;
import org.wilvec.jee.starter.exceptions.ObjectNotFoundException;

/**
 *
 * @author wilmanjose.vega
 */
public class PersonaServiceImpl implements IPersonaService{
    
    @Inject
    private IPersonaDAO personaDAO;

    @Override
    public List<Persona> listAll() {
        return personaDAO.listAll();
    }

    @Override
    public void save(Persona persona) throws BusinessException {
        personaDAO.save(persona);
    }

    @Override
    public Persona findById(Long id) throws ObjectNotFoundException {
        return personaDAO.findById(id);
    }

    @Override
    public void delete(Persona persona) throws BusinessException {
        personaDAO.delete(persona);
    }
    
}

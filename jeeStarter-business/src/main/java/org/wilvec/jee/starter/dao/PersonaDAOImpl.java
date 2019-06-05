package org.wilvec.jee.starter.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.wilvec.jee.starter.entity.Persona;

/**
 *
 * @author wjvega
 */
public class PersonaDAOImpl implements IPersonaDAO{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Persona> listAll() {
        return em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
    }

    @Override
    public void save(Persona persona) {
        if(persona.getId() != null || persona.getId() > 0){
            em.persist(persona);
        }else{
            em.merge(persona);
        }
    }

    @Override
    public Persona findById(Long id) {
        return em.find(Persona.class, id);
    }

    @Override
    public void delete(Persona persona) {
        em.remove(persona);
    }

}

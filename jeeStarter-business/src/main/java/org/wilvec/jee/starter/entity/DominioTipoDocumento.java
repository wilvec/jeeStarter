package org.wilvec.jee.starter.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author GTX1050
 */
@Entity
@Table(name = "DOMINIO_TIPODOCUMENTO")
public class DominioTipoDocumento implements Serializable {

    private static final long serialVersionUID = -4922124730785749493L;

    @Id
    private Long id;
    
    private String codigo;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package org.wilvec.jee.starter.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author GTX1050
 */
@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    private static final long serialVersionUID = -6169643443737886552L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;

    @NotNull
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_EXPIRACION")
    private Date fechaExpiracion;

    @ManyToOne
    @JoinColumn(name = "PERSONAS_ID")
    private Persona persona;

    @NotNull
    @Column(name = "FECHA_LOG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLog;

    @ManyToOne
    @JoinColumn(name = "USUARIOS_ID")
    private Usuario usuario;

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @Basic(fetch = FetchType.EAGER)
    @JoinTable(name = "USUARIOS_ROLES",
            joinColumns = @JoinColumn(name = "USUARIOS_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLES_ID"))
    private List<Rol> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaLog() {
        return fechaLog;
    }

    public void setFechaLog(Date fechaLog) {
        this.fechaLog = fechaLog;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

}

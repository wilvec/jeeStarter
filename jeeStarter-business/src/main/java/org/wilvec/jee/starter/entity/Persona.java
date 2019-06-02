package org.wilvec.jee.starter.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "PERSONAS")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 0L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    
    @NotNull
    private String nombre;

    @NotNull
    private String apellidos;
    
    @NotNull
    private String email;
    
    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;
    
    private String direccion;
    
    @Column(name = "TEL_FIJO")
    private String telefonoFijo;
    
    @Column(name = "TEL_CELULAR")
    private String telCelular;
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_LOG")
    private Date fechaLog;

    @NotNull
    @Column(name = "USUARIO_LOG")
    private String usuarioLog;
    
    @ManyToOne
    @JoinColumn(name ="DOMINIO_TIPODOCUMENTO_ID")
    private DominioTipoDocumento tipoDocumento;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public Date getFechaLog() {
        return fechaLog;
    }

    public void setFechaLog(Date fechaLog) {
        this.fechaLog = fechaLog;
    }

    public String getUsuarioLog() {
        return usuarioLog;
    }

    public void setUsuarioLog(String usuarioLog) {
        this.usuarioLog = usuarioLog;
    }

    public DominioTipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(DominioTipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
}

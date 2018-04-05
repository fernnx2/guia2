/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fmocc.ingenieria.tpi135.mantenimiento.mantenimientolib.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ale
 */
@Entity
@Table(catalog = "mantenimiento", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsable.findAll", query = "SELECT r FROM Responsable r")
    , @NamedQuery(name = "Responsable.findByIdResponsable", query = "SELECT r FROM Responsable r WHERE r.idResponsable = :idResponsable")
    , @NamedQuery(name = "Responsable.findByNombre", query = "SELECT r FROM Responsable r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Responsable.findByPrimerApellido", query = "SELECT r FROM Responsable r WHERE r.primerApellido = :primerApellido")
    , @NamedQuery(name = "Responsable.findBySegundoApellido", query = "SELECT r FROM Responsable r WHERE r.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Responsable.findByActivo", query = "SELECT r FROM Responsable r WHERE r.activo = :activo")})
public class Responsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_responsable")
    private String idResponsable;
    @Basic(optional = false)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Basic(optional = false)
    private boolean activo;
    @JoinColumn(name = "id_tipo_responsable", referencedColumnName = "id_tipo_responsable")
    @ManyToOne(optional = false)
    private TipoResponsable idTipoResponsable;

    public Responsable() {
    }

    public Responsable(String idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Responsable(String idResponsable, String nombre, String primerApellido, boolean activo) {
        this.idResponsable = idResponsable;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.activo = activo;
    }

    public String getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(String idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public TipoResponsable getIdTipoResponsable() {
        return idTipoResponsable;
    }

    public void setIdTipoResponsable(TipoResponsable idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResponsable != null ? idResponsable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;
        if ((this.idResponsable == null && other.idResponsable != null) || (this.idResponsable != null && !this.idResponsable.equals(other.idResponsable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.ues.fmocc.ingenieria.tpi135.mantenimiento.mantenimientoremotelib.entity.Responsable[ idResponsable=" + idResponsable + " ]";
    }
    
}

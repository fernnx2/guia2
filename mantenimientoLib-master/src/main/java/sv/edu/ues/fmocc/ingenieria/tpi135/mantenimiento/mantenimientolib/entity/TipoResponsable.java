/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fmocc.ingenieria.tpi135.mantenimiento.mantenimientolib.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ale
 */
@Entity
@Table(name = "tipo_responsable", catalog = "mantenimiento", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoResponsable.findAll", query = "SELECT t FROM TipoResponsable t")
    , @NamedQuery(name = "TipoResponsable.findByIdTipoResponsable", query = "SELECT t FROM TipoResponsable t WHERE t.idTipoResponsable = :idTipoResponsable")
    , @NamedQuery(name = "TipoResponsable.findByNombreTipoResponsable", query = "SELECT t FROM TipoResponsable t WHERE t.nombreTipoResponsable = :nombreTipoResponsable")
    , @NamedQuery(name = "TipoResponsable.findByDetalleTipoResponsable", query = "SELECT t FROM TipoResponsable t WHERE t.detalleTipoResponsable = :detalleTipoResponsable")
    , @NamedQuery(name = "TipoResponsable.findByActivo", query = "SELECT t FROM TipoResponsable t WHERE t.activo = :activo")})
public class TipoResponsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_responsable")
    private Integer idTipoResponsable;
    @Basic(optional = false)
    @Column(name = "nombre_tipo_responsable")
    private String nombreTipoResponsable;
    @Column(name = "detalle_tipo_responsable")
    private String detalleTipoResponsable;
    @Basic(optional = false)
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoResponsable")
    private List<Responsable> responsableList;

    public TipoResponsable() {
    }

    public TipoResponsable(Integer idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }

    public TipoResponsable(Integer idTipoResponsable, String nombreTipoResponsable, boolean activo) {
        this.idTipoResponsable = idTipoResponsable;
        this.nombreTipoResponsable = nombreTipoResponsable;
        this.activo = activo;
    }

    public Integer getIdTipoResponsable() {
        return idTipoResponsable;
    }

    public void setIdTipoResponsable(Integer idTipoResponsable) {
        this.idTipoResponsable = idTipoResponsable;
    }

    public String getNombreTipoResponsable() {
        return nombreTipoResponsable;
    }

    public void setNombreTipoResponsable(String nombreTipoResponsable) {
        this.nombreTipoResponsable = nombreTipoResponsable;
    }

    public String getDetalleTipoResponsable() {
        return detalleTipoResponsable;
    }

    public void setDetalleTipoResponsable(String detalleTipoResponsable) {
        this.detalleTipoResponsable = detalleTipoResponsable;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<Responsable> getResponsableList() {
        return responsableList;
    }

    public void setResponsableList(List<Responsable> responsableList) {
        this.responsableList = responsableList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoResponsable != null ? idTipoResponsable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoResponsable)) {
            return false;
        }
        TipoResponsable other = (TipoResponsable) object;
        if ((this.idTipoResponsable == null && other.idTipoResponsable != null) || (this.idTipoResponsable != null && !this.idTipoResponsable.equals(other.idTipoResponsable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.ues.fmocc.ingenieria.tpi135.mantenimiento.mantenimientoremotelib.entity.TipoResponsable[ idTipoResponsable=" + idTipoResponsable + " ]";
    }
    
}

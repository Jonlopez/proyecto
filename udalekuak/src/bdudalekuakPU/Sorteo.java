/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdudalekuakPU;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jon
 */
@Entity
@Table(name = "SORTEO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sorteo.findAll", query = "SELECT s FROM Sorteo s"),
    @NamedQuery(name = "Sorteo.findByIdSorteo", query = "SELECT s FROM Sorteo s WHERE s.idSorteo = :idSorteo"),
    @NamedQuery(name = "Sorteo.findByFIniIns", query = "SELECT s FROM Sorteo s WHERE s.fIniIns = :fIniIns"),
    @NamedQuery(name = "Sorteo.findByFFinIns", query = "SELECT s FROM Sorteo s WHERE s.fFinIns = :fFinIns"),
    @NamedQuery(name = "Sorteo.findByFSorteo", query = "SELECT s FROM Sorteo s WHERE s.fSorteo = :fSorteo")})
public class Sorteo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SORTEO")
    private Short idSorteo;
    @Column(name = "F_INI_INS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fIniIns;
    @Column(name = "F_FIN_INS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fFinIns;
    @Column(name = "F_SORTEO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fSorteo;

    public Sorteo() {
    }

    public Sorteo(Short idSorteo) {
        this.idSorteo = idSorteo;
    }

    public Short getIdSorteo() {
        return idSorteo;
    }

    public void setIdSorteo(Short idSorteo) {
        this.idSorteo = idSorteo;
    }

    public Date getFIniIns() {
        return fIniIns;
    }

    public void setFIniIns(Date fIniIns) {
        this.fIniIns = fIniIns;
    }

    public Date getFFinIns() {
        return fFinIns;
    }

    public void setFFinIns(Date fFinIns) {
        this.fFinIns = fFinIns;
    }

    public Date getFSorteo() {
        return fSorteo;
    }

    public void setFSorteo(Date fSorteo) {
        this.fSorteo = fSorteo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSorteo != null ? idSorteo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sorteo)) {
            return false;
        }
        Sorteo other = (Sorteo) object;
        if ((this.idSorteo == null && other.idSorteo != null) || (this.idSorteo != null && !this.idSorteo.equals(other.idSorteo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bdudalekuakPU.Sorteo[ idSorteo=" + idSorteo + " ]";
    }
    
}

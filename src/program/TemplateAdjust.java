/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author natee
 */
@Entity
@Table(name = "template_adjust", catalog = "mycpssys3", schema = "")
@NamedQueries({
    @NamedQuery(name = "TemplateAdjust.findAll", query = "SELECT t FROM TemplateAdjust t"),
    @NamedQuery(name = "TemplateAdjust.findByA", query = "SELECT t FROM TemplateAdjust t WHERE t.a = :a"),
    @NamedQuery(name = "TemplateAdjust.findByPcode", query = "SELECT t FROM TemplateAdjust t WHERE t.pcode = :pcode"),
    @NamedQuery(name = "TemplateAdjust.findByStock", query = "SELECT t FROM TemplateAdjust t WHERE t.stock = :stock")})
public class TemplateAdjust implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "")
    private Integer a;
    @Basic(optional = false)
    @Column(name = "pcode")
    private String pcode;
    @Basic(optional = false)
    @Column(name = "stock")
    private char stock;

    public TemplateAdjust() {
    }

    public TemplateAdjust(Integer a) {
        this.a = a;
    }

    public TemplateAdjust(Integer a, String pcode, char stock) {
        this.a = a;
        this.pcode = pcode;
        this.stock = stock;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        Integer oldA = this.a;
        this.a = a;
        changeSupport.firePropertyChange("a", oldA, a);
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        String oldPcode = this.pcode;
        this.pcode = pcode;
        changeSupport.firePropertyChange("pcode", oldPcode, pcode);
    }

    public char getStock() {
        return stock;
    }

    public void setStock(char stock) {
        char oldStock = this.stock;
        this.stock = stock;
        changeSupport.firePropertyChange("stock", oldStock, stock);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (a != null ? a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateAdjust)) {
            return false;
        }
        TemplateAdjust other = (TemplateAdjust) object;
        if ((this.a == null && other.a != null) || (this.a != null && !this.a.equals(other.a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Main.TemplateAdjust[a=" + a + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}

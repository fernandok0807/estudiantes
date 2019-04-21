package gt.edu.umg.ingenieria.sistemas.laboratorio2.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@Entity
public class Estudiante implements Serializable {

    @Id
    private Long id;
    private String nombre_completo;
    private String numero_carne;
    private Date fecha_nacimiento;
    private String telefono;
    private String direccion;
    private String correo;
    private String dpi;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre_completo, String numero_carne, Date fecha_nacimiento, String telefono, String direccion, String correo, String dpi) {
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.numero_carne = numero_carne;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.dpi = dpi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNumero_carne() {
        return numero_carne;
    }

    public void setNumero_carne(String numero_carne) {
        this.numero_carne = numero_carne;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    

    
}

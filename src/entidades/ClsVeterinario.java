
package entidades;

import java.util.Date;


public class ClsVeterinario {
    private int CodigoVet;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private String sexo;
    private String telefono;
    private boolean vigencia; // A. ACTIVO  I. INACTIVO

    public int getCodigoVet() {
        return CodigoVet;
    }

    public void setCodigoVet(int CodigoVet) {
        this.CodigoVet = CodigoVet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    
    
}

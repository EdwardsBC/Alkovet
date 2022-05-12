package entidades;

public class ClsUsuario {
  
  private String nombre;
  private String clave;
  private boolean  Vigencia;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean isVigencia() {
    return Vigencia;
  }

  public void setVigencia(boolean Vigencia) {
    this.Vigencia = Vigencia;
  }
  
}

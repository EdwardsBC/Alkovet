
package entidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ClsProducto {
    
    private int codigo;
    private String Categoria;
    private String nombre;
    private String presentacion;
    private double precio;
    private int cantidad;
    private int unidades;
    private String descripcion;
    private boolean vigencia;
    private Date fecha;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

//    public String getCalcularEdad(){
//        String edad = "";
//        LocalDate horaActual = LocalDate.now();
//        LocalDate horaNac;
//        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//            horaNac = LocalDate.parse(getFechas(), date);
//            Period periodo =  Period.between(horaNac, horaActual);
//            edad = periodo.getYears() + " años y " + periodo.getMonths() + " meses";
//        
//        return edad;
//   
//            public String getFechas(){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        
//        return sdf.format(fecha);
//    }

    

    
}

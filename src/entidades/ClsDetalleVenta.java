package entidades;

public class ClsDetalleVenta {
    
    private ClsVenta venta;
    private ClsProducto producto;
    private int cantidad;
    private double precioUnitario;

    public ClsVenta getVenta() {
        return venta;
    }

    public void setVenta(ClsVenta venta) {
        this.venta = venta;
    }

    public ClsProducto getProducto() {
        return producto;
    }

    public void setProducto(ClsProducto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

  public double getTotal() {
    return this.cantidad * this.precioUnitario;
  }
    
}

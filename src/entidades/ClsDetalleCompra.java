package entidades;

public class ClsDetalleCompra {
    
    private ClsCompra compra;
    private ClsProducto producto;
    private int cantidad;
    private double precioUnitario;

    public ClsCompra getCompra() {
        return compra;
    }

    public void setCompra(ClsCompra compra) {
        this.compra = compra;
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


package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ClsTipoDocumento {
    private ClsCliente id_Cliente;
    private int numero_Factura;
    private String ruc;
    private Date fecha;
    private int forma_Pago;
    private String detalle;

    public ClsCliente getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(ClsCliente id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getFechaHistorial(){
        String fecha;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        
        fecha = sdf.format(this.fecha);
        return fecha;
    }
    
    public int getNumero_Factura() {
        return numero_Factura;
    }

    public void setNumero_Factura(int numero_Factura) {
        this.numero_Factura = numero_Factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getForma_Pago() {
        return forma_Pago;
    }

    public void setForma_Pago(int forma_Pago) {
        this.forma_Pago = forma_Pago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}

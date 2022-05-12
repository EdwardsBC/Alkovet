package entidades;

import java.util.List;


public class ClsCompra {
    
    private int codigo;
    private String tipoDocumento;
    private int serie;
    private int numero;
    private boolean vigencia;
    
    private List<ClsDetalleCompra> detalles;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public List<ClsDetalleCompra> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<ClsDetalleCompra> detalles) {
        this.detalles = detalles;
    }
    
}

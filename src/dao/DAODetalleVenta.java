package dao;

import accesodatos.Conexion;
import entidades.ClsDetalleVenta;
import entidades.ClsVenta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAODetalleVenta {

  public void registrar(ClsVenta venta) throws Exception {
    Conexion con = new Conexion();
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql;
    int codigoVenta;

    try {
      cn = con.conectar();
      cn.setAutoCommit(false);
      st = cn.createStatement();
      //1: registrar la venta (el servidor asigna codigo)
      sql = "INSERT INTO Venta( tipo_Documento, Serie,Numero,Vigencia)"
              + "VALUES ('" + venta.getTipoDocumento() + "', "
              + venta.getSerie() + ", " + venta.getNumero()
              + ", 1)";
      st.executeUpdate(sql);
      //2. averiguar el codigo generado
      sql = "SELECT @@IDENTITY AS id_Venta";
      rs = st.executeQuery(sql);
      rs.next();
      codigoVenta = rs.getInt("id_Venta");
      rs.close();
      //3. varias veces segun sea necesario
      //3.1 registar cada detalle
      for (ClsDetalleVenta detalle : venta.getDetalles()) {
        sql = "INSERT Detalle_Venta(id_Venta, id_Producto, Cantidad, precio_Unitario) VALUES(" + codigoVenta + ", "
                + detalle.getProducto().getCodigo() + ","
                + detalle.getCantidad() + ","
                + detalle.getPrecioUnitario() + ")";

        st.executeUpdate(sql);
      }
      cn.commit();
    } catch (Exception e) {
      cn.rollback();
      throw e;
    } finally {
      if (st != null && st.isClosed() == false) {
        st.close();
      }
      st = null;
      if (rs != null && rs.isClosed() == false) {
        rs.close();
      }
      rs = null;
      if (cn != null && cn.isClosed() == false) {
        cn.close();
      }
      cn = null;
    }
  }

}

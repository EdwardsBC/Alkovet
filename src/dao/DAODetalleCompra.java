package dao;

import accesodatos.Conexion;
import entidades.ClsDetalleCompra;
import entidades.ClsCompra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAODetalleCompra {

  public void registrar(ClsCompra compra) throws Exception {
    Conexion con = new Conexion();
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql;
    int codigoCompra;

    try {
      cn = con.conectar();
      cn.setAutoCommit(false);
      st = cn.createStatement();
      //1: registrar la venta (el servidor asigna codigo)
      sql = "INSERT INTO Compra( Tipo_Documento, Serie,Numero,Vigencia)"
              + "VALUES ('" + compra.getTipoDocumento()+ "', "
              + compra.getSerie()+ ", " + compra.getNumero()
              + ", 1)";
      st.executeUpdate(sql);
      //2. averiguar el codigo generado
      sql = "SELECT @@IDENTITY AS id_Compra";
      rs = st.executeQuery(sql);
      rs.next();
      codigoCompra = rs.getInt("id_Compra");
      rs.close();
      //3. varias veces segun sea necesario
      //3.1 registar cada detalle
      for (ClsDetalleCompra detalle : compra.getDetalles()) {
        sql = "INSERT Detalle_Compra(id_Compra, id_Producto, Cantidad, Precio_Unitario) VALUES(" + codigoCompra + ", "
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

package dao;

import accesodatos.Conexion;
import java.util.List;
import entidades.ClsProducto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DAOProducto {

  public void registrar(ClsProducto producto) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String Fecha = sdf.format(producto.getFecha());

    sql = "INSERT INTO Producto (Categoria, Nombre, Presentacion, Fecha, Precio, Cantidad, Unidades, Descripcion,"
            + " Vigencia) "
            + "VALUES('" 
            + producto.getCategoria() + "' ,'"
            + producto.getNombre() + "', '"
            + producto.getPresentacion() + "', '"
            + Fecha + "', "
            + producto.getPrecio() + ", "
            + producto.getCantidad()+ ", "
            + producto.getUnidades()+ ", '"
            + producto.getDescripcion() + "', "
            + (producto.isVigencia() == true ? "1" : "0")+ ")";

    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      st.executeUpdate(sql);
    } catch (Exception e) {
      throw e;
    } finally {
      if (st != null && st.isClosed() == false) {
        st.close();
      }
      st = null;
      if (cn != null && cn.isClosed() == false) {
        cn.close();
      }
      cn = null;
    }
  }

  public void actualizar(ClsProducto producto) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(producto.getFecha());

    sql = "Update Producto set Categoria = '"
            + producto.getCategoria()+ "', Nombre = '"
            + producto.getNombre() + "', Presentacion = '"
            + producto.getPresentacion() + "', Fecha = '"
            + fecha + "', Precio = "
            + producto.getPrecio()+ ", Cantidad = "
            + producto.getCantidad()+ ", Unidades = "
            + producto.getUnidades()+ ", Descripcion = '"
            + producto.getDescripcion() + "', Vigencia = "
            + (producto.isVigencia() == true ? "1" : "0") 
            + " WHERE id_Producto = " + producto.getCodigo();

    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      st.executeUpdate(sql);
    } catch (Exception e) {
      throw e;
    } finally {
      if (st != null && st.isClosed() == false) {
        st.close();
      }
      st = null;
      if (cn != null && cn.isClosed() == false) {
        cn.close();
      }
      cn = null;
    }
  }

  public ClsProducto leer(ClsProducto producto) throws Exception {
    ClsProducto prod = null;
    Conexion con;
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = "SELECT  Categoria, Nombre, Presentacion, Fecha, Precio, Cantidad, Unidades, Descripcion, Vigencia "
            + "FROM Producto  "
            + "WHERE id_Producto = " + producto.getCodigo();

    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      rs = st.executeQuery(sql);
      if (rs.next() == true) {
        prod = new ClsProducto();
        prod.setCodigo(producto.getCodigo());
        prod.setCategoria(rs.getString("Categoria"));
        prod.setNombre(rs.getString("Nombre"));
        prod.setPresentacion(rs.getString("Presentacion"));
        prod.setFecha(rs.getDate("Fecha"));
        prod.setPrecio(rs.getDouble("Precio"));
        prod.setCantidad(rs.getInt("Cantidad"));
        prod.setUnidades(rs.getInt("Unidades"));
        prod.setDescripcion(rs.getString("Descripcion"));
        prod.setVigencia(rs.getBoolean("Vigencia"));
      }
    } catch (Exception e) {
      throw e;
    } finally {
      if (rs != null && rs.isClosed() == false) {
        rs.close();
      }
      rs = null;
      if (st != null && st.isClosed() == false) {
        st.close();
      }
      st = null;
      if (cn != null && cn.isClosed() == false) {
        cn.close();
      }
      cn = null;
    }
    return prod;
  }

  public List<ClsProducto> listar(String nombre) throws Exception {
    List<ClsProducto> productos = null;
    ClsProducto prod;
    Conexion con;
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = "SELECT id_Producto, Categoria, Nombre, Presentacion, Fecha, Precio, Cantidad, Unidades, Descripcion, Vigencia "
            + "FROM Producto " 
            + "ORDER BY nombre";

    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      rs = st.executeQuery(sql);
      productos = new ArrayList<>();
      while (rs.next() == true) {
        prod = new ClsProducto();
        prod.setCodigo(rs.getInt("id_Producto"));
        prod.setCategoria(rs.getString("Categoria"));
        prod.setNombre(rs.getString("Nombre"));
        prod.setPresentacion(rs.getString("Presentacion"));
        prod.setFecha(rs.getDate("Fecha"));
        prod.setPrecio(rs.getDouble("Precio"));
        prod.setCantidad(rs.getInt("Cantidad"));
        prod.setUnidades(rs.getInt("Unidades"));
        prod.setDescripcion(rs.getString("Descripcion"));
        prod.setVigencia(rs.getBoolean("Vigencia"));

        productos.add(prod);
      }
    } catch (Exception e) {
      throw e;
    } finally {
      if (rs != null && rs.isClosed() == false) {
        rs.close();
      }
      rs = null;
      if (st != null && st.isClosed() == false) {
        st.close();
      }
      st = null;
      if (cn != null && cn.isClosed() == false) {
        cn.close();
      }
      cn = null;
    }
    return productos;
  }
}

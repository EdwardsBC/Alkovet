
package dao;

import accesodatos.Conexion;
import entidades.ClsProveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOProveedor {
    
    public void registrar(ClsProveedor proveedor) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;

    sql = "INSERT INTO Proveedor (Razon_Social, Representante, Ruc, Telefono, Correo, Direccion, Vigencia) "
            + "VALUES('" + proveedor.getRazon_Social()+ "', '"
            + proveedor.getRepresentante()+ "', '"
            + proveedor.getRuc()+ "', '"
            + proveedor.getTelefono()+ "', '"
            + proveedor.getCorreo()+ "', '"
            + proveedor.getDireccion()+"', "
            + (proveedor.isVigencia() == true ? "1" : "0")+ ")";
            
            
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

    public void actualizar(ClsProveedor proveedor) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;

    sql = "UPDATE Proveedor SET razon_Social = '"
            + proveedor.getRazon_Social()+ "', representante = '"
            + proveedor.getRepresentante()+ "', ruc = '"
            + proveedor.getRuc()+ "', telefono = '"
            + proveedor.getTelefono()+ "', correo = '"
            + proveedor.getCorreo()+ "', direccion = '"
            + proveedor.getDireccion()+ "', vigencia = "
            + (proveedor.isVigencia() == true ? "1" : "0") 
            + " WHERE id_Proveedor = "+proveedor.getCodigo();

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

    public ClsProveedor leer(ClsProveedor proveedor) throws Exception {
    ClsProveedor prov = null;
    Conexion con;
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = "SELECT P.Razon_Social, P.Representante, P.Ruc, P.Telefono, P.Correo, P.Direccion, P.Vigencia "
            + "FROM Proveedor P "
            + "WHERE p.id_Proveedor = " + proveedor.getCodigo();
                
    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      rs = st.executeQuery(sql);
      if (rs.next() == true) {
        prov = new ClsProveedor();
        prov.setCodigo(proveedor.getCodigo());
        prov.setRazon_Social(rs.getString("Razon_Social"));
        prov.setRepresentante(rs.getString("Representantes"));
        prov.setRuc(rs.getString("Ruc"));
        prov.setTelefono(rs.getString("Telefono"));
        prov.setCorreo(rs.getString("Correo"));
        prov.setDireccion(rs.getString("Direccion"));
        prov.setVigencia(rs.getBoolean("Vigencia"));
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
    return prov;
  }
    
    public List<ClsProveedor> listar() throws Exception {
         List<ClsProveedor> proveedores ;
        ClsProveedor prov;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT id_Proveedor, Razon_Social, Representante, Ruc, Telefono, Correo, Direccion, Vigencia "
                + " FROM Proveedor "
                + " ORDER BY Vigencia ";
        
        con = new Conexion();
        try{
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            proveedores = new ArrayList<>();
            while(rs.next() == true){
                prov = new ClsProveedor();
                prov.setCodigo(rs.getInt("id_Proveedor"));
                prov.setRazon_Social(rs.getString("Razon_Social"));
                prov.setRepresentante(rs.getString("Representante"));
                prov.setRuc(rs.getString("Ruc"));
                prov.setTelefono(rs.getString("Telefono"));
                prov.setCorreo(rs.getString("Correo"));
                prov.setDireccion(rs.getString("Direccion"));
                prov.setVigencia(rs.getBoolean("Vigencia"));
        
                proveedores.add(prov);
            }
        }catch (Exception e){
            throw e;
        }finally{
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
        return proveedores;
        
        
    }
 
}

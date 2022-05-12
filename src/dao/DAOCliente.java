
package dao;

import accesodatos.Conexion;
import entidades.ClsCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DAOCliente {
    
    public void registrar(ClsCliente cliente) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_Nacimiento = sdf.format(cliente.getFecha_Nacimiento());
    
    sql = "INSERT INTO Cliente (Nombre, Apellido, fecha_Nacimiento, Sexo , Telefono, Direccion, Vigencia) "
            + "VALUES('" + cliente.getNombre() + "', '"
            + cliente.getApellido()+ "','"
            + fecha_Nacimiento+"', '"
            + cliente.getSexo()+ "', '"
            + cliente.getTelefono()+ "', '"
            + cliente.getDireccion() + "', "
            + (cliente.isVigencia() == true ? "1" : "0")+ ")";
   
            

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

    public void actualizar(ClsCliente cliente) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;

     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_Nacimiento = sdf.format(cliente.getFecha_Nacimiento());
    
    sql = "UPDATE Cliente SET nombre = '"
            + cliente.getNombre()+ "', apellido = '"
            + cliente.getApellido()+ "', fecha_Nacimiento = '"
            + fecha_Nacimiento+ "', Sexo= '"
            + cliente.getSexo()+ "', telefono = '"
            + cliente.getTelefono()+ "', direccion = '"
            + cliente.getDireccion()+ "', Vigencia = "
            + (cliente.isVigencia() == true ? "1" : "0") 
            + " WHERE id_Cliente = "+cliente.getCodigo();

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
    
    public ClsCliente leer(ClsCliente cliente) throws Exception {
    ClsCliente cli = null;
    Conexion con;
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = "SELECT C.Nombre, C.Apellido, C.fecha_Nacimiento, C.Sexo, C.Telefono, C.Direccion, C.Vigencia "
            + "FROM Cliente C "
            + "WHERE C.id_Cliente = " + cliente.getCodigo();
                
    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      rs = st.executeQuery(sql);
      if (rs.next() == true) {
        cli = new ClsCliente();
        cli.setCodigo(cliente.getCodigo());
        cli.setNombre(rs.getString("Nombre"));
        cli.setApellido(rs.getString("Apellido"));
        cli.setFecha_Nacimiento(rs.getDate("fecha_Nacimiento"));
        cli.setSexo(rs.getString("Sexo"));
        cli.setTelefono(rs.getString("Telefono"));
        cli.setDireccion(rs.getString("Direccion"));
        cli.setVigencia(rs.getBoolean("Vigencia"));
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
    return cli;
  }
   
    public List<ClsCliente> listar() throws Exception {
        List<ClsCliente> clientes = null;
        ClsCliente cli;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT id_Cliente, Nombre, Apellido, fecha_Nacimiento, Sexo, Telefono, Direccion, Vigencia "
                + " FROM Cliente  "
                + " ORDER BY Nombre ";
        
        con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      rs = st.executeQuery(sql);
      clientes = new ArrayList<>();
      while (rs.next() == true) {
                cli = new ClsCliente();
                cli.setCodigo(rs.getInt("id_Cliente"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setApellido(rs.getString("Apellido"));
                cli.setFecha_Nacimiento(rs.getDate("fecha_Nacimiento"));
                cli.setSexo(rs.getString("Sexo"));
                cli.setTelefono(rs.getString("Telefono"));
                cli.setDireccion(rs.getString("Direccion"));
                cli.setVigencia(rs.getBoolean("Vigencia"));
                
                clientes.add(cli);
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
        return clientes;
    }
}

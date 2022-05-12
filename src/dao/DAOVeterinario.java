
package dao;

import accesodatos.Conexion;
import entidades.ClsVeterinario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DAOVeterinario {
    
    public void registrar(ClsVeterinario veterinario) throws Exception {
    Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_Nacimiento = sdf.format(veterinario.getFechaNacimiento());
    
    sql = "INSERT INTO Veterinario (Nombre, Apellido, Dni, fecha_Nacimiento, Sexo, Telefono, Vigencia) "
                + "VALUES('"+veterinario.getNombre()+"','"
                +veterinario.getApellido()+"','"
                +veterinario.getDni()+"','"
                +fecha_Nacimiento+"','"
                +veterinario.getSexo()+"','"
                +veterinario.getTelefono()+"',"
                + (veterinario.isVigencia() == true ? "1" : "0")+")";
            

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

    public void actualizar(ClsVeterinario veterinario) throws Exception {
        Conexion con;
    Connection cn = null;
    Statement st = null;
    String sql;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_Nacimiento = sdf.format(veterinario.getFechaNacimiento());
    
    sql = "UPDATE veterinario SET Nombre = '"
            + veterinario.getNombre()+ "', apellido = '"
            + veterinario.getApellido()+ "', dni = '"
            + veterinario.getDni()+ "', fecha_Nacimiento = '"
            + fecha_Nacimiento+"', sexo = '"
            + veterinario.getSexo()+ "', telefono = '"
            + veterinario.getTelefono()+ "', Vigencia = "
            + (veterinario.isVigencia() == true ? "1" : "0") 
            + " WHERE id_Veterinario = "+veterinario.getCodigoVet();

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
    
    public ClsVeterinario leer(ClsVeterinario veterinario) throws Exception {
    ClsVeterinario vet = null;
    Conexion con;
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = "SELECT V.Nombre, V.Apellido, V.Dni, V.Fecha_Nacimiento V.Sexo, V.Telefono, V.Vigencia "
            + "FROM Veterinario V "
            + "WHERE V.id_Veterinario = " + veterinario.getCodigoVet();
                
    con = new Conexion();
    try {
      cn = con.conectar();
      st = cn.createStatement();
      rs = st.executeQuery(sql);
      if (rs.next() == true) {
        vet = new ClsVeterinario();
        vet.setCodigoVet(veterinario.getCodigoVet());
        vet.setNombre(rs.getString("Nombre"));
        vet.setApellido(rs.getString("Apellido"));
        vet.setDni(rs.getString("Dni"));
        vet.setFechaNacimiento(rs.getDate("fecha_Nacimiento"));
        vet.setSexo(rs.getString("Sexo"));
        vet.setTelefono(rs.getString("Telefono"));
        vet.setVigencia(rs.getBoolean("Vigencia"));
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
    return vet;
  }
   
    public List<ClsVeterinario> listar() throws Exception {
        List<ClsVeterinario> veterinarios ;
        ClsVeterinario vet;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT id_Veterinario, Nombre, Apellido, Dni, Fecha_Nacimiento, Sexo, Telefono, Vigencia "
                + " FROM Veterinario  "
                + " ORDER BY Nombre ";
        
        con = new Conexion();
        try{
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            veterinarios = new ArrayList<>();
            while(rs.next() == true){
                vet = new ClsVeterinario();
                vet.setCodigoVet(rs.getInt("id_Veterinario"));
                vet.setNombre(rs.getString("Nombre"));
                vet.setApellido(rs.getString("Apellido"));
                vet.setDni(rs.getString("Dni"));
                vet.setFechaNacimiento(rs.getDate("fecha_Nacimiento"));
                vet.setSexo(rs.getString("Sexo"));
                vet.setTelefono(rs.getString("Telefono"));
                vet.setVigencia(rs.getBoolean("Vigencia"));
                
                veterinarios.add(vet);
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
        return veterinarios;
    }
    
}

package dao;

import entidades.ClsUsuario;
import java.util.ArrayList;
import java.util.List;

public class DAOUsuario {
  
  private List<ClsUsuario> usuarios;
  
  public DAOUsuario(){
    ClsUsuario usuario = new ClsUsuario();
    usuarios = new ArrayList<>();
    usuario.setNombre("Alkhovet");
    usuario.setClave("123456789");
    usuario.setVigencia(true);
    usuarios.add(usuario);
    usuario = new ClsUsuario();
    usuario.setNombre("Invitado");
    usuario.setClave("123");
    usuario.setVigencia(false);
    usuarios.add(usuario);
  }
  
  public ClsUsuario identificar(ClsUsuario usuario ){
    for (ClsUsuario usu : this.usuarios) {
      if( usu.getNombre().equals( usuario.getNombre()) == true &&
              usu.getClave().equals( usuario.getClave() ) == true ){
        return usu;
      }
    }
    
    return null;
  }
  
}

package entidades;

import javax.swing.JOptionPane;
import veterinaria_Alkhovet.Inicio;

public class Identificacion {

  public static void main(String[] args) {
    Inicio ventana = new Inicio();
    ClsUsuario usuario;

    usuario = ventana.identificar();
    ventana.dispose();
    if (usuario != null) {
      JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
    }

  }

}

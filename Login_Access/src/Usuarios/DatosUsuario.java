package Usuarios;

public class DatosUsuario {
	public DatosUsuario(){
		
	}
	String Usuario1 = "";
	String Pass1 = "";

	public int probarPass() {
		Usuario1=Usuarios.txt_usuario.getText();
		Pass1=Usuarios.pss_contraseña.getText();
		if (Usuario1.equals("lteran") && Pass1.equals("Polo")) {
			return 1;
		}
		
		else {
			return 0 ;
		}
	}
}

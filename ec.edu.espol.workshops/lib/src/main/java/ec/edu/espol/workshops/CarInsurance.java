<<<<<<< HEAD

=======
>>>>>>> SpotBugs
package ec.edu.espol.workshops;

public class CarInsurance {
	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD:ec.edu.espol.workshops/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
=======
>>>>>>> SpotBugs
		Cliente cl1= new Cliente(24,"M","no casado",true);
		Compania com = new Compania();
		System.out.println(cl1);
		System.out.println(com.calcularPrima(cl1));
<<<<<<< HEAD
		}
=======
<<<<<<< HEAD:ec.edu.espol.workshops/src/ec/edu/espol/workshops/CarInsurance.java
		}
=======
		
	}	
	
	
>>>>>>> SpotBugs:ec.edu.espol.workshops/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
>>>>>>> SpotBugs
}

class Cliente {
	private int edad;		 // Variable para la edad de la persona.
	private String sexo; 	 // Variable para ver que sexo es la persona.
	private String estado;	 // Variable para guardar si esta casado.
	private boolean permiso; // Variable para guardar el permiso.
	
<<<<<<< HEAD
=======
		Cliente cl1 = new Cliente(24, "M", "no casado", true);
		Compa�ia com = new Compa�ia();
		System.out.println(cl1);
		System.out.println(com.calcularPrima(cl1));

	}

}

class Cliente {
	private int edad;
	private String sexo;
	private String estado;
	private boolean permiso;

>>>>>>> Checkstyle:ec.edu.espol.workshopss/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
	public Cliente(int edad, String sexo, String estado, boolean permiso) {
		this.edad = edad;
		this.sexo = sexo;
		this.estado = estado;
		this.permiso = permiso;
	}
<<<<<<< HEAD:ec.edu.espol.workshops/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
=======
	public Cliente(int edad, String sexo, String estado, boolean permiso) {
		this.edad = edad;
		this.sexo = sexo;
		this.estado= estado;
		this.permiso = permiso;
	}
>>>>>>> SpotBugs

	public int getEdad() {
		return edad;
		}

	public void setEdad(int edad) {
		this.edad = edad;
		}

	public String getSexo() {
		return sexo;
		}

	public void setSexo(String sexo) {
		this.sexo = sexo;
		}

	public String getEstado() {
		return estado;
		}

	public void setEstado(String estado) {
		this.estado = estado;
		}

	public boolean getPermiso() {
		return permiso;
		}

	public void setPermiso(boolean permiso) {
		this.permiso = permiso;
		}
	public String toString() {
		return "Edad:" + edad + " " + "sexo:" + sexo + " " + "Estado civil:" + estado + " " + "Permiso de conducir:" + permiso;
<<<<<<< HEAD
=======
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public String getSexo(){
		return sexo;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public boolean getPermiso(){
		return permiso;
	}
	public void setPermiso(boolean permiso){
		this.permiso = permiso;
	}
	public String toString(){
		return "Edad:" + edad + " " + "sexo:" + sexo + " " + "Estado civil:" + estado + " " + "Permiso de conducir:"
				+ permiso;
>>>>>>> Checkstyle:ec.edu.espol.workshopss/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
	}
}

<<<<<<< HEAD:ec.edu.espol.workshops/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
=======
	}

}

>>>>>>> SpotBugs

<<<<<<< HEAD:ec.edu.espol.workshops/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
class Compania {
	
=======


class Compa�ia {
>>>>>>> PMd:ec.edu.espol.workshops/src/ec/edu/espol/workshops/CarInsurance.java
	int primaBase=500;
	public int calcularPrima(Cliente cliente) {
		Cliente cl = cliente;
	if(cl.getEdad()>80) {
		System.out.println("Debido a su edad no cumple los requisitos");
		return -1;
		}
	if(!cl.getPermiso()) {
		System.out.println("No tiene permiso de conducir");
		return -1;
		}
	if(cl.getSexo().equals("M") & cl.getEstado().equals("no casado") & cl.getEdad()<25) {  //Correguido
		primaBase = primaBase + 1500;
		}
	if(cl.getSexo().equals("F") | cl.getEstado().equals("casado")) {					 // Correguido
		primaBase = primaBase - 200;
<<<<<<< HEAD
=======
class Compa�ia {
	int primaBase = 500;
  public int calcularPrima(Cliente cliente) {
		Cliente cl = cliente;
		if (cl.getEdad() > 80) {
			System.out.println("Debido a su edad no cumple los requisitos");
			return -1;
		}
		if (!cl.getPermiso()) {
			System.out.println("No tiene permiso de conducir");
			return -1;
		}
		if (cl.getSexo() == "M" & cl.getEstado() == "no casado" & cl.getEdad() < 25) {
			primaBase = primaBase + 1500;
		}
		if (cl.getSexo() == "F" | cl.getEstado() == "casado") {
			primaBase = primaBase - 200;
		}
		if (cl.getEdad() >= 45 & cl.getEdad() < 65) {
			primaBase = primaBase - 100;
>>>>>>> Checkstyle:ec.edu.espol.workshopss/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
=======
>>>>>>> SpotBugs
		}
	if(cl.getEdad()>=45 & cl.getEdad()<65) {
		primaBase = primaBase - 100;
	}
<<<<<<< HEAD
<<<<<<< HEAD:ec.edu.espol.workshops/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
	return primaBase;
	}
}
=======
}
>>>>>>> Checkstyle:ec.edu.espol.workshopss/lib/src/main/java/ec/edu/espol/workshops/CarInsurance.java
=======
	return primaBase;
	}
}
>>>>>>> SpotBugs

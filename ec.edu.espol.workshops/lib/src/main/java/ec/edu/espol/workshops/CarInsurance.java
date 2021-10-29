package ec.edu.espol.workshops;

public class CarInsurance {

public static void main(String[] args) {

Cliente cl1 = new Cliente(24, "M", "no casado", true);

Compañia com = new Compañia();

System.out.println(cl1);
System.out.println(com.calcularPrima(cl1));



}



}



class Cliente {
private int edad;
private String sexo;
private String estado;
private boolean permiso;

public Cliente(int edad, String sexo, String estado, boolean permiso) {
this.edad = edad;
this.sexo = sexo;
this.estado = estado;
this.permiso = permiso;

}
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
return "Edad:" + edad + " " + "sexo:" + sexo + " " + "Estado civil:" + estado + " " + "Permiso de conducir:"
+ permiso;
}
}



class Compañia {
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
}
return primaBase;
}
}
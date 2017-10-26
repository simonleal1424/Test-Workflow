

public class Equipo {
	private String marca, modelo, falla;

    public Equipo(String ma, String mo, String fa) {
    	marca=ma;
    	modelo=mo;
    	falla=fa;
    }
    public String toString(){
    	return "Marca: "+marca+" Modelo: "+modelo+ " Falla: "+falla;
    }
    public String getMarca(){
    	return marca;
    }
    public String getModelo(){
    	return modelo;
    }
}
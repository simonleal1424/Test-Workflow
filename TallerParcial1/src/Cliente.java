

public class Cliente {
	private String nombre;
	private Equipo equipo;
	private Fecha recepcion, entrega;
	private float monto;

    public Cliente(String nom, Equipo e, Fecha re) {
    	nombre=nom;
    	equipo=e;
    	recepcion=re;
    	entrega=new Fecha(0,0,0);
    	monto=0;
    }
    public Cliente(Cliente c, Fecha en, float mon, int dif){
    	nombre=c.nombre;
    	equipo=c.equipo;
    	recepcion=c.recepcion;
    	entrega=en;
    	if(dif>3)
    		monto=mon-(mon*15/100);
    	else
    		monto=mon;	
    }
    
    public String toString(){
    	return "Cliente: "+nombre+" Equipo: "+equipo+" Fecha de recepcion: "+recepcion;
    }
    public Equipo getEquipo(){
    	return equipo;
    }
    public Fecha getRecep(){
    	return recepcion;
    }
    public float getMonto(){
    	return monto;
    }
}
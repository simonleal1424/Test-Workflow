

public class Empresa {
	private Cliente cli[],rep[];
	private int cont,ent,dem;
	private float percibido;

    public Empresa(int n) {
    	cli=new Cliente[n];
    	rep=new Cliente[n];
    	cont=0;
    	ent=0;
    	dem=0;
    	percibido=0;
    }
    
    public String recibirEquipo(Cliente c){
    	if(cont<cli.length){
    		cli[cont++]=c;
    		return "Cliente agregado.";
    	}
    	return "Lo siento, no tenemos mas espacio.";
    }
    public Cliente equipoAReparar(){
    	return cli[ent];
    }
    public String repararEquipo(Cliente c, int dif){
    	if(ent<rep.length){
    		rep[ent++]=c;
    		if(dif>3)
    			dem++;
    		percibido+=c.getMonto();
    	}		
    	return "Equipo entregado.";		
    }
    public int getDem(){
    	return dem;
    }
    public float getPercibido(){
    	return percibido;
    }
    public String marcaMasRecibida(){
    	int i,j,a=0,b=0,c=0;
    	String r="";
    	for(i=0;i<cont;i++){
    		for(j=i+1;j<cont;j++)
    			if(cli[i].getEquipo().getMarca().compareToIgnoreCase(cli[j].getEquipo().getMarca())==0){
    				a++;
    				if(a>b){
    					c=i;
    					b=a;
    				}
    			}	
    	}
    	r=cli[c].getEquipo().getMarca();
    	return r;
    }
    public String modeloMasRecibido(){
    	int i,j,a=0,b=0,c=0;
    	String r="";
    	for(i=0;i<cont;i++){
    		for(j=i+1;j<cont;j++)
    			if(cli[i].getEquipo().getModelo().compareToIgnoreCase(cli[j].getEquipo().getModelo())==0){
    				a++;
    				if(a>b){
    					c=i;
    					b=a;
    				}
    			}	
    	}
    	r=cli[c].getEquipo().getModelo();
    	return r;
    }
}
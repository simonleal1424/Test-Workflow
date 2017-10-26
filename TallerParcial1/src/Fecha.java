

public class Fecha {
	private int dia,mes,año;

    public Fecha(int d, int m, int a) {
    	dia=d;
    	mes=m;
    	año=a;
    }
    public String toString(){
    	return dia+"/"+mes+"/"+año;
    }
    public int diferenciaDias(Fecha re){
    	int dif,d1,d2;
    	d1=re.año*365+re.mes*30+re.dia;
    	d2=año*365+mes*30+dia;
    	dif=d2-d1;
    	return dif;
    }
}
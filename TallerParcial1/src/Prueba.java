import java.io.*;

public class Prueba {
    
    public static String leerCadena (String s){
    	BufferedReader en=new BufferedReader(new InputStreamReader(System.in));
    	String a="";
    	System.out.println(s);
    	try{
    		a=en.readLine();
    	}
    	catch (Exception ex){
    		System.out.println("Error!"+ex.toString());
    	}
    	return a;
    }    
    public static int leerEntero(String s){
    	BufferedReader en=new BufferedReader(new InputStreamReader(System.in));
    	int a=0;
    	System.out.println(s);
    	try{
    		a=Integer.parseInt(en.readLine());
    	}
    	catch (Exception ex){
    		System.out.println("Error!"+ex.toString());
    	}
    	return a;
    }
    public static float leerFloat(String s){
    	BufferedReader en=new BufferedReader(new InputStreamReader(System.in));
    	float a=0;
    	System.out.println(s);
    	try{
    		a=Float.parseFloat(en.readLine());
    	}
    	catch (Exception ex){
    		System.out.println("Error!"+ex.toString());
    	}
    	return a;
    }
    
    public static void main(String[] args) {
        Empresa e;
        int opc=0,n=0;
        do{
        	n=leerEntero("Ingrese máximo nro de clientes permitidos: ");
        }while(n<=1);
        e=new Empresa(n);
        do{
        	opc=leerEntero("MENÚ\n1. Recibir Equipo\n2. Reparar Equipo\n3. Reportar Marca más recibida\n4. Reportar Modelo más recibido\n5. Reportar cuantos clientes han sido atendidos con demora\n6. Reportar cuanto ha percibido la tienda\n7. Salir\nIngrese Opción: ");
        	switch (opc){
        		case 1:
        			Cliente c;
        			Equipo eq;
        			String nom,ma,mo,fa;
        			Fecha re;
        			int d,m,a;
        			nom=leerCadena("Ingrese nombre del cliente: ");
        			ma=leerCadena("Marca del equipo: ");
        			mo=leerCadena("Modelo del equipo: ");
        			fa=leerCadena("Falla del equipo: ");
        			eq=new Equipo(ma,mo,fa);
        			d=leerEntero("Dia de recepción: ");
        			m=leerEntero("Mes de recepción: ");
        			a=leerEntero("A�o de recepci�n: ");
        			re=new Fecha(d,m,a);
        			c=new Cliente(nom,eq,re);
        			System.out.println(e.recibirEquipo(c));
        			break;
        		case 2:
        			Cliente c1;
        			Fecha en;
        			float mon;
        			int d1,m1,a1,dif;
        			System.out.println("Equipo a reparar: ");
        			c1=e.equipoAReparar();
        			System.out.println(c1.toString());
        			mon=leerFloat("Ingrese costo de la reparaci�n: ");
        			do{	d1=leerEntero("Dia de reparaci�n: ");
        				m1=leerEntero("Mes de reparaci�n: ");
        				a1=leerEntero("A�o de reparaci�n: ");
        				en=new Fecha(d1,m1,a1);
        				dif=en.diferenciaDias(c1.getRecep());
        			}while (dif<3);
        			c1=new Cliente(c1,en,mon,dif);
        			System.out.println(e.repararEquipo(c1,dif));
        			break;	
        		case 3:
        			System.out.println(e.marcaMasRecibida());
        			break;
        		case 4:
        			System.out.println(e.modeloMasRecibido());
        			break;
        		case 5:
        			System.out.println("Nro de usuarios atendidos con demora: "+e.getDem());
        			break;
        		case 6:
        			System.out.println("Percibido por la tienda: Bs."+e.getPercibido());
        			break;	
        		case 7:
        			System.out.println("Good Bye!!");
        			break;
        		default:
        			System.out.println("Opcion Invalida");
        			break;	
        	}
        }while(opc!=7);
    }
}
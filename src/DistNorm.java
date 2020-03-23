
public class DistNorm {

	public DistNorm(){
	}
	public double calculaz(double v){ //funcion de densidad de probabilidad normal
		double N=Math.exp(-Math.pow(v, 2)/2)/Math.sqrt(2*Math.PI);
		return N;
	}
	public double calculazacum(double v){  //Funcion de distribucion de probabilidad normal
		double acumulador = 0.00000028666;
		for(double i=-5;i<v;i=i+0.00001){
			acumulador = acumulador + (0.00001 * calculaz(i-0.000005));
		}
		return acumulador;
	}
	
	public double calculap(double p){  //Funcion de distribucion de probabilidad normal
		double acumulador = 0.00000028666;
		double jump = 0.01;
		
		double i = -5;
		while(acumulador < p){
			acumulador = acumulador + (jump * calculaz(i-jump/2));
			i+=jump;
		}
		return i;
	}
}

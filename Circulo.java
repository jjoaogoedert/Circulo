package circulo;

import java.util.*;
import java.text.*;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		double area =  Math.PI*(raio*raio);
	
		String result = df.format(area);
		System.out.print("AREA = " + result);
		
		sc.close();
	}

}

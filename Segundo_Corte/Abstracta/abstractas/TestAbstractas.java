
package Test;

import abstractas.*;

public class TestAbstractas {
	
	public static void main (String[] args){
		FiguraGeometrica figura = new Rectangulo("Rectangulo 1");
		
		figura.dibujar();
		
		figura = new Cuadrado("Cuadrado 1");
		figura.dibujar();
		
		
	}
	
	
}

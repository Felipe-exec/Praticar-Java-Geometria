
public class Triangulo {
	
	
	//atributos
	private double b;
	private double h;
	
	//metodos
	public void setLado(double b, double h)
	{
		if (b > 0 && h > 0)
		{
			this.b = b;
			this.h = h;
		}
	}
	
	public double CalcArea()
	{
		double area;
		area = (b * h)/2;
		
		return area;
	}
	
	public void desenho()	//Tive como referencia o site https://introcs.cs.princeton.edu/java/13flow/Triangle.java.html
	{
		for (int i = 0; i < h + 1; i++) 
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(". ");
			}
			System.out.println();
		} //infelizmente só consegui fazer esse triangulo funcionar como equilátero.
	}
}
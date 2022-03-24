
public class Circulo 
{
	//atributos
	private double pi = 3.14;     //Supondo que PI vale 3.14
	private double r;
	
	
	//metodos
	public void setRaio(double r)
	{
		if (r > 0)
		{
			this.r = r;
		}
	}
	
	public double calcArea()
	{
		double area;
		area = pi * r * r;
		
		return area;
	}
	
	public double calcAreaWITHOUTPI()
	{
		double area;
		area = r * r;
		
		return area;
	}
	
	public void desenho()    //tive como referencia o site https://introcs.cs.princeton.edu/java/13flow/Circle.java.html
	{
        for (double i = -r; i <= r; i++) 
        {
            for (double j = -r; j <= r; j++) 
            {
                if (i*i + j*j <= r*r)
                {
                	System.out.print("* ");
                }
                	
                else  
                {
                	System.out.print(". ");
                }
            }
            System.out.println();
        }
	}
	
	
}

public class Quadrado 
{
	//Atributos
	private double l; //declaração de variável
	
	
	//Métodos
	public void setLado(double l)
	{
		if (l > 0)
		{
			this.l = l; 
		}
	}
	
	public double calcArea()
	{
		double area;
		area = l*l;
		
		return area;
	}
	
	public void desenho()
	{
		for (int i = 0; i < l; i++)
		{
			System.out.print(". ");
			for (int j = 0; j < l - 2; j++)
			{
				if (i == 0 || i + 1 >= l)
				{
					System.out.print(". ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println(".");
		}
	}
	
}

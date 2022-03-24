
public class Retangulo 
{
	//Atributos
	private double l1; //declarando variavel
	private double l2; 
	
	//Metodos
	
	public void setLado(double l1, double l2)
	{
		if (l1 > 0 && l2 > 0)
		{
			this.l1 = l1; 
			this.l2 = l2;
		}
	}
	
	public double calcArea()
	{
		double area;
		area = l1 * l2;
		
		return area;
	}
	
	public void desenho()
	{
		for (int i = 0; i < l1; i++)
		{
			System.out.print(".");
			for (int j = 0; j < l2 - 2; j++)
			{
				if (i == 0 || i + 1 >= l1)
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

import java.util.Scanner;

//Observacao: Atividade dada pelo Professor e Doutor em Ciências em Engenharia Elétrica: Emerson Assis de Carvalho.
//Observacao: Codigo feito para praticar programação orientada à objetos.
//Observacao: Alguns desenhos (triangulo e circulo) foram feitos com base no site https://introcs.cs.princeton.edu/java/home/

public class Main 
{
	
	public static void main(String[] args) 
	{
		//Quadrado---------------------------------------------------------------------------
		double n;
		Scanner leitor = new Scanner(System.in);
		System.out.println("-=-=-Calculo do Quadrado-=-=-");
		System.out.print("Digite o valor do lado do Quadrado: ");
		n = leitor.nextDouble();
		
		Quadrado quadrado1 = new Quadrado(); //instanciar classe Quadrado
		quadrado1.setLado(n);  //passando valor para setar o lado.
		
		System.out.println("Area do quadrado: " + quadrado1.calcArea()); //area quadrado
		System.out.println("Quadrado desenhado: ");      //desenho quadrado
		quadrado1.desenho();
		//-----------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		
		//Retangulo--------------------------------------------------------------------------
		double n1, n2;
		System.out.println("-=-=-Calculo do Retangulo-=-=-");
		System.out.print("Digite o valor do lado do Retangulo: ");
		n1 = leitor.nextDouble();
		System.out.print("Digite o valor do outro lado do Retangulo: ");
		n2 = leitor.nextDouble();
		
		Retangulo retangulo1 = new Retangulo(); //instanciar classe Retangulo
		retangulo1.setLado(n1, n2);
		
		System.out.println("Area do retangulo: " + retangulo1.calcArea());
		System.out.println("Retangulo desenhado: ");
		retangulo1.desenho();
		//-----------------------------------------------------------------------------------

		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		
		//Circulo----------------------------------------------------------------------------
		double nr;
		System.out.println("-=-=-Calculo do Circulo-=-=-");
		System.out.print("Digite o valor do raio: ");
		nr = leitor.nextDouble();
		
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(nr);
		
		System.out.println("Area do circulo: " + circulo1.calcArea() + " ou " + circulo1.calcAreaWITHOUTPI() + "pi");
		System.out.println("Circulo desenhado: ");
		circulo1.desenho();
		//----------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		
		//Triangulo-------------------------------------------------------------------------
		double nb, nh;
		System.out.print("Digite o valor da base: ");
		nb = leitor.nextDouble();
		System.out.print("Digite o valor da altura: ");
		nh = leitor.nextDouble();
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setLado(nb, nh);
		
		System.out.println("Area do triangulo: " + triangulo1.CalcArea());
		System.out.println("Triangulo desenhado: ");
		triangulo1.desenho();
		//----------------------------------------------------------------------------------
	}

}

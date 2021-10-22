public class Shape2DTest
{
	public static void main(String[] args)
	{
		/* Pet p1 = new Pet("Steve"); */
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2,2);
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(2,2);
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println();
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println();
		System.out.println();
		
		System.out.println("20 Random Shapes and Sizes");
		
		Shape2D[] shapes = new Shape2D[20];
		
		for(int i = 0; i < 20; i++)
		{
			int x = (int)(Math.random() * 100 - 1 + 1);
			int y = (int)(Math.random() * 100 - 1 + 1);
			int z = (int)(Math.random() * 2 + 1);
			if(z == 1)
				shapes[i] = new Rectangle(x,y);
			if(z == 2)
				shapes[i] = new Triangle(x,y);
				
			System.out.println(shapes[i]);
				
		}
		
		System.out.println();
		System.out.println("Area of Rectangles within random shapes");
		
		for(int i = 0; i < 20; i++)
		{
			if((shapes[i].getHeight() * shapes[i].getWidth()) == shapes[i].area())
			{
				System.out.println("Area of " + shapes[i] + " is " + shapes[i].area());
			}
		}
	}
}

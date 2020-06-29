package Calculator.calculator_devops;

public class App 
{
	public int add(int a,int b)
	{
		int sum = 0;
		sum = a + b;
		return sum;
	}
    public static void main( String[] args )
    {
    	App a = new App();
    	int result = a.add(5, 4);
        System.out.println("The result is "+result);
    }
}

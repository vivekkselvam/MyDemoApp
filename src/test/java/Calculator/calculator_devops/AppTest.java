package Calculator.calculator_devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest
{
	App a = new App();
    @Test
   public void testadd()
   {
    	assertEquals(6, a.add(3, 3));
   }
    
}

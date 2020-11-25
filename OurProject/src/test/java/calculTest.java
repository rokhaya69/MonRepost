import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Calcul.Calculator;

public class calculTest {

	
	@Test
	public void testSum() throws Exception {
	Calculator calculator = new Calculator();
	int result = calculator.sum(3, 3);
	Assert.assertEquals(6, result);
		
	}

}

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestSuitEntity{
                    private int a = 1;
                    private int b =3;
                 
                                
                   @Test  
                   public void alwaysPass1_newClass()
                   {
                       Assert.assertEquals(a, b);
                       Assert.assertEquals(1, 4);
                   }
			
		
		               @Test  
                   public void alwaysPass1New_newClass()
                   {
                       Assert.assertEquals(1, 1);
                   }
			
		               @Test  
                   public void alwaysPass1New2_newClass()
		               {
			   
                       Assert.assertEquals(1, 2);
                   }
			
		               @Test  
                   public void alwaysPass1New1_newClass()
                   {
                    
                       Assert.assertEquals(1, 2);
                   }
                   
}

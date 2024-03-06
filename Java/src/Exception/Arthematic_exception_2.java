package Exception;
import java.math.BigDecimal;

public class Arthematic_exception_2 {
	
           public static void main() {
        	   BigDecimal obbig=new BigDecimal(11);
        	   BigDecimal obbig2=new BigDecimal(12);
        	   try {
        		   obbig=obbig.divide(obbig2);
        	   }catch(Exception e) {
        		   e.printStackTrace();
        	   }
           }
}

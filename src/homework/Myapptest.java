package homework;

import org.junit.Test;

public class Myapptest {

	public Myapptest(){
		
	}
	 sc c= new sc ();
      @Test
 	public void emptycart() {
 		
		assert(c.count==0);
	
	}
      @Test
	public void scproduct() {
    	 
		product r =new product();
		r.quantity=1;
		r.price=127;
		r.name="java book";
	    c.addproduct(r);
	    assert(c.count==1 && c.total ==127);
	    
	    product rr =new product();
		rr.quantity=1;
		rr.price=100;
		rr.name="web design book";
	    c.addproduct(rr);
	    assert(c.count==2 && c.total==227);
	    
	    
	    
	    
	}
	
	
}

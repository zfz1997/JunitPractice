package junitPractice;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class JunitTest {
	   @Test
       public void test1() {
    	     Object a=new Object();
    	     assertTrue("failure-should be true",MyMethod.compareObject(a,a));
       }
	   
	   @Test
	   public void test2() {
		   assertArrayEquals("failure_array not same",MyMethod.array1,MyMethod.array2);
	   }
	   
	   @RunWith(Suite.class)
	   @Suite.SuiteClasses({
	         JunitTest.class
	   })

	    class FeatureTestSuite {
	     // the class remains empty,
	     // used only as a holder for the above annotations
	   }
	   
	   
}

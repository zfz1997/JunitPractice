package junitPractice;

public class MyMethod {
        public static int[] array1= {1,2,3,4};
        public static int[] array2= {1,2,3};
	
	public static boolean compareObject(Object o1,Object o2) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o1==o2;
		
	}
	
}

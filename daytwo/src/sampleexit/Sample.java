package sampleexit;


class Sample {

	public static void main(String p[]) {
		Sample s = new Sample();
		s.mth1();
	}
    
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}
	
	public void mth2() {
		try {
			System.out.println("in try");
			int a = 10/0;
			System.out.println(a);
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("catch-meth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}


}

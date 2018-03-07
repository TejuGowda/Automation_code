package programs;

class Demo1
{
	private static Demo1 d1=null;
	private Demo1(){
		
		}
	
	public static Demo1 get()
	{
		if(d1==null)
			d1=new Demo1();
		return d1;
	}
}


public class Demo {


	public static void main(String[] args) {
		
	   System.out.println(Demo1.get());
	   System.out.println(Demo1.get());
	   
	}
}

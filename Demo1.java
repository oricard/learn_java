
public class Demo1
{
	public static void main(String[] args)
	{
//		int num=0;
		printHr();
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
//		System.out.println("\n"+num);
//		System.out.println((char)(2+'A'));
		printHr();
		Multable(8);
		printHr();
		w:for(int i=1;i<10;i++)
		{
			q:for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				break w;
			}
//			System.out.println();//执行不到
		}
		System.out.println();
		printHr();
		w:for(int i=1;i<10;i++)
		{
			q:for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				continue w;
			}
//			System.out.println();//执行不到
		}
		System.out.println();
		printHr();
		System.out.println(add(add(3,4),8));
		printHr();
		System.out.println(judge(99,99));
		printHr();
		
	}
	 public static int add(int a,int b)
	 {
		 int c;
		 c=a+b;
		 return c; 
	 }
	 public static boolean judge(int x,int y)
	 {
		 boolean result;
		 if(x==y)
		 {
//			 System.out.println(x+"与"+y+"相同");
			 result=true;
		 }
		 else
		 {
//			 System.out.println(x+"与"+y+"不相同");
			 result=false;
		 }
		 return result;
	 }
	 public static void Multable(int x)
	 {
		 for(int i=1;i<=x;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}
				System.out.println();
			}
	 }
	 public static void printHr()
	 {
		 System.out.println("--------------------------------------"); 
	 }
}
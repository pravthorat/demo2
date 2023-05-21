package demo2;

public class if_else
{
public static void main (String[] args) 


{
	int marks=60;
			if (marks>=65)  //condition 1
				
			{
				System.out.println("Distiction");
			}
			else if(marks<=64 & marks>=60) //condition 2
				
			{
				System.out.println("frist class");
			}
			 else if  (marks<=60 & marks>=50)
			{
				System.out.println("Second class");
			}
			 else if(marks<=50 & marks>=35)
				 System.out.println("pass");
			
			 else if (marks<35)
                System.out.println("fail");
}


}

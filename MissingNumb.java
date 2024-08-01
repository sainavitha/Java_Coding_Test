package activities;
public class MissingNumb {

	public static void main(String[] args) 
	{
	int a[]= {2,3,4,5,7,6,8};
	int n= a.length+1;
	int sum=(n*(n+1))/2;//1*3
	for(int i=0;i<a.length;i++)
	{
		sum=sum-a[i];
	}
	System.out.print("Missing number is: " +  sum );


}
}

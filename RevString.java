package activities;

public class RevString {

	public static void main(String[] args) 
	{
		
     String str="Navitha";
     String result="";
     for(int i=str.length()-1;i>=0;i--)
     {
    	 result=result+str.charAt(i);
     }
     System.out.println("result is " + result);
	}

}

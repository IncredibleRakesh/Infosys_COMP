import java.util.*;
public class Monster_Pubg {
    static int n,myexp;
    static int[] exp,bonus;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        myexp = s.nextInt();
        exp = new int[n];
        for(int i = 0; i < exp.length; i++) 
        {
			exp[i]= s.nextInt();
	    }
        bonus = new int[n];
        for(int i = 0; i < bonus.length; i++) 
        {
			exp[i]= s.nextInt();
	    }
        int[] s_exp = sort(exp);
        int count =0;
        int  temp = myexp;
        if(myexp < s_exp[0])
        {
        	System.out.println();
        }
        else
        {
           for(int i=0;i<exp.length;i++)
           {
        	   int c= 0;
        	   for(int j=0;j<exp.length;j++)
        	   {
        		   if(s_exp[i]==exp[j])
        		   {
        			 
        			   while(temp>=s_exp[i])
        			   {
        				    temp = myexp + bonus[c];
        				    count++;
        				    break;
        			   }   
        			  
        		   }
        		   else{
        			   c++;
        		   } 
        	   }
           }
           
        }
       System.out.println(count);
	}   
    public static int[] sort(int[] c)
    {
       int temp;
       for(int i =0;i<c.length;i++)
       {
    	   for(int j=1;j<c.length;j++)
    	   {
    		   if(c[j-1]>c[j])
    		   {
    			   temp = c[j-1];
    			   c[j-1]=c[j];
    			   c[j]=temp;
    		   }
    	   }
       }
       return c;
    }
}

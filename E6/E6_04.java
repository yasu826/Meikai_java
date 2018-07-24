import java.util.Scanner;
import java.util.Random;

public class E6_04 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
        System.out.print("要素数：");
        int n=stdIn.nextInt();
        int[]a=new int[n];
        
        for(int i=0;i<n;i++) {
        	  a[i]=rand.nextInt(10)+1;
        }
        int max=0;
        for(int i=0;i<n;i++) {
        	   if(a[i]>max)
        		   max=a[i];
        }
        
        for(int i=0;i<max;i++) {
        	  for(int j=0;j<n;j++) {
        		  if((max-i)<=a[j]) {
        			  System.out.print("*"); 
        		  }else {
        		    System.out.print(" ");
        	      }
        		  if(j+1<n) {
        			 System.out.print(" ");
        		  }
        	  }	  System.out.println();  
        }
        for(int i=1;i<=n;i++) {
           	System.out.print((i==n)?"-":"--");
        }
        System.out.println();
        
        for(int i=0;i<n;i++) {
        	    System.out.print(i%10);
        	    System.out.print(" ");
        }
	}
}

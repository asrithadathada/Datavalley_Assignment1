import java.util.*;
public class ElementMax
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int arr[]=new int[n];
		for(int x=0;x<n;x++){
		    arr[x]=input.nextInt();
		}
		int max_ele=arr[0];
		for(int x=1;x<n;x++){
		    if(arr[x]>max_ele){
		        max_ele=arr[x];
		    }
		}
		System.out.println(max_ele);
		
	}
}

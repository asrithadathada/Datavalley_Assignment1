import java.util.*;
public class Countelement
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int arr[]=new int[n];
		for(int x=0;x<n;x++){
		    arr[x]=input.nextInt();
		}
		int temp=0;
		for(int x=0;x<n-1;x++){
		    for(int y=0;y<n-x-1;y++){
		        if(arr[y]>arr[y+1]){
		            temp=arr[y];
		            arr[y]=arr[y+1];
		            arr[y+1]=temp;
		        }
		    }
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int x:arr){
		    if(map.containsKey(x)){
		        map.put(x,map.get(x)+1);
		    }else{
		        map.put(x,1);
		    }
		}

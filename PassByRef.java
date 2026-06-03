import java.util.*;
class Solution{
	public static void reverse(int arr[]){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
public class PassByRef{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Solution obj=new Solution();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		obj.reverse(arr);
		for(int i=0;i<n;i++){
			System.out.println(arr[i] +" ");
		}
	}
}
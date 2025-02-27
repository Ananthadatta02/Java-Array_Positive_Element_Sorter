package sortingOperations;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Positive_Elements 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
				count++;
		}
		int newArr[] = new int[count];
		int index = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
				newArr[index++] = arr[i];
		}
		for(int i=0;i<=newArr.length-1;i++)
			{
				for(int j=0;j<=i-1;j++)
				{
					if(newArr[j]>newArr[i])
					{
						int temp = newArr[i];
						newArr[i] = newArr[j];
						newArr[j] = temp;
					}
				}
			}
		index = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				arr[i] = newArr[index++];
			}
		}
		System.out.println("Sorted Array" + Arrays.toString(arr));
	}
}
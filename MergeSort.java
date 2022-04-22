package com.algorithm;


import java.util.Arrays;

public class MergeSort {
	    public static void main(String[] args)
	    {
	        
	        Sort sort=new Sort();
	        int[] arr={33,22,44,11,55,1};
	        sort.divide(arr,0,arr.length-1);
	        System.out.println(Arrays.toString(arr));
	    }
	}

	class Sort
	{
	    public void divide(int[] arr,int start,int end)
	    {
	        System.out.println(start+" "+end);
	        if(start<end)
	        {
	            int mid=(start+end)/2;
	            divide(arr,start,mid);
	            divide(arr,mid+1,end);
	            merge(arr,start,mid,end);
	        }
	    }

	    public void merge(int[] arr,int start,int mid,int end)
	    {
	        int n1,n2,k,i,j;
	        n1=mid-start+1;
	        n2=end-mid;

	        int[] subArray1=new int[n1];
	        int[] subArray2=new int[n2];

	        for(i=0;i<n1;i++)
	        {
	            subArray1[i]=arr[start+i];
	        }
	        for(j=0;j<n2;j++)
	        {
	            subArray2[j]=arr[mid+j+1];
	        }

	        i=0;j=0;k=start;

	        while(i<n1 && j<n2)
	        {
	            if(subArray1[i]<=subArray2[j])
	            {
	                arr[k++]=subArray1[i++];
	            }
	            else
	            {
	                arr[k++]=subArray2[j++];
	            }




	        }

	        System.out.println(Arrays.toString(arr));

	        while(i<n1)
	        {
	            arr[k++]=subArray1[i++];
	        }
	        while (j<n2)
	        {
	            arr[k++]=subArray2[j++];
	        }
	    }
	}


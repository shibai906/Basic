package com.zhao.arithmetic;

public class TestHeadSort {
	public static void main(String[] args) {
		
		int[] array=new int[]{14,1,2,4,3,7,8,9,10,16};
	    HeadSort heap=new HeadSort(array);
	   
	    heap.HeapSort();
	    System.out.println("执行堆排序后数组的内容");
	    printHeap(heap.heap);
	}
	
	private static void printHeapTree(int[] array)
	{
	    for(int i=1;i<array.length;i=i*2)
	    {
	        for(int k=i-1;k<2*(i)-1&&k<array.length;k++)
	        {
	            System.out.print(array[k]+" ");
	        }
	        System.out.println();
	    }    
	}
	private static void printHeap(int[] array)
	{
	    for(int i=0;i<array.length;i++)
	    {
	        System.out.print(array[i]+" ");
	    }
	}
}

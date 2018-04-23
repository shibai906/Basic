package com.zhao.arithmetic;

public class HeadSort {

	public int[] heap;
	private int heapsize;

	public HeadSort(int[] array) {
		this.heap = array;
		this.heapsize = heap.length;
	}

	public void BuildMaxHeap() {
		for (int i = heapsize / 2 - 1; i >= 0; i--) {
			Maxify(i);
		}
	}

	public void HeapSort() {
		for (int i = 0; i < heap.length; i++) {

			int temp = heap[0];
			heap[0] = heap[heapsize - 1];
			heap[heapsize - 1] = temp;
			heapsize--;
			Maxify(0);

		}
	}

	public void Maxify(int i) {

		int left = Left(i);
		int right = Right(i);

		int largest;
		if (left < heapsize && heap[left] > heap[i]) {
			largest = left;
		} else
			largest = i;
		if (right < heapsize && heap[right] > heap[largest])
			largest = right;
		if (largest == i || largest >= heapsize) {
			return;
		}

		int temp = heap[i];
		heap[i] = heap[largest];
		heap[largest] = temp;

		Maxify(largest);
	}

	public void IncreaseValue(int i, int val) {

		heap[i] = val;
		if (i >= heapsize || i <= 0 || heap[i] >= val) {
			return ;
		}
		int p = Parent(i);
		if(heap[p] >= val)
			return ;
		heap[i] = heap[p];
		IncreaseValue(p,val);
	}

	private int Parent(int i) {
		return (i - 1) / 2;
	}

	private int Left(int i) {
		return 2 * (i + 1) - 1;
	}

	private int Right(int i) {
		return 2 * (i + 1);
	}
}

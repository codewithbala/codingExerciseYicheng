import java.util.*;

class MinHeap
{
	int[] heap;
	int size;
	int maxsize;
	
	MinHeap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size = 0;
		heap = new int[this.maxsize + 1];
		heap[0] = Integer.MIN_VALUE;
	}
	
	public void insert(int element)
	{

		if (size >= maxsize) {
			return;
		}

		heap[++size] = element;
		int current = size;

		while (heap[current] < heap[current / 2]) 
		{
			swap(current, current / 2);
			current = current / 2;
		}
	}
	
	public int remove()
	{

		int popped = heap[1];
		heap[1] = heap[size--];
		minHeapify(1);

		return popped;
	}
	
	
	public void print()
	{
		for (int i = 1; i <= size / 2; i++) 
		{
			System.out.print(heap[i] + "(" + heap[2 * i] + "," + heap[2 * i + 1] + ")");
			System.out.println();
		}
	}
	
	private void minHeapify(int pos)
	{	 
		if(pos > (size / 2))
		{
		int swapPos= pos;
		// swap with the minimum of the two children
		// to check if right child exists. Otherwise default value will be '0'
		// and that will be swapped with parent node. 
		if( (2 * pos) + 1 <=size)
		{
			swapPos = heap[(2 * pos)]<heap[(2 * pos) + 1]?(2 * pos):((2 * pos) + 1);
		}
		else
		{
			swapPos= (2 * pos);
		}
		
		if(heap[pos]>heap[(2 * pos)] || heap[pos]> heap[(2 * pos) + 1])
		{
			swap(pos,swapPos);
			minHeapify(swapPos);
		}
			
		}	 
	}
	
	
	private void swap(int fpos, int spos)
	{

		int tmp;
		tmp = heap[fpos];

		heap[fpos] = heap[spos];
		heap[spos] = tmp;
	}
	
	
}


class Question59 {
	public static void main(String[] args) 
	{
		// 59. Write a program to implement a minimum heap.
		MinHeap minHeap = new MinHeap(15);
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		minHeap.insert(19);
		minHeap.insert(6);
		minHeap.insert(22);
		minHeap.insert(9);
		
		minHeap.print();
		System.out.println("The Min val is "
						+ minHeap.remove());
		
	}
}
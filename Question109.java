import java.util.*;

class MaxHeap
{
	int[] heap;
	int size;
	int maxsize;
	
	MaxHeap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size = 0;
		heap = new int[this.maxsize + 1];
		heap[0] = Integer.MAX_VALUE;
	}
	
	public void insert(int element)
	{

		if (size >= maxsize) {
			return;
		}

		heap[++size] = element;
		int current = size;

		while (heap[current] > heap[current / 2]) 
		{
			swap(current, current / 2);
			current = current / 2;
		}
	}
	
	public int remove()
	{

		int popped = heap[1];
		heap[1] = heap[size--];
		maxHeapify(1);

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
	
	private void maxHeapify(int pos)
	{	 
		if(pos > (size / 2))
		{
		int swapPos= pos;
		// swap with the minimum of the two children
		// to check if right child exists. Otherwise default value will be '0'
		// and that will be swapped with parent node. 
		if( (2 * pos) + 1 <=size)
		{
			swapPos = heap[(2 * pos)] > heap[(2 * pos) + 1] ? (2 * pos):((2 * pos) + 1);
		}
		else
		{
			swapPos= (2 * pos);
		}
		
		if(heap[pos] < heap[(2 * pos)] || heap[pos] < heap[(2 * pos) + 1])
		{
			swap(pos,swapPos);
			maxHeapify(swapPos);
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


class Question109 {
	public static void main(String[] args) 
	{
		// 109. Write a program to implement a max-heap. 
		MaxHeap maxHeap = new MaxHeap(15);
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);
		
		maxHeap.print();
		System.out.println("The Max val is "
						+ maxHeap.remove());
		
	}
}
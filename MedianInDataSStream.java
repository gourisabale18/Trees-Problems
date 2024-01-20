//TC-> add->O(log(n)) add element to heap
//find median->O(1) get top element of heap
//SC->O(n)
class MedianFinder {
    static Queue<Integer> maxHeap;
    static Queue<Integer> minHeap;


    public MedianFinder() {
        //root will be largest element
        maxHeap=new PriorityQueue<>((a,b)->(b-a));
        //root will be smallest
        minHeap=new PriorityQueue<>();
    }
    
    //if current element smaller than top of max heap,put it to max heap
    //else put it to min heap
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>=num)
        {
            maxHeap.add(num);
            
        }
        else
        {
            minHeap.add(num);
        }
        //balance the heap sizes
        balanceHeaps();
        
    }
    //assume that max heap can contain one extra element in case odd no of elements
    public void balanceHeaps()
    {
        if(maxHeap.size()>minHeap.size()+1)
        {
            minHeap.add(maxHeap.poll());
        }
        
        else if(maxHeap.size()<minHeap.size())
        {
            maxHeap.add(minHeap.poll());
         }
    }
    
    public double findMedian() {
        
        //even no of elements,find avg to get median
        if(maxHeap.size()==minHeap.size())
        {
            return ((double)maxHeap.peek()+minHeap.peek())/2;
        }
        //odd no of elements
        else
        {
            return (double)maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
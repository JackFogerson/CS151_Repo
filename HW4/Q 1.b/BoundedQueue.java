/** 
    A first-in, first-out bounded collection of objects. 
*/ 
public class BoundedQueue<E>
{ 
   /** 
       Constructs an empty queue. 
       @param capacity the maximum capacity of the queue 
   */ 
   public BoundedQueue(int capacity) 
   { 
      elements = new Object[capacity]; 
      head = 0; 
      tail = 0; 
      size = 0;
   } 

   /** 
       Removes the object at the head. 
       @return the object that has been removed from the queue
       @precondition !isEmpty()
   */ 
   public E remove() 
   { 
      @SuppressWarnings("unchecked") E r = (E) elements[head]; 
      head++;
      size--;
      if (head == elements.length) 
      {
         head = 0; 
      }
      return r; 
   } 

   /** 
       Appends an object at the tail. 
       @param newValue the object to be appended 
       @precondition !isFull();
   */ 
   public void add(E newValue) 
   { 
      elements[tail] = newValue; 
      tail++;
      size++;
      if (tail == elements.length) 
      {
         tail = 0; 
      }
   } 

   public boolean isFull() 
   { 
      return size == elements.length;
   } 

   public boolean isEmpty() 
   { 
      return size == 0; 
   } 

   private Object[] elements; 
   private int head; 
   private int tail; 
   private int size;
}

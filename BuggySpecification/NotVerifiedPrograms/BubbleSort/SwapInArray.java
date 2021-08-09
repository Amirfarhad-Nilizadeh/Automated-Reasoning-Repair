   public class SwapInArray {
        /*@ requires 0 <= x && x < array.length && 0 <= y && y < array.length; 
	  @ assignable array[x], array[y]; 
	  @ ensures \old(array[x]) == array[y] && \old(array[y]) == array[x];
	  @ ensures array.length == \old(array.length); @*/
	public void swap(int index_x, int index_y,  int array[]) {
	  int temp;     
          temp = array[index_x];
          array[index_x] = array[index_y];
          array[index_y] = temp;
       }
    }

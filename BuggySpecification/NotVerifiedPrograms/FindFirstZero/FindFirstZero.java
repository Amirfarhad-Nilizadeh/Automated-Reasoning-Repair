public class FindFirstZero {
	 //@ ensures x.length == 0 ==> \result == -1;
   	 //@ ensures 0 <= \result && \result < x.length ==> x[\result] == 0 && (\forall int i; 0 <= i && i < \result; x[i] != 0);
	 //@ ensures \result == -1 ==> (\forall int i; 0 <= i && i < x.length; x[i] != 0);
    	 public int FindFirstZero(int[] arr) {
         	assert arr.length >= 0;
         	if (arr.length == 0) {
            		return -1;
        	} else {
            		int index = 0;
            		//@ maintaining (\forall int i; 0 <= i && i < index; x[i] != 0);
            		//@ maintaining (0 <= index && index <= x.length);
            		//@ decreases x.length - index;
            		while (arr.length - index > 0 && arr[index] != 0) {
                		index++;
            		}
            		if (arr.length - index == 0) {
               			index = -1;
            		}
            	return index;
        	}
    	}
}


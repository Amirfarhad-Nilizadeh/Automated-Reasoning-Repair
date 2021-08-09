public class OddEven {	
    	 //@ ensures \result <==>  x%2 == 0;
    	 //@ ensures !\result <==> x%2 != 0;
	 public /*@ pure @*/ boolean isEven(int input) { 
         	return input%2 == 0;
       	 } 

    	 //@ ensures !\result <==> x%2 == 0;
    	 //@ ensures \result <==>  x%2 != 0;
	 public /*@ pure @*/ boolean isOdd(int input) { 
         	return input%2 != 0;
       	 } 
}

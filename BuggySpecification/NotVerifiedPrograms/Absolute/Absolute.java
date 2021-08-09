public class Absolute {
	/*@    requires 0 <= num && num <= Short.MAX_VALUE;
	  @    ensures \result == num;
	  @ also
	  @    requires  Short.MIN_VALUE < num && num < 0;
	  @    ensures \result == -num; @*/
	public /*@ pure @*/ short Absolute(short numShort) {
		return (0 <= numShort) ? numShort : (short)-numShort;		
	}

	/*@    requires 0 <= num && num <= Integer.MAX_VALUE;
	  @    ensures \result == num;
	  @ also
	  @    requires Integer.MIN_VALUE < num && num < 0;
	  @    ensures \result == -num; @*/
	public /*@ pure @*/ int Absolute(int num) {
		return (0 <= num) ? num : -num;
	}

	/*@    requires 0 <= num && num <= Long.MAX_VALUE;
	  @    ensures \result == num;
	  @ also
	  @    requires  Long.MIN_VALUE < num && num < 0;
	  @    ensures \result == -num; @*/
	public /*@ pure @*/ long Absolute(long num) {
		return (0 <= num) ? num : -num;	
	}
}

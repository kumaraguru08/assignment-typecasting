package typeCasting;

public class Cast {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	public void convertToAllDataTypes(int input) {
		
        b = (byte)input;
		
		s = (short)input;
		
		i = input;
		
		l = input;
		
		f = input;
		
		d = input;
	}
	
	public void printAllValues() {
		
		System.out.print(System.lineSeparator()+"byte   : "+b);
		System.out.print(System.lineSeparator()+"short  : "+s);
		System.out.print(System.lineSeparator()+"int    : "+i);
		System.out.print(System.lineSeparator()+"long   : "+l);
		System.out.print(System.lineSeparator()+"float  : "+f);
		System.out.print(System.lineSeparator()+"double : "+d);
	}
}

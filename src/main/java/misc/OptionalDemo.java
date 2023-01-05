package misc;

import java.util.*;

public class OptionalDemo{
	
	public static void main(String... args){
	 Optional<String> noVal = Optional.empty();
	 Optional<String> hasVal = Optional.ofNullable (null);
	 if(noVal.isEmpty()) System.out.println("This won't get printed");
	// if(hasVal.isEmpty ()) System.out.println("value is "+hasVal.orElseThrow ());
	 String defStr = noVal.orElse("Default");
		
	}
}
package com.nit.java8;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		 //Creating Optional object from a String
		Optional<String> Got = Optional.of("Game of Thrones");
		
		
	    //Optional.empty() creates an empty Optional object
		Optional<String> nothing = Optional.empty();
		
		if(Got.isPresent()) {
			System.out.println("Watching Game of Thrones");
		}else {
			System.out.println("I am getting Bored");
		}
		/* ifPresent() method: It executes only if the given Optional         
        * object is non-empty.         
        */
		Got.ifPresent(s->System.out.println("Watching GOT is fun!"));
		System.out.println(nothing.orElse("I am Empty value"));
		System.out.println(nothing.orElseGet(() -> "Sareeshkumar M"));
		//System.out.println(nothing.orElseThrow());
       //This will not print as the nothing is empty 
		nothing.ifPresent(s->System.out.println("I prefer getting bored"));
		
	}

}

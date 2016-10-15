package _09_loops;

public class _04_challenge_exercises {

	public static void main(String[] args) {
			    
		//for loops
			    
		for(int i =0; i <=10; i++){
			    	System.out.println(i);
			    }
			    
	    for(int i =1; i <=10; i++){
			    	System.out.println(i +=1);
			    }
			    
	    for(int i =0; i <=30; i+=3){
		    	System.out.println(i);
				if(i==15){
					System.out.println("Mid Point");
				}else 
					System.out.println("");
			    }
			    
			    //count to 100 by 7s
			    //leave out 28 & 49
			    
			   //notice the combo by using || for 28 and 49, then "continue".
			   //alternative if(i!=28 && i!=49)
			   
			    for(int i =0; i <=100; i+=7){
			    	if (i==28 || i==49){
			    		continue;
			    	}
			    	System.out.println(i);
			    
			    }
			    
			    //Count from 1-10.
			    //Console: The number is (number).
			    //Console: If it's five, print "I'm alive"
			    
			    for(int i=0; i<=10; i++){
			    	if (i==5){
			    		System.out.println("I'm Alive!");
					}else
			    		System.out.println("The number is "+i);
			    }
			    
			    //print from 1 to 100.
			    //if i is a multiple of 3, print Fizz
			    //if i is a multiple of 5, print Buzz
			    //if i is a multiple of 3 & 5, print FizzBuzz
			    
			    for (int i=0; i<=100; i++){
			    	if (((i % 3)==0) && ((i % 5) == 0)){
			    	System.out.println("FizzBuzz");
			    	}else if (((i % 3) == 0)){
			    	System.out.print("fizz");
			      	}else if (((i % 5) == 0)){ 
			      	System.out.print("buzz");
			      	}else System.out.print(i);
			    }
		  }
			
	}



package com.JavaTraining.day4;
class InsufficientMarkException extends RuntimeException{
	public InsufficientMarkException(String e) { super(e); }
}

class InvalidMarkException extends RuntimeException{
	public InvalidMarkException(String er) { super(er); }
}

class ArrayException extends Exception{
	public ArrayException(String err) { super(err); }
	
}


public class MarkException {
	public static void main(String[] args) throws InsufficientMarkException, InvalidMarkException, ArrayException {
		int[] a = {92, 7 , 56 , 10, 598};
	
		
		 try {
		        if (a.length > 5) {
		            throw new ArrayException("Exception : Maximum 5 marks allowed");
		        }

		        int sum = 0;
		        for (int x : a) {
		            if (x < 0) {
		                throw new InsufficientMarkException("Insufficient Marks");
		            }

		            if (x > 100) {
		                throw new InvalidMarkException("Invalid Marks");
		            }

		            sum += x;
		        }

		        double avg = (double) sum / a.length;
		        System.out.println("Average Marks: " + avg);

		    } catch (ArrayException e) {
		        System.out.println(e.getMessage());

		    } catch (InsufficientMarkException e) {
		        System.out.println(e.getMessage());

		    } catch (InvalidMarkException e) {
		        System.out.println(e.getMessage());
		    }
		
		
	}
}

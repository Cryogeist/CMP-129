import java.util.Arrays; 
import java.util.Random;

//
// Code created during the "ArrayLecture" for which a student whom will be 
// nameless when then they caught by the teacher of this class mocking! Busted!
// Was too funny!
// 
class ArrayLectureCode {

    //---------------------------------------------------
    // test module to experiment with Array construct in Java
    //---------------------------------------------------
    public static void arrayTest() {

	// initialize an array with some data
	int [] A = { 0 , 1, 2, 3 };
	System.out.println(A[0]); // will output 0
	
	// using for loops
	// traditional for loop style
	int sum = 0;
	for(int i = 0; i < A.length ; i++ )
	    sum += A[i];
	System.out.println("sum = " + sum );

	// using enhanced for loop
	sum = 0;
	for( int a : A ) 
	    sum += a;
	System.out.println("sum = " + sum );


	// declare another array B
	// this shows that when assigning arrays the both 
	// regerence the same exact thing
	int [] B = A;
	B[0] = -987;
	System.out.println(A[0]); // will output -987

	// Arrays are passed by "refernce" so if the array is modified
	// in a function call, that modification will be permanent
	//
	// Here is where you were asked to implemnet the Swap Routine
	// and Print Routine
	print(A); // output will be -987 1 2 3
	swap( A, 0,1); // swap values at locations 0 and 1
	print(A); // output will be 1 -987 2 3

	// generate an array of 10 random numbers
	int [] C = new int[10];
	Random rand = new Random();
	for( int i = 0; i < C.length ; i++ )
	    C[i] = rand.nextInt(99); // generate a random integer between 0 and 99
	print(C);
	
	//
	//
	// use the array utilities
	// Arrays.copyOf makes a copy of A , D which will not reference the same loctions in memory
	int [] D = Arrays.copyOf( A , A.length) ; // copy the entire array
	D[0] = 622; // change index 0 to show that A will be unaffected
	System.out.println(A[0]); // output will be 1 since D is a separate copy from A 
	System.out.println(D[0]); // output will be 622 since D was modified
	print(D); // output will be 622 -987 2 3
	
	// now sort
	Arrays.sort(D);
	print(D); // output will be -987 2 3 622

    }
    
    //---------------------------------------------------
    // print the contents of an int array to a single line
    //---------------------------------------------------
    public static void print( int [] A ) {
	for ( int a : A ) System.out.print(a + " ");
	System.out.println(" ");
    }

    //---------------------------------------------------
    // the contents in an int array between index i and j
    //---------------------------------------------------
    public static void swap( int [] A , int i , int j ) {
	int tmp = A[i];
	A[i]= A[j];
	A[j] = tmp;
    }


    //--------------------------------------------
    // main
    //--------------------------------------------
    public static void main( String [] args ) {
	arrayTest();
    }

}
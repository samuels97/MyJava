import java.util.Scanner; //import the scanner class

class MyClass{
    public static void main(String[] args){
	int x, y, sum;
	Scanner myobj = new Scanner(System.in); //create a scanner object
	System.out.println("Type a number: ");
	x = myobj.nextInt();

	System.out.println("Type another number:");
	y = myobj.nextInt(); 

	sum = x + y;
	System.out.println("Sum is: "+sum);
    }
}

class EntertainmentTester{
	
	public static void main (String [] args){
		Entertainmentoperation operations=new Entertainmentoperation();
		Entertainment dto1=new Entertainment("rajkumara movie",2.30f ,true,4);
		Entertainment dto2=new Entertainment("series",3.30f ,false,6);
		
		
		boolean response = operations.add (0,dto1);
		System.out.println(response);
		System.out.println();
		boolean response2 = operations.add(1,dto2);
		System.out.println(response2);
		System.out.println();
		operations.printall();
		
		System.out.println("updatetypebyGood");
		operations.updatetypebyGood(false,"rajkumara movie");
		operations.updatetypebyGood(true,"series");
		operations.printall();
		
		
		
		
	}
}
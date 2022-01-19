class Entertainmentoperation{
	Entertainment dtos [] = new Entertainment[5];
	
	boolean add (int index,Entertainment dto){
		System.out.println("add() Started");
		boolean resu= true;
		if (index<dtos.length){
			dtos[index]=dto;
			System.out.println(dtos[index].type+"\t"+dtos[index].duration+"\t"+dtos[index].good+"\t"+dtos[index].rating);
			
			resu= true;
		}else{
			System.out.println("index value is invalid");
			resu=false;
		}
		System.out.println("add() ended");
		return resu;
		
		}
		
		void printall(){
			System.out.println("printall() method");
			for (int index=0;index<dtos.length;index++){
				if(dtos[index]!=null){
					System.out.println(dtos[index].type+"\t"+dtos[index].duration+"\t"+dtos[index].good+"\t"+dtos[index].rating);
					
				}
			}
		}
		void updatetypebyGood(boolean goody,String typer){
			for (int index=0;index<dtos.length;index++){
				if(dtos[index]!=null){
					if (typer.equals(dtos[index].type)){
						dtos[index].good=goody;
					}
				}
			}	
		}
	}
	
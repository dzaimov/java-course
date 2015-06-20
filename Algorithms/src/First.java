import java.util.ArrayList;


public class First {

	public static void main(String[] args) {
		//int mass1[] = {1,2,5,6,3,2,5};
		int mass[] = {5,17,13,9,5,8,11,6,3,1,5,12};
		
		ArrayList<Integer> index=new ArrayList<Integer>();
		ArrayList<Integer> finals=new ArrayList<Integer>();
		int secondsize=0;
		int biggest=0;
		
		int flag=1;
		for(int i=0;i<mass.length;i++){
			for(int p=(i+1);p<mass.length-1;){
				
				if(flag==1){
					if(mass[i]>mass[p]){
						index.add(i);
						index.add(p);
						
						biggest++;
						biggest++;
						
						flag=0;
						continue;
					}
					else{
						break;
					}
					
				}else{
					
						if(mass[p]>mass[p+1]){
							index.add(p+1);
							
							biggest++;
						}
						else{
							break;
						}
					
				}
				p++;
			}
			
			flag=1;
			if(secondsize<biggest){
				secondsize=biggest;
				biggest=0;
				finals=new ArrayList<Integer>();
				for(int k=0;k<index.size();k++){
					
					finals.add((index.get(k)));
					
				}
			}
			if(secondsize==biggest){
					for(int k=0;k<index.size();k++){
					
					finals.add((index.get(k)));
					
				}
			}
			
			biggest=0;
			
			index=new ArrayList<Integer>();
			
		}
      for(int i=0;i<finals.size();i++){
    	  System.out.print(mass[finals.get(i)] + " ");
      }
	}
}



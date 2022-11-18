package learning;

public class dice {

	public static void main(String[] args) {
		
		for (int i=0;i<20;i++) {
			System.out.println(dice(6));
		}

	}
	
    public static int dice(int dice){
        return (int)(Math.random()*dice)+1;
    }

}

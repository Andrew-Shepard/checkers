
public class checkers {
	public static void main(String[] args) {
		String[][] mat = {	{"-","r","-","r","-","r","-","r", },
							{"r","-","r","-","r","-","r","-", },
							{"-","r","-","r","-","r","-","r", },
							{"-","-","-","-","-","-","-","-", },
							{"-","-","-","-","-","-","-","-", },
							{"b","-","b","-","b","-","b","-", },
							{"-","b","-","b","-","b","-","b", },
							{"b","-","b","-","b","-","b","-", },
								};
		display(mat);
		moveRed(mat, 1, 6, 2 , 5);
		display(mat);
			}
	
public static void display(String[][] mat){
	//String alpha and numbers add the coordinate system for movement
	String alpha = "12345678";
	String numbers = "12345678";
	for (int i = 0; i < mat.length; i++) {
	 
		for (int j = 0; j < mat[i].length; j++) {
		   System.out.print(mat[i][j] + "\t");

		  }
		String temp = alpha.substring(0+i,i+1);
		System.out.println(temp); 
		}
	for (int i = 0; i != 8; i++)
	{
		String temp1 = numbers.substring(0+i,i+1);
		System.out.print(temp1+"\t"); 
	}
	
}
public static void moveRed(String[][] mat, int x, int y, int x1, int y1){
	mat[x1][y1] = mat[x][y];
	//this command doesnt work rn
}
}

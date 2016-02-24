import java.util.*;
public class checkers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//board
		String[][] mat = {	{"x","r","x","r","x","r","x","r", },
							{"r","x","r","x","r","x","r","x", },
							{"x","r","x","r","x","r","x","r", },
							{"-","x","-","x","-","x","-","x", },
							{"x","-","x","-","x","-","x","-", },
							{"b","x","b","x","b","x","b","x", },
							{"x","b","x","b","x","b","x","b", },
							{"b","x","b","x","b","x","b","x", },
								};
		display(mat);
		while(statusRed(mat) == true && statusBlack(mat) == true)
		{	System.out.println(" ");
			System.out.println("Enter first where you would like to move it to in (column,row) and " +
								"second  the piece you want to move in (column,row)");
			int x1 = reader.nextInt();
			int y1 = reader.nextInt();
			int x = reader.nextInt();
			int y = reader.nextInt();
			move(mat, y1, x1, x , y);
			display(mat);
			
		}

		display(mat);
		
			}
	
public static boolean statusRed(String [][] mat)
{	for (int i = 0; i < mat.length; i++) {
		 for (int j = 0; j < mat[i].length; j++) {
			 if (mat[i][j].equals("r"))
				 return true;
		 }
	}
return false;
}
public static boolean statusBlack(String [][] mat)
{	for (int i = 0; i < mat.length; i++) {
		 for (int j = 0; j < mat[i].length; j++) {
			 if (mat[i][j].equals("b"))
				 return true;
		 }
	}
return false;
}
public static void display(String[][] mat){
	//String alpha and numbers add the coordinate system for movement
	String alpha = "01234567";
	String numbers = "01234567";
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
public static void move(String[][] mat, int x1, int y1, int x, int y){
	String z = mat[x1][y1];
	if (z.equals("x")||mat[x][y].equals("x"))
		System.out.println("You cant move there!");
	else{
	mat[x1][y1] = mat[x][y];
	mat[x][y] = z;
	}
}
}

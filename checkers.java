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
			System.out.println("Enter first  (column,row) and the piece you want to move in " +
								"secondwhere you would like to move it to in(column,row)");
			int x1 = reader.nextInt() - 1;
			int y1 = reader.nextInt() - 1;
			int x = reader.nextInt() - 1;
			int y = reader.nextInt() - 1;
			move(mat, y1, x1, y , x);
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
public static void move(String[][] mat, int x1, int y1, int x, int y){
	String z = mat[x1][y1];
	//moving forward error
	if (z.equals("x")||mat[x][y].equals("x"))
		System.out.println("You cant move there!");
	//(single)Jumping a red 
	
	else if (x1 !=0 && y1 !=0){
		if ( mat[x1-1][y1-1].equals("r") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1-1][y1-1] = "-";
		}
	}
	else if ( mat[x1+1][y1+1].equals("r") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 ){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1+1][y1+1] = "-";
	}
	else if (x1 != 0){
		if ( mat[x1-1][y1+1].equals("r") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 ){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1-1][y1+1] = "-";
		}
	}
	else if (y1 != 0){
		if ( mat[x1+1][y1-1].equals("r") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 )
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1+1][y1-1] = "-";
		}
	}
	//(single)Jumping a black 
	else if ( mat[x1-1][y1-1].equals("b") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 ){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1-1][y1-1] = "-";
	}
	else if ( mat[x1+1][y1+1].equals("b") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 ){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1+1][y1+1] = "-";
	}
	else if ( mat[x1-1][y1+1].equals("b") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 ){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1-1][y1+1] = "-";
	}
	else if ( mat[x1+1][y1-1].equals("b") && !mat[x1-1][y1-1].equals(mat[x][y]) && (x1-x)%2 == 0 && (y1-y)%2 == 0 ){
		mat[x1][y1] = mat[x][y];
		mat[x][y] = z;
		mat[x1+1][y1-1] = "-";
	}
	//Normal movement
	else if ((x1-x)%2 != 0 && (y1-y)%2 != 0) {
	mat[x1][y1] = mat[x][y];
	mat[x][y] = z;
	}
}
}

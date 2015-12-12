import java.util.Scanner;

public class Main {
	
	public static  boolean player1= true;
	public static  boolean p1win = false;
	public static  boolean p2won = false;
	public static  boolean playing = true;
	public static  Scanner scan = new Scanner(System.in);
	public static  boolean playAgain = false;
	
	public static  tictactoe board = new tictactoe();
	
	public static void main(String[] args){
			if(board.isVisible() == false){
				board.setVisible(true);
			
		} 
		
				
	}
	
	 public static void checkforwin(){
		 	if(board.button1.getText().equals("X")){
			 	if(board.button4.getText().equals("X")){
				 	if(board.button7.getText().equals("X")){
					 		p1win =true;
					 		p2won = false;
					 		System.out.println("Player won!");
					 		board.setVisible(false);
					 	}
				 	}
			 	}
			 	if(board.button1.getText().equals("X")){
				 	if(board.button5.getText().equals("X")){
					 	if(board.button9.getText().equals("X")){
						 		p1win =true;
						 		p2won = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button1.getText().equals("X")){
				 	if(board.button2.getText().equals("X")){
					 	if(board.button3.getText().equals("X")){
						 		p1win =true;
						 		p2won = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button3.getText().equals("X")){
				 	if(board.button5.getText().equals("X")){
					 	if(board.button7.getText().equals("X")){
						 		p1win =true;
						 		p2won = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button3.getText().equals("X")){
				 	if(board.button6.getText().equals("X")){
					 	if(board.button9.getText().equals("X")){
						 		p1win =true;
						 		p2won = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button7.getText().equals("X")){
				 	if(board.button8.getText().equals("X")){
					 	if(board.button9.getText().equals("X")){
						 		p1win =true;
						 		p2won = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}if(board.button4.getText().equals("X")){
					 	if(board.button5.getText().equals("X")){
						 	if(board.button6.getText().equals("X")){
							 		p1win =true;
							 		p2won = false;
							 		System.out.println("Player won!");
							 	}
						 	}
					 	}if(board.button2.getText().equals("X")){
						 	if(board.button5.getText().equals("X")){
							 	if(board.button8.getText().equals("X")){
								 		p1win =true;
								 		p2won = false;
								 		System.out.println("Player won!");
								 	}
							 	}
						 	}
			 	
					 
						 	if(board.button1.getText().equals("O")){
							 	if(board.button4.getText().equals("O")){
								 	if(board.button7.getText().equals("O")){
									 		p1win = false;
									 		p2won = true;
									 		System.out.println("Player 2 won!");
									 	}
								 	}
							 	}
							 	if(board.button1.getText().equals("O")){
								 	if(board.button5.getText().equals("O")){
									 	if(board.button9.getText().equals("O")){
										 		p1win =false;
										 		p2won = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button1.getText().equals("O")){
								 	if(board.button2.getText().equals("O")){
									 	if(board.button3.getText().equals("O")){
										 		p1win =false;
										 		p2won = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button3.getText().equals("O")){
								 	if(board.button5.getText().equals("O")){
									 	if(board.button7.getText().equals("O")){
										 		p1win =false;
										 		p2won = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button3.getText().equals("O")){
								 	if(board.button6.getText().equals("O")){
									 	if(board.button9.getText().equals("O")){
										 		p1win =false;
										 		p2won = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button7.getText().equals("O")){
								 	if(board.button8.getText().equals("O")){
									 	if(board.button9.getText().equals("O")){
										 		p1win =false;
										 		p2won = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}if(board.button4.getText().equals("O")){
									 	if(board.button5.getText().equals("O")){
										 	if(board.button6.getText().equals("O")){
											 		p1win =false;
											 		p2won = true;
											 		System.out.println("Player 2 won!");
											 	}
										 	}
									 	}if(board.button2.getText().equals("O")){
										 	if(board.button5.getText().equals("O")){
											 	if(board.button8.getText().equals("O")){
												 		p1win =false;
												 		p2won = true;
												 		System.out.println("Player 2 won!");
												 	}
											 	}
										 	}
									 	if(p1win == true || p2won == true){
									 		
									 		System.out.println("Would you like to play again!? true or false");
									 		playAgain = scan.nextBoolean();
									 		if(playAgain == true ){
									 			board.setVisible(false);
									 			System.out.println("Player1 Won: " + p1win);
									 			System.out.println("Player2 Won: " + p2won);
									 			board.button1.setText("");
									 			board.button2.setText("");
									 			board.button3.setText("");
									 			board.button4.setText("");
									 			board.button5.setText("");
									 			board.button6.setText("");
									 			board.button7.setText("");
									 			board.button8.setText("");
									 			board.button9.setText("");
									 		
									 			player1= true;
									 			p1win = false;
									 			p2won = false;
									 			board.setVisible(true);
									 	
									 		}else {
									 			System.out.println("Goodbye! ");
									 			System.exit(0);
									 		}
									 	}
												 
						 		
		 	}
		 
	 }
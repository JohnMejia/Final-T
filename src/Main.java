import java.util.Scanner;

public class Main {
	
	public static  boolean playerTurn = true;
	public static  boolean playerWon = false;
	public static  boolean computerWon = false;
	public static  boolean playing = true;
	public static  Scanner scan = new Scanner(System.in);
	public static  boolean playAgain = false;
	
	//playerTurn - true
	// playerWne - false
	//computerWne - false
	
	
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
					 		playerWon =true;
					 		computerWon = false;
					 		System.out.println("Player won!");
					 		board.setVisible(false);
					 	}
				 	}
			 	}
			 	if(board.button1.getText().equals("X")){
				 	if(board.button5.getText().equals("X")){
					 	if(board.button9.getText().equals("X")){
						 		playerWon =true;
						 		computerWon = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button1.getText().equals("X")){
				 	if(board.button2.getText().equals("X")){
					 	if(board.button3.getText().equals("X")){
						 		playerWon =true;
						 		computerWon = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button3.getText().equals("X")){
				 	if(board.button5.getText().equals("X")){
					 	if(board.button7.getText().equals("X")){
						 		playerWon =true;
						 		computerWon = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button3.getText().equals("X")){
				 	if(board.button6.getText().equals("X")){
					 	if(board.button9.getText().equals("X")){
						 		playerWon =true;
						 		computerWon = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}
			 	if(board.button7.getText().equals("X")){
				 	if(board.button8.getText().equals("X")){
					 	if(board.button9.getText().equals("X")){
						 		playerWon =true;
						 		computerWon = false;
						 		System.out.println("Player won!");
						 	}
					 	}
				 	}if(board.button4.getText().equals("X")){
					 	if(board.button5.getText().equals("X")){
						 	if(board.button6.getText().equals("X")){
							 		playerWon =true;
							 		computerWon = false;
							 		System.out.println("Player won!");
							 	}
						 	}
					 	}if(board.button2.getText().equals("X")){
						 	if(board.button5.getText().equals("X")){
							 	if(board.button8.getText().equals("X")){
								 		playerWon =true;
								 		computerWon = false;
								 		System.out.println("Player won!");
								 	}
							 	}
						 	}
			 	
					 	// incepe cu O
						 	if(board.button1.getText().equals("O")){
							 	if(board.button4.getText().equals("O")){
								 	if(board.button7.getText().equals("O")){
									 		playerWon = false;
									 		computerWon = true;
									 		System.out.println("Player 2 won!");
									 	}
								 	}
							 	}
							 	if(board.button1.getText().equals("O")){
								 	if(board.button5.getText().equals("O")){
									 	if(board.button9.getText().equals("O")){
										 		playerWon =false;
										 		computerWon = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button1.getText().equals("O")){
								 	if(board.button2.getText().equals("O")){
									 	if(board.button3.getText().equals("O")){
										 		playerWon =false;
										 		computerWon = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button3.getText().equals("O")){
								 	if(board.button5.getText().equals("O")){
									 	if(board.button7.getText().equals("O")){
										 		playerWon =false;
										 		computerWon = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button3.getText().equals("O")){
								 	if(board.button6.getText().equals("O")){
									 	if(board.button9.getText().equals("O")){
										 		playerWon =false;
										 		computerWon = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}
							 	if(board.button7.getText().equals("O")){
								 	if(board.button8.getText().equals("O")){
									 	if(board.button9.getText().equals("O")){
										 		playerWon =false;
										 		computerWon = true;
										 		System.out.println("Player 2 won!");
										 	}
									 	}
								 	}if(board.button4.getText().equals("O")){
									 	if(board.button5.getText().equals("O")){
										 	if(board.button6.getText().equals("O")){
											 		playerWon =false;
											 		computerWon = true;
											 		System.out.println("Player 2 won!");
											 	}
										 	}
									 	}if(board.button2.getText().equals("O")){
										 	if(board.button5.getText().equals("O")){
											 	if(board.button8.getText().equals("O")){
												 		playerWon =false;
												 		computerWon = true;
												 		System.out.println("Player 2 won!");
												 	}
											 	}
										 	}
									 	if(playerWon == true || computerWon == true){
									 		
									 		System.out.println("Would you like to play again!? true or false");
									 		playAgain = scan.nextBoolean();
									 		if(playAgain == true ){
									 			board.setVisible(false);
									 			System.out.println("Player1 Won: " + playerWon);
									 			System.out.println("Player2 Won: " + computerWon);
									 			board.button1.setText("");
									 			board.button2.setText("");
									 			board.button3.setText("");
									 			board.button4.setText("");
									 			board.button5.setText("");
									 			board.button6.setText("");
									 			board.button7.setText("");
									 			board.button8.setText("");
									 			board.button9.setText("");
									 			//playerTurn - true
									 			// playerWne - false
									 			//computerWne - false
									 			
									 			playerTurn = true;
									 			playerWon = false;
									 			computerWon = false;
									 			board.setVisible(true);
									 	
									 		}else {
									 			System.out.println("Thanks for playing...! ");
									 			
									 		}
									 	}
												 
						 		
		 	}
		 
	 }
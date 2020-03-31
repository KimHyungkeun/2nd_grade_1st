package KnightTour;

import java.util.Scanner;
import java.util.Random;

public class KnightTour {
	private String[][] board; //board
	private int SIZE; //size of board
	private int[] x  = {1,1,2,2,-1,-1,-2,-2}; //x position
	private int[] y = {2,-2,1,-1,2,-2,1,-1}; //y position
	private int gamemode; //select gamemode
	private int count;//number of go
	String Knight;
	Random r = new Random();

	public KnightTour() {
		// TODO Auto-generated constructor stub
		board = new String[0][0];
		SIZE = 0;
		Knight = "&";
		count = 0;
		
	}
	
	public void InputSize()
	{
		int select;
		System.out.println("Welcome to Knight's Tour");
		System.out.println("Select Size");
		System.out.println("1.3X3\n2.5X5\n3.8X8");
		Scanner in = new Scanner(System.in);
		select = in.nextInt(); //select size
		
		switch(select)
		{
		case 1 :
			SIZE = 3; //Size is 3x3
			break;
		case 2 : 
			SIZE = 5; //Size is 5x5
			break;
		case 3 : 
			SIZE = 8; //Size is 8x8
			break;
		default :
			System.out.println("Try Again");
			InputSize(); //nothing else then input again
			break;
		}
		
		
			board = new String[SIZE][SIZE];
		
	}
	
	public void InputGameMode()
	{
		int select;
		System.out.println("Select GameMode");
		System.out.println("1.Computer\n2.User");
		Scanner in = new Scanner(System.in);
		select = in.nextInt();
		gamemode = select; //inputed gamemode
		
		if(gamemode == 1)
			ComputerMode(); //gamemode 1 is computermode
		
		else if(gamemode == 2)
			UserMode(); //gamemode 2 is usermode
		
		else{
			System.out.println("Try Again");
			InputGameMode(); //nothing else then, try again
		}
			
	}
	
	public void PrintStartBoard()
	{
		int x_start,y_start;
		
		for(int i=0;i<SIZE;++i)
			for(int j = 0;j<SIZE;++j)
				board[i][j] = "."; //First Board has '.' letter
		
		x_start = r.nextInt(SIZE); //random x position
		y_start = r.nextInt(SIZE); //random y position
		
		board[x_start][y_start] = Knight; //input Knight to random position
		
		for(int i=SIZE-1;i>=0;--i){
			for(int j = 0;j<SIZE;++j){
				System.out.print(" "+board[i][j]); //print board
			}
			System.out.println();
		}
		
	}
	
	public void ComputerMode() //Call ComputerMode (Only call when you select 2)
	{
		PrintStartBoard();
		System.out.println();
		WaySearch_Computer();
	}
	
	public void WaySearch_Computer() //Search way to be able to go
	{
	
		int i,j; //value for 'for' loop
		int x_pos=0,y_pos=0; //x:save i value, y:save j value
		int go_count;
		
		
		// Search Knight's position
		for(i=0;i<SIZE;++i)
		{
			for(j=0;j<SIZE;++j)
			{
				if(board[i][j] == Knight)
				{
					y_pos = i; //Knight's y position
					x_pos = j; //Knight's x position
					break;
				}
					
			}
			
		}
		
		//In Size 3x3, Center Position has no way to go
		if(SIZE == 3 && board[1][1] == Knight)
		{
			System.out.println("System End");
			return;
		}
		
			//Check the way
			go_count = AbleToGo(x_pos,y_pos);
		
		
		if(go_count == 0)
		{	
			//Print Board Result
			for(i=SIZE-1;i>=0;--i)
			{
				for(j=0;j<SIZE;++j)
				{
					System.out.print(" "+board[i][j]);
				}
				System.out.println();
			}
			
			//if SIZE is 3 and go_count is 7 then you win
			if(SIZE == 3 && count == SIZE*SIZE-2)
			{
			System.out.println("Total Count : "+(count));
			count = 0;
			return;
			}
			
			//if you didn't input full board, then lose
			else if(count != SIZE*SIZE-1)
			{
				System.out.println("Total Count : "+(count));
				count = 0;
				return;
			}
				
			//if you input full board, then you win
			else
			{
			System.out.println("Total Count : "+(count));
			count = 0;
			return;
			}
		}
		
		else //else recursive method
			WaySearch_Computer();
		
	}
	
	public int AbleToGo(int x_pos,int y_pos) //Search able to go, and return total go(Only Use at WaySearch_Computer())
	{
		int[] way = {9,9,9,9,9,9,9,9}; //moving case can't have 9 cases
		int[] x_save = new int [8]; //x_pos save
		int[] y_save = new int [8]; //y_pos save
		int index_amount=0; //supporter of selected index of number
		int x_amount=0; //index about x_save array
		int y_amount=0; //index about y_save array
		int go_case; //count go case
		int go_count=0; //count total go
		int x_tmp,y_tmp;//save x position, y position
		int verysmall=0; //find very small number of case
		
		for(int i=0;i<8;++i)
		{
			if((0 <= y_pos+y[i] && y_pos+y[i] < SIZE) && (0 <= x_pos+x[i] && x_pos+x[i] < SIZE))
			{
				if(board[y_pos+y[i]][x_pos+x[i]] == ".")
				{
					x_tmp=x_pos+x[i]; //x_tmp save changed position about x
					y_tmp=y_pos+y[i]; //y_tmp save changed position about y
					go_case = AbleToGoNext(x_tmp,y_tmp);
					way[index_amount] = go_case; //save total go_case
					index_amount++; //add index
					x_save[x_amount] = x_tmp; // x_save save x_tmp;
					y_save[y_amount] = y_tmp; // y_save save y_tmp;
					x_amount++; //add index
					y_amount++; //add index
					go_count++; //add index
				}
			}
		
		else
			continue;
		}
		
		for(int i=0;i<8;++i)
		{
			for(int j=0;j<8;++j)
			{
				if(way[i]<=way[j]) //if i'th arr value is very small
					verysmall++; //then add value of verysmall
			}
			
			if(verysmall == 8) //if you found very small number
			{
				board[y_pos][x_pos] = Integer.toString(count); //before position has number
				KnightMove(x_save[i],y_save[i]); //change Knight's position
				break;
			}
				
			else
			verysmall=0;
		}
		
		return go_count; //return total go_count
	}
	
	public void KnightMove(int x_move,int y_move)//(Only Use at WaySearch_Computer())
	{
		board[y_move][x_move] = Knight; //move Knight
		++count;
	}
	
	
	
	public int AbleToGoNext(int x_tmp,int y_tmp) //Finding GoNext Position(Only Use at WaySearch_Computer())
	{
		int go_case=0; //selected index of number
		
		for(int i=0;i<8;++i)
		{
			if((0 <= y_tmp+y[i] && y_tmp+y[i] < SIZE) && (0 <= x_tmp+x[i] && x_tmp+x[i] < SIZE))
			{
				if(board[y_tmp+y[i]][x_tmp+x[i]] == ".") //if Knight has a next case
				go_case++; //add go_case
			}
			
			else
				continue;
		}
		
		return go_case; //return total go case
	}
	
	
	
	public void UserMode()
	{
		PrintStartBoard(); //StartBoard
		WaySearch_User(); //Generate user mode
	}
	
	public void WaySearch_User()
	{
		int i,j; //value for 'for' loop
		int x_pos=0,y_pos=0; //x:save i value, y:save j value, count : number of go
		Scanner in = new Scanner(System.in);
		int select; //input number 
		int index_select=0; //selected index of number
		
		// Search Knight's position
		for(i=0;i<SIZE;++i)
		{
			for(j=0;j<SIZE;++j)
			{
				if(board[i][j] == Knight)
				{
					y_pos = i; //Knight's y position
					x_pos = j; //Knight's x position
					break;
				}
					
			}
			
		}
		
		//In Size 3x3, Center Position has no way to go
		if(SIZE == 3 && board[1][1] == Knight)
		{
			System.out.println("You Lose");
			return;
		}
		
		// Search the way which be able to go
		for(i=0;i<8;++i){
			if((0 <= x_pos + x[i] && x_pos + x[i] < SIZE) && (0 <= y_pos + y[i] && y_pos + y[i] < SIZE))
			{
				index_select++;
				if(board[y_pos + y[i]][x_pos + x[i]] != ".")
				{	index_select--;
					continue;
				}
				System.out.println(index_select+"."+"Move as"+"("+x[i]+","+y[i]+")");
			}
			
		}
		
		//if you have no choice, there is result
				if(index_select == 0)
				{	
					//if you didn't input full board, then lose
					if(SIZE == 3 && count == SIZE*SIZE-2)
					{
					System.out.println("You Win"+" /Total Count : "+(count));
					count = 0;
					return;
					}
					
					else if(count != SIZE*SIZE-1)
					{
						System.out.println("You Lose"+" /Total Count : "+(count));
						count = 0;
						return;
					}
						
					//if you input full board, then you win
					else
					{
					System.out.println("You Win"+" /Total Count : "+(count));
					count = 0;
					return;
					}
				}
				
		
		//Select which way you choose
		
			index_select = 0;
			select = in.nextInt();
			for(i=0;i<8;++i)
			{
				if((0 <= x_pos + x[i] && x_pos + x[i] < SIZE) && (0 <= y_pos + y[i] && y_pos + y[i] < SIZE))
				{
						index_select++;
					if(index_select == select)
					{
						//You can't go before you exist
						if(board[y_pos + y[i]][x_pos + x[i]] != ".")
						{	index_select--;
							continue;
						}
					
						else
						{
							//move Knight's position
							board[y_pos + y[i]][x_pos + x[i]] = Knight;
							board[y_pos][x_pos] = Integer.toString(++count);
							break;
						}
					}
				}
			}
		
	
		//Print Board Result
		for(i=SIZE-1;i>=0;--i)
		{
			for(j=0;j<SIZE;++j)
			{
				System.out.print(" "+board[i][j]);
			}
			System.out.println();
		}
		
		
		//input again user's command
		WaySearch_User();
		
		
	}
}
	
	
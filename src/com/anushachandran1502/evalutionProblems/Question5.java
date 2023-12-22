package com.anushachandran1502.evalutionProblems;



public class Question5 {
	public static void main(String[] args) {
		Question5 question5=new Question5();
		int n=9;
		//int[][] sudoku=new int[9][9];
		int[][] sudoku= {{0,0,1,7,0,2,9,0,0},{8,7,0,0,0,0,0,4,2},{0,0,0,0,4,0,0,0,0},{6,0,0,0,5,0,7,0,9},{7,0,0,0,1,0,0,0,3},{4,0,2,0,8,0,0,0,1},{0,0,0,0,6,0,0,0,0},
				{2,3,0,0,0,0,0,1,6},{0,0,4,5,0,3,8,0,0}};
		question5.sudokuPuzzleFill(sudoku);
	}

	private void sudokuPuzzleFill(int[][] sudoku) {
		// TODO Auto-generated method stub
		for(int i=0;i<sudoku.length;i++)
		{ int num=1;
			for(int j=0;j<sudoku.length;j++)
			{
				if(sudoku[i][j]==0)
				{
					for(int k=0;k<sudoku.length;i++)
					{
						
					}
				}
			}
		}
	}
}

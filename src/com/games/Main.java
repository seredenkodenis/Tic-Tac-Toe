package com.games;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Board board = new Board();
        board.startGame();
        board.drawBoard();
        int cnt = 1;
        char right = ' ';
        while (board.cheackWin() == false){
            if(cnt%2 == 0){
                right = 'O';
                System.out.println("Select your choose | " + "Move of: O" );
            }else{
                right = 'X';
                System.out.println("Select your choose | " + "Move of: X" );
            }
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (board.busy(a) == false){
                board.setForm(a,right);
            }else{
                System.out.println("Insert right number!");
                --cnt;
            }
            board.drawBoard();
            ++cnt;
        }
    }
}

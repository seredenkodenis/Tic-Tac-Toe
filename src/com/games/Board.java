package com.games;

public class Board {
    private char[][] board = new char[3][3];

    public void startGame(){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
        System.out.println("WELCOME TO TIC-TAC-TOE!");
        System.out.println("Version: 0.0.1");
        System.out.println("Author: Denis Seredenko");
    }

    public void drawBoard(){
        int cnt = 0;
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                System.out.print("| " + board[i][j] + " | ");
                if( (cnt == 2) || (cnt == 5) ){
                    System.out.println();
                    System.out.println();
                }
                ++cnt;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public boolean busy(int a){
        if (a == 1){
            if (board[0][0] == ' ') {
                return false;
            }
        }
        if (a == 2){
            if (board[0][1] == ' ') {
                return false;
            }
        }
        if (a == 3){
            if (board[0][2] == ' ') {
                return false;
            }
        }
        if (a == 4){
            if (board[1][0] == ' ') {
                return false;
            }
        }
        if (a == 5){
            if (board[1][1] == ' ') {
                return false;
            }
        }
        if (a == 6){
            if (board[1][2] == ' ') {
                return false;
            }
        }
        if (a == 7){
            if (board[2][0] == ' ') {
                return false;
            }
        }
        if (a == 8){
            if (board[2][1] == ' ') {
                return false;
            }
        }
        if (a == 9){
            if (board[2][2] == ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean cheackWin(){
        // Проверить для 1 4 7, 2 5 8, 3 6 9
        if( (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') || ( board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' )
                || (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') ){
            System.out.println("X wins");
            System.out.println("GAME OVER");
            return true;
        }
        if( (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') || (board[1][0] =='O' && board[1][1] == 'O' && board[1][2] == 'O') || ( board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' )
                || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') || (board[0][2] == 'O'&& board[1][1] == 'O' && board[2][0] == 'O') ){
            System.out.println("O wins");
            System.out.println("GAME OVER");
            return true;
        }
        return false;
    }

    public Board(){}

    public Board(char[][] board) {
        this.board = board;
    }

    public char getForm(int i, int j){
        return board[i][j];
    }

    public void setForm(int a, char dec){
        if (a == 1){
            board[0][0] = dec;
        }
        if (a == 2){
            board[0][1] = dec;
        }
        if (a == 3){
            board[0][2] = dec;
        }
        if (a == 4){
            board[1][0] = dec;
        }
        if (a == 5){
            board[1][1] = dec;
        }
        if (a == 6){
            board[1][2] = dec;
        }
        if (a == 7){
            board[2][0] = dec;
        }
        if (a == 8){
            board[2][1] = dec;
        }
        if (a == 9){
            board[2][2] = dec;
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
}

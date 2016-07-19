package com.emedinaa.solid.srp;

/**
 * Created by emedinaa on 18/07/16.
 */
public class BrowserBoardPresenter implements BoardPresenter {
    private final BoardState boardState;

    public BrowserBoardPresenter(BoardState boardState) {
        this.boardState = boardState;
    }

    @Override
    public NBoard displayBoard() {
        System.out.println("BrowserBoardPresenter displayBoard ");
        return new NBoard();
    }
}

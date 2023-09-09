package com.example.prueba.Models;

public class SopaResponse extends SopaRequest{
    private boolean contains;
    private int start_row;
    private int start_col;

    public boolean isContains() {
        return contains;
    }

    public void setContains(boolean contains) {
        this.contains = contains;
    }

    public int getStart_row() {
        return start_row;
    }

    public void setStart_row(int start_row) {
        this.start_row = start_row;
    }

    public int getStart_col() {
        return start_col;
    }

    public void setStart_col(int start_col) {
        this.start_col = start_col;
    }
}

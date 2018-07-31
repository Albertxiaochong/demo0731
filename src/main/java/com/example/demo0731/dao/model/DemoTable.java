package com.example.demo0731.dao.model;

import javax.persistence.*;

@Table(name = "demo_table")
public class DemoTable {
    private String col1;

    /**
     * @return col1
     */
    public String getCol1() {
        return col1;
    }

    /**
     * @param col1
     */
    public void setCol1(String col1) {
        this.col1 = col1 == null ? null : col1.trim();
    }
}
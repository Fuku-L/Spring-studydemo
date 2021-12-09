package com.wisely.highlight_spring4.ch3.condition;

public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "ls";
    }
}

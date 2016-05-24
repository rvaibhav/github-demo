package com.practice.javapractice.problems;

/**
 * Created by vaibhavr on 30/03/16.
 */
public class ParenthesisMatch {

    private static int noOfParenthesis = 0;

    private static StringBuilder str = new StringBuilder();

    public static void main(String[] args){
        ParenthesisMatch obj = new ParenthesisMatch();
        noOfParenthesis = 3;
        obj.createPnC(0,3,0,0);
    }


    public void createPnC(int pos, int count, int open, int close){
        if(close == count){
            System.out.println(str.toString());
            return;
        }else {
            int i = 0;
            if (open > close) {
                str.append(")");
                createPnC(pos + 1, count, open, close + 1);
            }
            if(open < count){
                str.append("(");
                createPnC(pos + 1, count, open + 1, close);
            }
        }
    }

}

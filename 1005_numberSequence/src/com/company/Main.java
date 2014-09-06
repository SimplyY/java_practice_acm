package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List fns = new ArrayList();
        while (input.hasNextLine()){
            String line = input.nextLine();
            int[] ABn = dealLine(line);
            if(ABn[0] == 0 && ABn[1] == 0 && ABn[2] == 0){
                break;
            }
            int fn = get_fn(ABn[0],ABn[1],ABn[2]);
            fns.add(fn);
        }
        for (int i = 0; i < fns.size(); i++) {
            System.out.println(fns.get(i));
        }
    }

    static int[] dealLine(String line){
        int[] ABn = new int[3];
        for (int i = 0; i < 3; i++) {
            ABn[i] =Integer.parseInt(line.split(" ")[i]);
        }
        return ABn;
    }

    static int get_fn(int A,int B,int n)
    {
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;
        }
        else{
            int fn = (A*get_fn(A,B,n-1) + B*get_fn(A,B,n-2))%7;
            return fn;
        }
    }
}

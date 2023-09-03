package org.example.baekjun.stack;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 스택
// https://www.acmicpc.net/problem/10828
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> stack = new LinkedList<>();


        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = -1;

            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            if(command.equals("push")) {
                stack.addLast(num);
            }
            if(command.equals("top")) {
                if(stack.isEmpty()) bw.write("-1\n");
                else bw.write(stack.getLast() + "\n");
            }
            if(command.equals("empty")) {
                if(stack.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            if(command.equals("size")) bw.write(stack.size() + "\n");
            if(command.equals("pop")) {
                if(stack.isEmpty()) bw.write("-1\n");
                else bw.write(stack.pollLast() + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

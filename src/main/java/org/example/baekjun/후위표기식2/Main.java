package org.example.baekjun.후위표기식2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 후위표기식2
// https://www.acmicpc.net/problem/1935

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] expr = br.readLine().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Stack<Double> operand = new Stack<>();

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            map.put(Character.valueOf((char) (i + 65)), num);
        }

        for(char ch : expr) {
            if(ch >= 'A' && ch <= 'Z') {
                operand.push(Double.valueOf(map.get(ch)));
            }
            else {
                double operand2 = operand.pop();
                double operand1 = operand.pop();

                if(ch == '*') {
                    double result = operand1 * operand2;
                    operand.push(result);
                } else if (ch == '/') {
                    double result = operand1 / operand2;
                    operand.push(result);
                } else if (ch == '+') {
                    double result = operand1 + operand2;
                    operand.push(result);
                } else if (ch == '-') {
                    double result = operand1 - operand2;
                    operand.push(result);
                }
            }
        }
        String str = String.format("%.2f", operand.pop());
        bw.write(str + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}

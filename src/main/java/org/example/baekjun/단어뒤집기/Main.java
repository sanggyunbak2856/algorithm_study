package org.example.baekjun.단어뒤집기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                String str = st.nextToken();

                char[] chars = str.toCharArray();
                for(int j = chars.length - 1; j >= 0; j--) {
                    bw.write(chars[j]);
                }
                bw.write(" ");
            }
            bw.write("\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}

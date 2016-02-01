package com.javarush.test.level19.lesson10.home05;

/* ����� � �������
� ����� main ������ ���������� �������� ��� �����1, ������ - �����2.
����1 �������� �����, ����������� ��������.
�������� ����� ������ � ����2 ��� �����, ������� �������� �����, ��������, �1 ��� abc3d
������� ������
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        boolean first= true;
        while (br.ready()) {
            String[] s = br.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].length(); j++) {
                    if (Character.isDigit(s[i].charAt(j)))
                        if (first) {
                            bw.write(s[i]);
                            first = false;
                            break;
                        } else {
                            bw.write(" " + s[i]);
                            break;
                        }
                }
            }
        }

        br.close();
        bw.close();

    }
}

package com.javarush.test.level19.lesson10.home07;

/* ������� �����
� ����� main ������ ���������� �������� ��� �����1, ������ - �����2
����1 �������� �����, ����������� ��������.
�������� ����� ������� � ����2 �����, ����� ������� ������ ������ 6
������� ������

������ �������� ������:
�������,��������,������������
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        boolean isFirst = true;
        while (br.ready()) {
            String[] s = br.readLine().split(" ");

            for (int i = 0; i < s.length; i++) {
                if (s[i].length() > 6) {
                    if (isFirst) {
                        bw.write(s[i]);
                        isFirst = false;
                    } else {
                        bw.write("," + s[i]);
                    }
                }
            }

        }

        br.close();
        bw.close();

    }
}

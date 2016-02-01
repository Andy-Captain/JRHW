package com.javarush.test.level14.lesson08.bonus03;

public class Singleton
{
    private static final Singleton instance = new Singleton();

    // ����������� private, ����� �� ���� ����������� ������� ��������� ������ �����.
    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        return instance;
    }
}

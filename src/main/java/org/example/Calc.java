package org.example;

public class Calc {

    public int add(int x, int y)
    {
        return x + y; // 加法逻辑正确，保持不变
    }

    public int subtract(int x, int y)
    {
        return x - y; // 修正为减法运算，返回x减去y的结果
    }
}

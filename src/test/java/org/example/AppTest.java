package com.texteditor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.Calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }

    public void testSubtraction() {
        // 假设存在一个 Calc 类，其中有 subtract 方法用于减法运算
        Calc calculator = new Calc();

        // 测试用例：4 - 2 应该等于 2
        int result = calculator.subtract(4, 2);
        assertEquals("4 - 2 计算错误", 2, result);

        // 可以添加更多测试用例
        result = calculator.subtract(10, 5);
        assertEquals("10 - 5 计算错误", 5, result);
    }
}

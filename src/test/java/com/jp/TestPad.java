package com.jp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jp.utils.Utils;

@SpringBootTest
public class TestPad {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        Utils.sayHello();
    }

}

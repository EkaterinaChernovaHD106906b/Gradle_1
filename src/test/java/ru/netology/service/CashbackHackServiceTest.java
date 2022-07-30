package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void myTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }


    @Test
    void myTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void myTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

}



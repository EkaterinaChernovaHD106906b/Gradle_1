package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.junit.Test
   public void myTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }


    @org.junit.Test
   public void myTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
   public void myTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

}



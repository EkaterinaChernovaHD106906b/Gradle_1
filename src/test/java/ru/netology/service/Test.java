package ru.netology.service;
import org.junit.Assert;
import ru.netology.service.CashbackHackService;

public class Test {
    @org.junit.Test
    void myTest(){
        CashbackHackService service = new CashbackHackService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    void myTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
       Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    void myTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

}


}

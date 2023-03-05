package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SQRServiceTest {
    @Test
    public void calcTestWhenFewNumbersFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void calcTestWhenOneNumberFinded() {
            SQRService service = new SQRService();

            int actual = service.calc(50, 100);
            int expected = 1;

            Assertions.assertEquals(expected, actual);
        }
    @Test
    public void calcTestWhenNumberNotFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(50, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }



        }
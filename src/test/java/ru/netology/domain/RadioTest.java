package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testSt1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSt2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSt3() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testSt11() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testSt22() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testSt33() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);

    }




    @Test
    public void testVol1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testVol2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testVol555() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public void testVol11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVol22() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVol33() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSt55() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSt66() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVol55() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVol66() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}
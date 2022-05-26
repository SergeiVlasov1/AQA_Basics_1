package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceJUnitJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIs1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs1500() {
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000IfAmountIsZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsLessBoundary() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsMoreBoundary() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsLessZero() {
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(expected, actual);
    }
}
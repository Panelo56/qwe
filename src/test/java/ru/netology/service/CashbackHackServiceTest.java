package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

 CashbackHackService service = new CashbackHackService();

 @Test
 public void calculateCashback() {
  int amount = 900;

  int expected = 100;
  int actual = service.remain(amount);

  assertEquals(actual, expected);
 }

 @Test
 public void downСalculateCashback() {
  int amount = 999;

  int expected = 1;
  int actual = service.remain(amount);

  assertEquals(actual, expected);
 }

 @Test
 public void upCalculateCashback() {
  int amount = 1001;

  int expected = 999;
  int actual = service.remain(amount);

  assertEquals(actual, expected);
 }
}
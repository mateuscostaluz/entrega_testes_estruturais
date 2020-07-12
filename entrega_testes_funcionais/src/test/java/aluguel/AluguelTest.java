package aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import aluguel.Aluguel;

public class AluguelTest {

  double valorNominal = 1000.0;

  @Test
  public void test_dia_menor_que_0_MCL() {
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(-1, valorNominal);
    assertEquals(-1, result);
  }

  @Test
  public void test_dia_0_MCL() {
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(0, valorNominal);
    assertEquals(-1, result);
  }

  @Test
  public void test_dia_1_MCL () {
	  double valorDesconto = valorNominal * 0.1;
	  double valorAluguel = valorNominal - valorDesconto;
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(1, valorNominal);
    assertEquals(valorAluguel, result);
  }

  @Test
  public void test_dia_5_MCL () {
	  double valorDesconto = valorNominal * 0.1;
	  double valorAluguel = valorNominal - valorDesconto;
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(5, valorNominal);
    assertEquals(valorAluguel, result);
  }

  @Test
  public void test_dia_6_MCL () {
	  double valorDesconto = valorNominal * 0.05;
	  double valorAluguel = valorNominal - valorDesconto;
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(6, valorNominal);
    assertEquals(valorAluguel, result);
  }

  @Test
  public void test_dia_10_MCL () {
	  double valorDesconto = valorNominal * 0.05;
	  double valorAluguel = valorNominal - valorDesconto;
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(10, valorNominal);
    assertEquals(valorAluguel, result);
  }

  @Test
  public void test_dia_11_MCL () {
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(11, valorNominal);
    assertEquals(valorNominal, result);
  }

  @Test
  public void test_dia_15_MCL () {
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(15, valorNominal);
    assertEquals(valorNominal, result);
  }

  @Test
  public void test_dia_16_MCL () {
	  double valorMulta = valorNominal * 0.02;
	  double valorMultaDia = valorNominal * 0.001;
	  double valorAluguel = valorNominal + valorMulta + valorMultaDia;
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(16, valorNominal);
    assertEquals(valorAluguel, result);
  }

  @Test
  public void test_dia_30_MCL () {
	  double valorMulta = valorNominal * 0.02;
	  double valorMultaDia = valorNominal * 0.015;
	  double valorAluguel = valorNominal + valorMulta + valorMultaDia;
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(30, valorNominal);
    assertEquals(valorAluguel, result);
  }

  @Test
  public void test_dia_maior_que_30_MCL () {
    Aluguel aluguel = new Aluguel();
    double result = aluguel.insertProject(31, valorNominal);
    assertEquals(-1, result);
  }
}

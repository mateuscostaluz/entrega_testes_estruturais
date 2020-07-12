package aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import aluguel.Aluguel;

public class AluguelParameterizedTest {

  Aluguel aluguel = new Aluguel();
  double valorNominal = 1000.0;

  @ParameterizedTest
  @CsvSource(value = {
    "0:-1",
  	"1:900",
  	"2:900",
  	"4:900",
  	"5:900",
  	"6:950",
  	"9:950",
  	"10:950",
  	"11:1000",
  	"14:1000",
  	"15:1000",
  	"16:1021",
  	"29:1034",
  	"30:1035",
    "31:-1"
  }, delimiter = ':')
  public void test_CsvSource_MCL(int day, double valor) {
    double result = aluguel.insertProject(day, valorNominal);
    assertEquals(result, valor, 0.01);
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/valores_teste.csv", delimiter = ',')
  public void test_CsvFileSource_MCL(int day, double valor) {
    double result = aluguel.insertProject(day, valorNominal);
    assertEquals(result, valor, 0.01);
  }
}

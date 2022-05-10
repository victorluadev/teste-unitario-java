package org.victor;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomar2NumerosTest() {
        float num1 = 5, num2 = 55;

        float result = calculadora.soma(num1,num2);

        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void deveSubtrair2NumerosTest() {
        float num1 = 30, num2 = 14.5f;

        float result = calculadora.subtracao(num1,num2);

        Assertions.assertThat(result).isEqualTo(15.5f);
    }

    @Test
    public void deveMultiplicar2NumerosTest() {
        float num1 = 40, num2 = 2.5f;

        float result = calculadora.multiplicacao(num1, num2);

        Assertions.assertThat(result).isEqualTo(100);
    }

    @Test
    public void deveDividir2NumerosTest() {
        float num1 = 250, num2 = 2;

        float result = calculadora.divisao(num1, num2);

        Assertions.assertThat(result).isEqualTo(125);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveDividirPorZeroTest() {
        float num1 = 250, num2 = 0;

        calculadora.divisao(num1, num2);
    }
}

package ar.edu.unlp.info.oo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaHeterogeneaTest {
    private Agua agua;
    private Tierra tierra;

    @BeforeEach
    public void setUp() {
        this.agua = new Agua();
        this.tierra = new Tierra();
    }

    @Test
    public void calcularProporcionTest() {
        TopografiaHeterogenea heterogenea = new TopografiaHeterogenea(this.agua, this.tierra, this.agua, this.tierra);
        Assertions.assertEquals(0.5, heterogenea.calcularProporcion());
    }

    @Test
    public void calcularProporcionTestConTopografiasInternasMixtas() {
        TopografiaHeterogenea heterogeneaInterna = new TopografiaHeterogenea(this.agua, this.tierra, this.agua, this.tierra);
        TopografiaHeterogenea heterogenea = new TopografiaHeterogenea(this.agua, this.tierra, this.tierra, heterogeneaInterna);

        Assertions.assertEquals(0.375, heterogenea.calcularProporcion());
    }

    @Test
    public void equalsTest() {
        TopografiaHeterogenea heterogenea = new TopografiaHeterogenea(this.agua, this.tierra, this.agua, this.tierra);
        TopografiaHeterogenea heterogeneaInvertida = new TopografiaHeterogenea(this.tierra, this.agua, this.tierra, this.agua);
        TopografiaHeterogenea heterogeneaReplica = new TopografiaHeterogenea(this.agua, this.tierra, this.agua, this.tierra);

        Assertions.assertTrue(heterogenea.equals(heterogeneaReplica));
        Assertions.assertFalse(heterogenea.equals(heterogeneaInvertida));
    }

    @Test
    public void equalsTestConTopografiasInternasMixtas() {
        TopografiaHeterogenea heterogeneaInterna = new TopografiaHeterogenea(this.agua, this.tierra, this.agua, this.tierra);
        TopografiaHeterogenea heterogenea = new TopografiaHeterogenea(this.agua, this.tierra, this.tierra, heterogeneaInterna);
        TopografiaHeterogenea heterogeneaInvertida = new TopografiaHeterogenea(this.tierra, this.agua, this.agua, heterogeneaInterna);
        TopografiaHeterogenea heterogeneaReplica = new TopografiaHeterogenea(this.agua, this.tierra, this.tierra, heterogeneaInterna);

        Assertions.assertTrue(heterogenea.equals(heterogeneaReplica));
        Assertions.assertFalse(heterogenea.equals(heterogeneaInvertida));
    }
}

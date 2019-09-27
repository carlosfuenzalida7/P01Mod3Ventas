package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColeccionVentasTest {

    public ColeccionVentasTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> expResult = new ArrayList<>();
        ArrayList<Venta> result = instance.Listar();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("PRD01", 100, 50);
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = true;
        boolean result = instance.Agregar(venta);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("PRD01", 100, 50);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        venta = new Venta("PRD01", 100, 30);
        boolean result = instance.Modificar(venta);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "PRD01";
        Venta venta = new Venta("PRD01", 150, 50);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        boolean result = instance.Eliminar(codigo);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void TestsubTotal() {
        System.out.println("Subtotal");
        Venta venta = new Venta("PRD01", 5, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        Assert.assertEquals(instance.Calcular("PRD01"), instance.subTotal(5,3));
    }

}

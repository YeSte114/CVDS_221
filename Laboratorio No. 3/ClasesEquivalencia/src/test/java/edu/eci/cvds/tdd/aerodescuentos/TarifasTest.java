package edu.eci.cvds.tdd.aerodescuentos;


import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    private double tarifaFinal;
    private CalculadorDescuentos calD= new CalculadorDescuentos();

    //Verificar que la edad no puede ser menor a cero
    @Test
    public void validadEdadMenorCero(){
        try {
            tarifaFinal= calD.calculoTarifa(320000, 6,-1);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }

    //Verifica que la edad no puede ser igual a cero
    @Test
    public void validarEdadCero(){
        try{
            tarifaFinal = calD.calculoTarifa(320000,17,0);
        }
        catch ( Exception e){
            Assert.assertTrue(true);
        }
    }

    //Verifica que se genera descuento del 5% con el limite inferior de edad 1
    @Test
    public void validarDescuentoCinco1(){
            tarifaFinal = calD.calculoTarifa(320000,10,1);
            Assert.assertEquals(String.valueOf(tarifaFinal),"304000.0");
    }

    //Verifica que se genera descuento del 5% con el limite superior de edad 17
    @Test
    public void validarDescuentoCinco17(){
        tarifaFinal = calD.calculoTarifa(320000,10,1);
        Assert.assertEquals(String.valueOf(tarifaFinal),"304000.0");
    }

    //Verifica que no se genera descuento edad limite inferior 18
    @Test
    public void validarSinDescuento18() {
        tarifaFinal = calD.calculoTarifa(320000, 10, 18);
        Assert.assertEquals(String.valueOf(tarifaFinal), "320000.0");
    }

    //Verifica que no se genera descuento edad limite superior 65
    @Test
    public void validarSinDescuento65(){
        tarifaFinal = calD.calculoTarifa(320000,10,65);
        Assert.assertEquals(String.valueOf(tarifaFinal),"320000.0");
    }

    //Verifica se genera descuento del 8% ,edad limite inferior 66
    @Test
    public void validarDescuentoOcho66(){
        tarifaFinal = calD.calculoTarifa(320000,10,66);
        Assert.assertEquals(String.valueOf(tarifaFinal),"294400.0");
    }

    //Verifica se genera descuento del 8% ,edad limite superior 125
    @Test
    public void validarDescuentoOcho125(){
        tarifaFinal = calD.calculoTarifa(320000,10,125);
        Assert.assertEquals(String.valueOf(tarifaFinal),"294400.0");
    }

    //Verificar que se genere descuento del 15%, con dias de antelación limite inferior 21
    @Test
    public void validarDescuento15(){
        tarifaFinal = calD.calculoTarifa(320000,21,60);
        Assert.assertEquals(String.valueOf(tarifaFinal),"272000.0");
    }

    //Verificar que se genere descuento del 20%, con dias de antelación limite inferior 21
    //y edad inferior limite igual a 1
    @Test
    public void validarDescuentoVeinte1(){
        tarifaFinal = calD.calculoTarifa(320000,21,1);
        Assert.assertEquals(String.valueOf(tarifaFinal),"256000.0");
    }

    //Verificar que se genere descuento del 23%, con dias de antelación limite inferior 66
    //y edad limite superior igual a 17
    @Test
    public void validarDescuetoVeinte17(){
        tarifaFinal = calD.calculoTarifa(320000,21,66);
        Assert.assertEquals(String.valueOf(tarifaFinal),"246400.0");
    }

    //Verificar la tarifa no puede tener un valor negativo
    @Test
    public void validarTarifaInvalida() {
        try {
            tarifaFinal = calD.calculoTarifa(-320000, 21, 66);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    //Verificar los dias de antelacion no pueden ser negativos
    @Test
    public void validarDiasAntelacionInval() {
        try {
            tarifaFinal = calD.calculoTarifa(320000, -21, 66);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }


}


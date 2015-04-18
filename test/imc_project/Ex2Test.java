/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41321863
 */
public class Ex2Test {
    Ex2 eng;
    
    public Ex2Test() {
        eng = new Ex2();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalculoIMC() 
    {
        double peso = 90.0;
        double altura = 190.0;
        double imc = peso/(altura*altura);
        assertEquals(imc, eng.calculoIMC(peso, altura), 0);
    }  
    
    @Test
    public void testGeraMensagensAbaixoDoPeso() 
    {    
        
        double imc = 18.4;
        assertEquals("Message is not equal", "Você está abaixo do peso recomendado", eng.geraMensagem(imc));
        
        imc = 10.0;
        assertEquals("Message is not equal", "Você está abaixo do peso recomendado", eng.geraMensagem(imc));
    }
    
    @Test
    public void testGeraMensagensPesoNormal() 
    {    
        
        double imc = 18.6;
        assertEquals("Message is not equal", "Você está muito bem! Continue assim!", eng.geraMensagem(imc));
        
        imc = 24.9;
        assertEquals("Message is not equal", "Você está muito bem! Continue assim!", eng.geraMensagem(imc));
        
        imc = 21.0;
        assertEquals("Message is not equal", "Você está muito bem! Continue assim!", eng.geraMensagem(imc));
    }
    
    @Test
    public void testGeraMensagensAcimaPeso() 
    {    
        
        double imc = 25;
        assertEquals("Message is not equal", "Você está acima do peso recomendado. Cuidado!", eng.geraMensagem(imc));
        
        imc = 29.9;
        assertEquals("Message is not equal", "Você está acima do peso recomendado. Cuidado!", eng.geraMensagem(imc));
        
        imc = 27.5;
        assertEquals("Message is not equal", "Você está acima do peso recomendado. Cuidado!", eng.geraMensagem(imc));
    }
    
    @Test
    public void testGeraMensagensObeso() 
    {    
        
        double imc = 30.0;
        assertEquals("Message is not equal", "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!", eng.geraMensagem(imc));
        
        imc = 40;
        assertEquals("Message is not equal", "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!", eng.geraMensagem(imc));
    }
}

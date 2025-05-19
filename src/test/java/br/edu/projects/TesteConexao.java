/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.projects;

import controller.PersistenciaJPA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joao Sertoli
 */
public class TesteConexao {
    private PersistenciaJPA jpa;
    
    public TesteConexao() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            jpa = new PersistenciaJPA();
            System.out.println("Iniciando teste de conexão...");
    }

    @After
    public void tearDown() {
            if (jpa != null && jpa.conexaoAberta()) {
                    jpa.fecharConexao();
                    System.out.println("Conexão fechada com sucesso.");
            }
    }

    @Test
    public void testeConexaoAberta() {
            assertNotNull("Instância JPA não pode ser nula", jpa);
            assertTrue("A conexão deveria estar aberta", jpa.conexaoAberta());
            System.out.println("Conexão aberta com sucesso!");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtestsunitaires;

import devoirtestsunitaires.Condition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbuffeteau
 */
public class ConditionTest {
    
    public ConditionTest() {
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

    /**
     * Test of Valider method, of class Condition.
     */
    @Test
    public void testValider() {
        
        // Test 1 = le nombre de jours ne dépasse pas 30 jours

        
        // Test 2 = le nombre de jours dépasse 30 jours

    }

    /**
     * Test of CalculerMontantMaxCategorie method, of class Condition.
     */
    @Test
    public void testCalculerMontantMaxCategorie() {
        
        // Test 1 = Pour la catégorie Livre

        
        // Test 2 = Pour la catégorie Jouet

        
        // Test 3 = Pour la catégorie Informatique

    }

    /**
     * Test of CalculerMontantRembourse method, of class Condition.
     */
    @Test
    public void testCalculerMontantRembourse() {
        
        // Test 1 = nbJours = 20 ; Catégorie = Livre ; Etat = Abimé ; Membre = true ; Prix = 50

        
        
        // Test 2 = nbJours = 15 ; Catégorie = Livre ; Etat = Très abimé ; Membre = false ; Prix = 24


        // Test 3 = nbJours = 15 ; Catégorie = Livre ; Etat = Neuf ; Membre = true ; Prix = 24

    }

    /**
     * Test of CalculerReductionMembre method, of class Condition.
     */
    @Test
    public void testCalculerReductionMembre() {
        
        // Test 1 = Je ne suis pas membre

        
        // Test 2 = Je suis membre


    }

    /**
     * Test of CalculerReductionEtat method, of class Condition.
     */
    @Test
    public void testCalculerReductionEtat() {
        
        // Test 1 = Pour un état Abimé

        
        // Test 2 = Pour un état Très abimé

        
        // Test 3 = Pour un état Neuf

    }
}

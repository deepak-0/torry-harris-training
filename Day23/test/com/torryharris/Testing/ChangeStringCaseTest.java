package com.torryharris.Testing;

import javafx.scene.control.TextFormatter;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChangeStringCaseTest extends TestCase {

    ChangeStringCase strCase;


    @Before
    public void setUp() throws Exception{
        System.out.println("before Testing");
        strCase = new ChangeStringCase();
    }

     @After
     public void tearDown() throws Exception{
         System.out.println("After Testing");
     }

     @Test
    public void testToCapLetter() {
         Assert.assertEquals("ABCD", strCase.toCapLetter("abcd"));
    }

    public void testToSmallLetter() {
         Assert.assertEquals("abcd",strCase.toSmallLetter("ABCD"));
    }
}
package org.simpleapp.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void testHelloWorld() throws Exception {
        HomeController homeController = new HomeController();
        assertEquals("Hello world", homeController.home());
    }
}
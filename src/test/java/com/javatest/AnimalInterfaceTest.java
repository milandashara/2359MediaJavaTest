package com.javatest;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalInterfaceTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;

    @BeforeAll
    static void initAll() {

    }

    @AfterAll
    static void tearDownAll() {

    }

    @BeforeEach
    void init() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    void singingTest() {
        BirdInterface bird = new Bird();
        bird.sing();
        assertTrue(outContent.toString().contains("I am singing\n"));
    }

    @Test
    void flyingTest() {
        System.out.print('\f');
        BirdInterface bird = new Bird();
        bird.fly();
        assertTrue(outContent.toString().contains("I am flying\n"));
    }

    @Test
    void walkingTest() {
        BirdInterface bird = new Bird();
        bird.walk();
        assertTrue(outContent.toString().contains("I am walking\n"));
    }

    @Test
    void duckTest() {
        BirdInterface duck = new Duck();
        duck.sing();
        assertTrue(outContent.toString().contains("Quack, quack\n"));
    }

    @Test
    void chickenTest() {
        BirdInterface bird = new Chicken();
        bird.sing();
        assertTrue(outContent.toString().contains("Cluck, cluck\n"));
    }

    @Test
    void roosterTest() {
        BirdInterface bird = new Chicken(ChickenType.ROOSTER);
        bird.sing();
        assertTrue(outContent.toString().contains("Cluck, cluck\n"));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}

package com.javatest;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    void swimBirdTest() {
        BirdInterface bird = new Bird();
        try {
            bird.swim();
        }catch (UnsupportedOperationException e){
            assertEquals("Bird cannot swim",e.getMessage());
        }
    }

    @Test
    void walkFishTest() {
        FishInterface fish = new Fish();
        try {
            fish.walk();
        }catch (UnsupportedOperationException e){
            assertEquals("Fish cannot walk",e.getMessage());
        }
    }

    @Test
    void singFishTest() {
        FishInterface fish = new Fish();
        try {
            fish.sing();
        }catch (UnsupportedOperationException e){
            assertEquals("Fish cannot sing",e.getMessage());
        }
    }

    @Test
    void flyFishTest() {
        FishInterface fish = new Fish();
        try {
            fish.fly();
        }catch (UnsupportedOperationException e){
            assertEquals("Fish cannot fly",e.getMessage());
        }
    }

    @Test
    void flyDolphineTest() {
        AnimalInterface dolphine = new Dolphine();
        try {
            dolphine.fly();
        }catch (UnsupportedOperationException e){
            assertEquals("Dolphine cannot fly",e.getMessage());
        }
    }

    @Test
    void walkDolphineTest() {
        AnimalInterface dolphine = new Dolphine();
        try {
            dolphine.walk();
        }catch (UnsupportedOperationException e){
            assertEquals("Dolphine cannot walk",e.getMessage());
        }
    }


    @Test
    void singDolphineTest() {
        AnimalInterface dolphine = new Dolphine();
        try {
            dolphine.sing();
        }catch (UnsupportedOperationException e){
            assertEquals("Dolphine cannot sing",e.getMessage());
        }
    }

    @Test
    void singButterflyTest() {
        ButterflyInterface butterFly = new ButterFly();
        try {
            butterFly.sing();
        }catch (UnsupportedOperationException e){
            assertEquals("ButterFly cannot sing",e.getMessage());
        }
    }


    @Test
    void walkButterflyTest() {
        ButterflyInterface butterFly = new ButterFly();
        try {
            butterFly.walk();
        }catch (UnsupportedOperationException e){
            assertEquals("ButterFly cannot walk",e.getMessage());
        }
    }

    @Test
    void swimButterflyTest() {
        ButterflyInterface butterFly = new ButterFly();
        try {
            butterFly.swim();
        }catch (UnsupportedOperationException e){
            assertEquals("ButterFly cannot swim",e.getMessage());
        }
    }

    @Test
    void swimCaterpillarTest() {
        CaterpillarInterface caterpillar = new Caterpillar();
        try {
            caterpillar.swim();
        }catch (UnsupportedOperationException e){
            assertEquals("Caterpillar cannot swim",e.getMessage());
        }
    }

    @Test
    void singCaterpillarTest() {
        CaterpillarInterface caterpillar = new Caterpillar();
        try {
            caterpillar.sing();
        }catch (UnsupportedOperationException e){
            assertEquals("Caterpillar cannot sing",e.getMessage());
        }
    }

    @Test
    void flyCaterpillarTest() {
        CaterpillarInterface caterpillar = new Caterpillar();
        try {
            caterpillar.fly();
        }catch (UnsupportedOperationException e){
            assertEquals("Caterpillar cannot fly",e.getMessage());
        }
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
        assertTrue(outContent.toString().contains("Cock-a-doodle-doo\n"));
    }


    @Test
    void parrotTest() {
        BirdInterface bird = new Parrot(SoundsLike.DOG);
        bird.sing();
        assertTrue(outContent.toString().contains("Woof, woof\n"));

        bird = new Parrot(SoundsLike.CAT);
        bird.sing();
        assertTrue(outContent.toString().contains("Meow\n"));

        bird = new Parrot(SoundsLike.ROOSTER);
        bird.sing();
        assertTrue(outContent.toString().contains("Cock-a-doodle-doo\n"));

    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}

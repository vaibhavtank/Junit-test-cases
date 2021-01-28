BasicAnnotationsTestCases.java

package com.vt;

import org.junit.*;

public class BasicAnnotationsTestCases {

    // Run once, e.g. Database connection, connection pool | basically this will start before run test cases.
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Run once, e.g close connection, cleanup | it is use for cleanup activity
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - method_2");
    }

}

package com.example.user.android_assignment_6;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
        @Test
        public void username_isValid() {
            assertEquals("username is Valid", "Srujan1308", "Srujan");
       /* assertEquals is whatever input we put it will compare
        Assert() methods are used to compare the actual output with the expected
        here taking test case for username_isValid
        test will pass because the expected and actual username is true*/
        }

        @Test
        public void Password_isValid() {
            assertEquals("password is valid", "5678", "5678");
         /* assertEquals is whatever input we put it will compare
        Assert() methods are used to compare the actual output with the expected
        here taking test case for password_isValid
        test will pass because the expected and actual password is true*/
        }

        @Test
        public void username_notValid() {
            assertEquals("username not Valid", "Srujan", "Srujan1308");
         /* assertEquals is whatever input we put it will compare
        Assert() methods are used to compare the actual output with the expected
        here taking test case for username_notValid
        test will fail because the expected and actual username is false*/
        }

        @Test
        public void Password_notValid() {
            assertEquals("password not valid", "5678", "56789");
        /* assertEquals is whatever input we put it will compare
        Assert() methods are used to compare the actual output with the expected
        here taking test case for password_isValid
        test will fail because the expected and actual password is false*/
        }
    }
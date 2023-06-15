/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.banjo.mathutil.core.test;

import static org.banjo.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tuan3
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        
        //assertEquals(69, 69);
        assertEquals(1,getFactorial(0));
        assertEquals(1,getFactorial(1));
        assertEquals(2,getFactorial(2));
        assertEquals(6,getFactorial(3));
        assertEquals(120,getFactorial(5));
        assertEquals(720,getFactorial(6));
    }
    
}


//DDT là 1 phần mở rộng của các Unit Test Framework
//DATA DRIVEN TESTINGS
//          KO NHẮM TỚI TDD: TEST DRIVEN DEVELOPMENT
//          VIẾT CODE VÀ VIẾT CASE SONG HÀNH VỚI NHAU, ĐÃ HỌC XONG
//NHƯNG CODE TEST BỐC MÙI (BAD SMELLS) TRÙNG CODE NHIỀU
// NÊN NGƯỜI TA CHẾ RA
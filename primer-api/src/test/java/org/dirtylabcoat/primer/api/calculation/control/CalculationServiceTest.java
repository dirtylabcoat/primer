/**
 * MIT License
 *
 * Copyright (c) 2018 Daniel Löfquist <daniel@lofquist.org>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.dirtylabcoat.primer.api.calculation.control;

import java.math.BigInteger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Daniel Löfquist <daniel@lofquist.org>
 */
public class CalculationServiceTest {

    public CalculationServiceTest() {
    }

    private CalculationService calculationService;

    @Test
    public void testFirstPrimeIs2() {
        BigInteger n = BigInteger.valueOf(1);
        BigInteger nth = BigInteger.valueOf(2);
        assertEquals(calculationService.getNth(n), nth);
    }

    @Test
    public void testTenthPrimeIs29() {
        BigInteger n = BigInteger.valueOf(10);
        BigInteger nth = BigInteger.valueOf(29);
        assertEquals(calculationService.getNth(n), nth);
    }

    @Test
    public void testHundredthPrimeIs541() {
        BigInteger n = BigInteger.valueOf(100);
        BigInteger nth = BigInteger.valueOf(541);
        assertEquals(calculationService.getNth(n), nth);
    }

    @Test
    public void test2IsPrime() {
        assertTrue(calculationService.isPrime(BigInteger.valueOf(2)));
    }

    @Test
    public void test29IsPrime() {
        assertTrue(calculationService.isPrime(BigInteger.valueOf(29)));
    }

    @Test
    public void test541IsPrime() {
        assertTrue(calculationService.isPrime(BigInteger.valueOf(541)));
    }

    @Test
    public void test4IsNotPrime() {
        assertFalse(calculationService.isPrime(BigInteger.valueOf(4)));
    }

    @Test
    public void test34IsNotPrime() {
        assertFalse(calculationService.isPrime(BigInteger.valueOf(34)));
    }

    @Test
    public void test548IsNotPrime() {
        assertFalse(calculationService.isPrime(BigInteger.valueOf(548)));
    }

    @Before
    public void setUp() throws Exception {
        calculationService = new CalculationService();
    }
}

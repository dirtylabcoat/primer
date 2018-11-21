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
import javax.ejb.Stateless;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Daniel Löfquist <daniel@lofquist.org>
 */
@Stateless
public class CalculationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationService.class.getName());

    public BigInteger getNth(BigInteger n) {
        BigInteger count = BigInteger.ZERO;
        BigInteger candidate = BigInteger.valueOf(2);
        while (count.compareTo(n) == -1) {
            if (isPrime(candidate)) {
                count = count.add(BigInteger.ONE);
            }
            candidate = candidate.add(BigInteger.ONE);
        }
        BigInteger nth = candidate.subtract(BigInteger.ONE);
        LOGGER.debug("n={}, nth={}", new Object[] { n, nth });
        // The candidate has been incremented once after the count reached n
        return nth;
    }

    public boolean isPrime(BigInteger num) {
        return num.isProbablePrime(99);
    }

    private void persistPrime(BigInteger prime, BigInteger n) {
        // Persist prime number to database
    }

}

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
package org.dirtylabcoat.primer.api.calculation.boundary;

import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.validation.constraints.Min;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.dirtylabcoat.primer.api.calculation.control.CalculationService;

/**
 *
 * @author Daniel Löfquist <daniel@lofquist.org>
 */
@Path("calculate")
@Stateless
public class CalculationResource {

    @Inject
    private CalculationService calculationService;

    @Path("nth")
    @GET
    public Response nth(@Min(value = 1, message = "Number must be more than zero") @QueryParam("n") BigInteger n) {
        return Response.ok(Json.createObjectBuilder()
                .add("n", n).add("nth", calculationService.getNth(n)).build())
                .build();
    }

    @Path("is-prime")
    @GET
    public Response isPrime(@Min(value = 0, message = "Number must be positive") @QueryParam("num") BigInteger num) {
        boolean a = calculationService.isPrime(num);
        return Response.ok(Json.createObjectBuilder()
                .add("num", num).add("isPrime", a).build())
                .build();
    }

}

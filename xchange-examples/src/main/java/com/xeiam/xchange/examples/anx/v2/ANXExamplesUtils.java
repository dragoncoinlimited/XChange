/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
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
package com.xeiam.xchange.examples.anx.v2;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.ExchangeFactory;
import com.xeiam.xchange.ExchangeSpecification;
import com.xeiam.xchange.anx.goxapi.v2.ANXExchange;
import com.xeiam.xchange.mtgox.v2.MtGoxExchange;

/**
 * @author timmolter
 */
public class ANXExamplesUtils {

  public static Exchange createExchange() {

    ExchangeSpecification exSpec = new ExchangeSpecification(ANXExchange.class);
    exSpec.setSecretKey("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlY0A1ODgxMWE1");
    exSpec.setApiKey("fd012755-ed0a-4740-ab16-f8dda02913a7");
    exSpec.setSslUri("http://localhost:8080");
    exSpec.setHost("localhost");
    exSpec.setPort(8080);
//    exSpec.setPlainTextUriStreaming("ws://websocket.anx.com");
//    exSpec.setSslUriStreaming("wss://websocket.anx.com");
    return ExchangeFactory.INSTANCE.createExchange(exSpec);
  }

}

package expression;

import io.vertx.codetrans.LiteralExpressionTest;
import io.vertx.codetrans.annotations.CodeTranslate;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class LiteralFloat {

  @CodeTranslate
  public void positiveValue() throws Exception {
    LiteralExpressionTest.result = 4f;
  }

  @CodeTranslate
  public void negativeValue() throws Exception {
    LiteralExpressionTest.result = -4f;
  }
}

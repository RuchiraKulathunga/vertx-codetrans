package io.vertx.support;

import io.vertx.codegen.annotations.VertxGen;

import java.util.Map;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface CollectionFactory {

  public static Map createMap() {
    throw new AssertionError("stub");
  }

  public static Map wrapMap(Map map) {
    throw new AssertionError("stub");
  }
}

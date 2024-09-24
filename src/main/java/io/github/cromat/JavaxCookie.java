package io.github.cromat;

import java.util.Arrays;
import javax.servlet.http.Cookie;

public class JavaxCookie extends Cookie {

  public JavaxCookie(jakarta.servlet.http.Cookie jakartaCookie) {
    super(jakartaCookie.getName(), jakartaCookie.getValue());
    copyProperties(jakartaCookie);
  }

  public static JavaxCookie[] fromArray(jakarta.servlet.http.Cookie[] jakartaCookieArray) {
    return Arrays.stream(jakartaCookieArray).map(JavaxCookie::new).toArray(JavaxCookie[]::new);
  }

  private void copyProperties(jakarta.servlet.http.Cookie jakartaCookie) {
    setComment("");
    if (jakartaCookie.getDomain() != null) {
      setDomain(jakartaCookie.getDomain());
    }
    setMaxAge(jakartaCookie.getMaxAge());
    setPath(jakartaCookie.getPath());
    setSecure(jakartaCookie.getSecure());
    setVersion(1);
    setHttpOnly(jakartaCookie.isHttpOnly());
  }
}

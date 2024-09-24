package io.github.cromat;

import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

public class JavaxHttpSession implements HttpSession {

  final jakarta.servlet.http.HttpSession jakartaSession;

  public JavaxHttpSession(jakarta.servlet.http.HttpSession jakartaHttpSession) {
    this.jakartaSession = jakartaHttpSession;
  }

  @Override
  public long getCreationTime() {
    return jakartaSession.getCreationTime();
  }

  @Override
  public String getId() {
    return jakartaSession.getId();
  }

  @Override
  public long getLastAccessedTime() {
    return jakartaSession.getLastAccessedTime();
  }

  @Override
  public ServletContext getServletContext() {
    return null;
  }

  @Override
  public void setMaxInactiveInterval(int interval) {
    jakartaSession.setMaxInactiveInterval(interval);
  }

  @Override
  public int getMaxInactiveInterval() {
    return jakartaSession.getMaxInactiveInterval();
  }

  @Override
  public HttpSessionContext getSessionContext() {
    return null;
  }

  @Override
  public Object getAttribute(String name) {
    return jakartaSession.getAttribute(name);
  }

  @Override
  public Object getValue(String s) {
    return null;
  }

  @Override
  public Enumeration<String> getAttributeNames() {
    return jakartaSession.getAttributeNames();
  }

  @Override
  public String[] getValueNames() {
    return new String[0];
  }

  @Override
  public void setAttribute(String name, Object value) {
    jakartaSession.setAttribute(name, value);
  }

  @Override
  public void putValue(String s, Object o) {}

  @Override
  public void removeAttribute(String name) {
    jakartaSession.removeAttribute(name);
  }

  @Override
  public void removeValue(String s) {}

  @Override
  public void invalidate() {
    jakartaSession.invalidate();
  }

  @Override
  public boolean isNew() {
    return jakartaSession.isNew();
  }
}

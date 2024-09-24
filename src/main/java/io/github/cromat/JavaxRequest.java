package io.github.cromat;

import jakarta.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;

public class JavaxRequest implements javax.servlet.http.HttpServletRequest {

  final HttpServletRequest jakartaRequest;

  public JavaxRequest(HttpServletRequest jakartaRequest) {
    this.jakartaRequest = jakartaRequest;
  }

  @Override
  public String getAuthType() {
    return this.jakartaRequest.getAuthType();
  }

  @Override
  public Cookie[] getCookies() {
    return JavaxCookie.fromArray(jakartaRequest.getCookies());
  }

  @Override
  public long getDateHeader(String name) {
    return this.jakartaRequest.getDateHeader(name);
  }

  @Override
  public String getHeader(String name) {
    return this.jakartaRequest.getHeader(name);
  }

  @Override
  public Enumeration<String> getHeaders(String name) {
    return this.jakartaRequest.getHeaders(name);
  }

  @Override
  public Enumeration<String> getHeaderNames() {
    return this.jakartaRequest.getHeaderNames();
  }

  @Override
  public int getIntHeader(String name) {
    return this.jakartaRequest.getIntHeader(name);
  }

  @Override
  public String getMethod() {
    return this.jakartaRequest.getMethod();
  }

  @Override
  public String getPathInfo() {
    return this.jakartaRequest.getPathInfo();
  }

  @Override
  public String getPathTranslated() {
    return this.jakartaRequest.getPathTranslated();
  }

  @Override
  public String getContextPath() {
    return this.jakartaRequest.getContextPath();
  }

  @Override
  public String getQueryString() {
    return this.jakartaRequest.getQueryString();
  }

  @Override
  public String getRemoteUser() {
    return this.jakartaRequest.getRemoteUser();
  }

  @Override
  public boolean isUserInRole(String role) {
    return this.jakartaRequest.isUserInRole(role);
  }

  @Override
  public Principal getUserPrincipal() {
    return this.jakartaRequest.getUserPrincipal();
  }

  @Override
  public String getRequestedSessionId() {
    return this.jakartaRequest.getRequestedSessionId();
  }

  @Override
  public String getRequestURI() {
    return this.jakartaRequest.getRequestURI();
  }

  @Override
  public StringBuffer getRequestURL() {
    return this.jakartaRequest.getRequestURL();
  }

  @Override
  public String getServletPath() {
    return this.jakartaRequest.getServletPath();
  }

  @Override
  public HttpSession getSession(boolean create) {
    return new JavaxHttpSession(this.jakartaRequest.getSession());
  }

  @Override
  public HttpSession getSession() {
    return new JavaxHttpSession(this.jakartaRequest.getSession());
  }

  @Override
  public String changeSessionId() {
    return this.jakartaRequest.changeSessionId();
  }

  @Override
  public boolean isRequestedSessionIdValid() {
    return this.jakartaRequest.isRequestedSessionIdValid();
  }

  @Override
  public boolean isRequestedSessionIdFromCookie() {
    return this.jakartaRequest.isRequestedSessionIdFromCookie();
  }

  @Override
  public boolean isRequestedSessionIdFromURL() {
    return this.jakartaRequest.isRequestedSessionIdFromURL();
  }

  @Override
  public boolean isRequestedSessionIdFromUrl() {
    return this.jakartaRequest.isRequestedSessionIdFromURL();
  }

  @Override
  public boolean authenticate(HttpServletResponse response) {
    return true;
  }

  @Override
  public void login(String username, String password) {
    try {
      this.jakartaRequest.login(username, password);
    } catch (jakarta.servlet.ServletException e) {
      throw new IllegalArgumentException(e);
    }
  }

  @Override
  public void logout() {
    try {
      this.jakartaRequest.logout();
    } catch (jakarta.servlet.ServletException e) {
      throw new IllegalArgumentException(e);
    }
  }

  @Override
  public Collection<Part> getParts() throws IOException {
    try {
      return this.jakartaRequest.getParts().stream()
          .map(jakartaPart -> (Part) new JavaxPart(jakartaPart))
          .toList();
    } catch (jakarta.servlet.ServletException e) {
      throw new IllegalArgumentException(e);
    }
  }

  @Override
  public Part getPart(String name) throws IOException {
    try {
      return new JavaxPart(jakartaRequest.getPart(name));
    } catch (jakarta.servlet.ServletException e) {
      throw new IllegalArgumentException(e);
    }
  }

  @Override
  public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) {
    return null;
  }

  @Override
  public Object getAttribute(String name) {
    return this.jakartaRequest.getAttribute(name);
  }

  @Override
  public Enumeration<String> getAttributeNames() {
    return this.jakartaRequest.getAttributeNames();
  }

  @Override
  public String getCharacterEncoding() {
    return this.jakartaRequest.getCharacterEncoding();
  }

  @Override
  public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
    this.jakartaRequest.setCharacterEncoding(env);
  }

  @Override
  public int getContentLength() {
    return this.jakartaRequest.getContentLength();
  }

  @Override
  public long getContentLengthLong() {
    return this.jakartaRequest.getContentLengthLong();
  }

  @Override
  public String getContentType() {
    return this.jakartaRequest.getContentType();
  }

  @Override
  public ServletInputStream getInputStream() {
    return null;
  }

  @Override
  public String getParameter(String name) {
    return this.jakartaRequest.getParameter(name);
  }

  @Override
  public Enumeration<String> getParameterNames() {
    return this.jakartaRequest.getParameterNames();
  }

  @Override
  public String[] getParameterValues(String name) {
    return this.jakartaRequest.getParameterValues(name);
  }

  @Override
  public Map<String, String[]> getParameterMap() {
    return this.jakartaRequest.getParameterMap();
  }

  @Override
  public String getProtocol() {
    return this.jakartaRequest.getProtocol();
  }

  @Override
  public String getScheme() {
    return this.jakartaRequest.getScheme();
  }

  @Override
  public String getServerName() {
    return this.jakartaRequest.getServerName();
  }

  @Override
  public int getServerPort() {
    return this.jakartaRequest.getServerPort();
  }

  @Override
  public BufferedReader getReader() throws IOException {
    return this.jakartaRequest.getReader();
  }

  @Override
  public String getRemoteAddr() {
    return this.jakartaRequest.getRemoteAddr();
  }

  @Override
  public String getRemoteHost() {
    return this.jakartaRequest.getRemoteHost();
  }

  @Override
  public void setAttribute(String name, Object o) {
    this.jakartaRequest.setAttribute(name, o);
  }

  @Override
  public void removeAttribute(String name) {
    this.jakartaRequest.removeAttribute(name);
  }

  @Override
  public Locale getLocale() {
    return this.jakartaRequest.getLocale();
  }

  @Override
  public Enumeration<Locale> getLocales() {
    return this.jakartaRequest.getLocales();
  }

  @Override
  public boolean isSecure() {
    return this.jakartaRequest.isSecure();
  }

  @Override
  public RequestDispatcher getRequestDispatcher(String path) {
    return (RequestDispatcher) jakartaRequest.getRequestDispatcher(path);
  }

  @Override
  public String getRealPath(String path) {
    return path;
  }

  @Override
  public int getRemotePort() {
    return this.jakartaRequest.getRemotePort();
  }

  @Override
  public String getLocalName() {
    return this.jakartaRequest.getLocalName();
  }

  @Override
  public String getLocalAddr() {
    return this.jakartaRequest.getLocalAddr();
  }

  @Override
  public int getLocalPort() {
    return this.jakartaRequest.getLocalPort();
  }

  @Override
  public ServletContext getServletContext() {
    return new JavaxServletContext(jakartaRequest.getServletContext());
  }

  @Override
  public AsyncContext startAsync() throws IllegalStateException {
    return null;
  }

  @Override
  public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
      throws IllegalStateException {
    return null;
  }

  @Override
  public boolean isAsyncStarted() {
    return this.jakartaRequest.isAsyncStarted();
  }

  @Override
  public boolean isAsyncSupported() {
    return this.jakartaRequest.isAsyncSupported();
  }

  @Override
  public AsyncContext getAsyncContext() {
    return null;
  }

  @Override
  public DispatcherType getDispatcherType() {
    return DispatcherType.values()[jakartaRequest.getDispatcherType().ordinal()];
  }
}

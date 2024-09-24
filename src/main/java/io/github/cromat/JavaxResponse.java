package io.github.cromat;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;
import javax.servlet.ServletOutputStream;

public class JavaxResponse implements javax.servlet.http.HttpServletResponse {

  private final HttpServletResponse jakartaResponse;

  public JavaxResponse(HttpServletResponse jakartaResponse) {
    this.jakartaResponse = jakartaResponse;
  }

  @Override
  public void addCookie(javax.servlet.http.Cookie cookie) {}

  @Override
  public boolean containsHeader(String name) {
    return jakartaResponse.containsHeader(name);
  }

  @Override
  public String encodeURL(String url) {
    return jakartaResponse.encodeURL(url);
  }

  @Override
  public String encodeRedirectURL(String url) {
    return jakartaResponse.encodeRedirectURL(url);
  }

  @Override
  public String encodeUrl(String url) {
    return jakartaResponse.encodeURL(url);
  }

  @Override
  public String encodeRedirectUrl(String url) {
    return jakartaResponse.encodeRedirectURL(url);
  }

  @Override
  public void sendError(int sc, String msg) throws IOException {
    jakartaResponse.sendError(sc, msg);
  }

  @Override
  public void sendError(int sc) throws IOException {
    jakartaResponse.sendError(sc);
  }

  @Override
  public void sendRedirect(String location) throws IOException {
    jakartaResponse.sendRedirect(location);
  }

  @Override
  public void setDateHeader(String name, long date) {
    jakartaResponse.setDateHeader(name, date);
  }

  @Override
  public void addDateHeader(String name, long date) {
    jakartaResponse.addDateHeader(name, date);
  }

  @Override
  public void setHeader(String name, String value) {
    jakartaResponse.setHeader(name, value);
  }

  @Override
  public void addHeader(String name, String value) {
    jakartaResponse.addHeader(name, value);
  }

  @Override
  public void setIntHeader(String name, int value) {
    jakartaResponse.setIntHeader(name, value);
  }

  @Override
  public void addIntHeader(String name, int value) {
    jakartaResponse.addIntHeader(name, value);
  }

  @Override
  public void setStatus(int sc) {
    jakartaResponse.setStatus(sc);
  }

  @Override
  public void setStatus(int sc, String sm) {
    jakartaResponse.setStatus(sc);
  }

  @Override
  public int getStatus() {
    return jakartaResponse.getStatus();
  }

  @Override
  public String getHeader(String name) {
    return jakartaResponse.getHeader(name);
  }

  @Override
  public Collection<String> getHeaders(String name) {
    return jakartaResponse.getHeaders(name);
  }

  @Override
  public Collection<String> getHeaderNames() {
    return jakartaResponse.getHeaderNames();
  }

  @Override
  public String getCharacterEncoding() {
    return jakartaResponse.getCharacterEncoding();
  }

  @Override
  public String getContentType() {
    return jakartaResponse.getContentType();
  }

  @Override
  public ServletOutputStream getOutputStream() {
    // Note: You might need to create a wrapper for ServletOutputStream as well
    return null;
  }

  @Override
  public PrintWriter getWriter() throws IOException {
    return jakartaResponse.getWriter();
  }

  @Override
  public void setCharacterEncoding(String charset) {
    jakartaResponse.setCharacterEncoding(charset);
  }

  @Override
  public void setContentLength(int len) {
    jakartaResponse.setContentLength(len);
  }

  @Override
  public void setContentLengthLong(long len) {
    jakartaResponse.setContentLengthLong(len);
  }

  @Override
  public void setContentType(String type) {
    jakartaResponse.setContentType(type);
  }

  @Override
  public void setBufferSize(int size) {
    jakartaResponse.setBufferSize(size);
  }

  @Override
  public int getBufferSize() {
    return jakartaResponse.getBufferSize();
  }

  @Override
  public void flushBuffer() throws IOException {
    jakartaResponse.flushBuffer();
  }

  @Override
  public void resetBuffer() {
    jakartaResponse.resetBuffer();
  }

  @Override
  public boolean isCommitted() {
    return jakartaResponse.isCommitted();
  }

  @Override
  public void reset() {
    jakartaResponse.reset();
  }

  @Override
  public void setLocale(Locale loc) {
    jakartaResponse.setLocale(loc);
  }

  @Override
  public Locale getLocale() {
    return jakartaResponse.getLocale();
  }
}

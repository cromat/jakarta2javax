package io.github.cromat;

import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class JavaxPart implements Part {
  private final jakarta.servlet.http.Part jakartaPart;

  public JavaxPart(jakarta.servlet.http.Part jakartaPart) {
    this.jakartaPart = jakartaPart;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    return jakartaPart.getInputStream();
  }

  @Override
  public String getContentType() {
    return jakartaPart.getContentType();
  }

  @Override
  public String getName() {
    return jakartaPart.getName();
  }

  @Override
  public String getSubmittedFileName() {
    return jakartaPart.getSubmittedFileName();
  }

  @Override
  public long getSize() {
    return jakartaPart.getSize();
  }

  @Override
  public void write(String fileName) throws IOException {
    jakartaPart.write(fileName);
  }

  @Override
  public void delete() throws IOException {
    jakartaPart.delete();
  }

  @Override
  public String getHeader(String name) {
    return jakartaPart.getHeader(name);
  }

  @Override
  public Collection<String> getHeaders(String name) {
    return jakartaPart.getHeaders(name);
  }

  @Override
  public Collection<String> getHeaderNames() {
    return jakartaPart.getHeaderNames();
  }
}

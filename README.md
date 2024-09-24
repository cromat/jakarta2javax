# jakarta2javax

Backward compatibility tool for libraries like Okta Auth0 Java SDK that still require Javax servlet API.

[Link to maven central](https://central.sonatype.com/artifact/io.github.cromat/jakarta2javax/overview).

## Usage

Example of wrapping Auth0 request and response:

```

public void authorize(HttpServletRequest req, HttpServletResponse res) throws IOException {

    AuthorizeUrl authUrl =
        auth0Provider
            .getInstance()
            .buildAuthorizeUrl(
                new JavaxRequest(req), new JavaxResponse(res), auth0Props.getRedirectUri())
            .withScope("openid email");
            
            ...
```

## TODO

Finish converting all methods.
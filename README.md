# j2ee-website-with-gradle

A simple website build as Java project based on gradle.

Run the project as ``./gradlew clean build``

Run the server as ``./gradlew appStart``

You can set the server in the ``build.gradle``, setting the value ``tomcat10`` or ``jetty11`` in the property ``servletContainer``:

```plaintext
gretty {
    servletContainer 'jetty11'
}
```

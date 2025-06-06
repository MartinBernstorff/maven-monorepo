### Capabilities
* Incremental builds using [maven-build-cache-extension](https://maven.apache.org/extensions/maven-build-cache-extension/getting-started.html)
    * Changes to lib results in recompilation of both service and service2
    * Changes to service does not affect service2
    * Caching of test runs
    * Supported by IntelliJ
* Remote build caching? https://maven.apache.org/extensions/maven-build-cache-extension/remote-cache.html
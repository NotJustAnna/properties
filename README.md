# Properties

Properties is a simple, clean implementation of java.util.Properties, using new stuff like ConcurrentHashMaps and Generics.
It is a drop-in replacement for java.util.Properties, and is fully compatible with it.

### Installation

[![Latest Version](https://maven.adriantodt.net/api/badge/latest/releases/net/adriantodt/properties?color=40c14a&name=Maven&prefix=v)](https://maven.adriantodt.net/releases/net/adriantodt/properties)

```xml

#### Maven

```xml
<repository>
    <id>adriantodt-repository-releases</id>
    <name>AdrianTodt Repository</name>
    <url>https://maven.adriantodt.net/releases</url>
</repository>
```

```xml
<dependency>
    <groupId>net.adriantodt</groupId>
    <artifactId>properties</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Gradle Groovy

```groovy
maven {
    url "https://maven.adriantodt.net/releases"
}
```

```groovy
dependencies {
    implementation "net.adriantodt:properties:1.0.0"
}
```

#### Gradle Kotlin

```kotlin
maven {
    url = uri("https://maven.adriantodt.net/snapshots")
}
```

```kotlin
dependencies {
    implementation("net.adriantodt:properties:1.0.0")
}
```

#### SBT

```scala
resolvers +=
  "adriantodt-repository-releases" 
     at "https://maven.adriantodt.net/releases"
```
    
```scala
libraryDependencies += "net.adriantodt" % "properties" % "1.0.0"
```

### Usage

#### Reading:

```java
// New Instance
Properties properties = new Properties();

// Load from File
Properties properties = Properties.fromFile(file);

//Load from String
Properties properties = Properties.fromString("url=localhost\nport=8080");
```

#### Writing:

```java
// Save as String
String toString = properties.storeToString("Test Properties");

// Write to file
properties.store(file, "Test Properties");

// Write to a writer
properties.store(writer, "Test Properties");
```

## License

The project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).

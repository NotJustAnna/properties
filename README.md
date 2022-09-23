# Properties

Properties is a simple, clean implementation of java.util.Properties, using new stuff like ConcurrentHashMaps and Generics.
It is a drop-in replacement for java.util.Properties, and is fully compatible with it.

### Installation

[![Latest Version](https://maven.notjustanna.net/api/badge/latest/releases/net/notjustanna/properties?color=40c14a&name=Maven&prefix=v)](https://maven.notjustanna.net/releases/net/notjustanna/properties)

```xml

#### Maven

```xml
<repository>
    <id>notjustanna-repository-releases</id>
    <name>NotJustAnna Repository</name>
    <url>https://maven.notjustanna.net/releases</url>
</repository>
```

```xml
<dependency>
    <groupId>net.notjustanna</groupId>
    <artifactId>properties</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Gradle Groovy

```groovy
maven {
    url "https://maven.notjustanna.net/releases"
}
```

```groovy
dependencies {
    implementation "net.notjustanna:properties:1.0.0"
}
```

#### Gradle Kotlin

```kotlin
maven {
    url = uri("https://maven.notjustanna.net/snapshots")
}
```

```kotlin
dependencies {
    implementation("net.notjustanna:properties:1.0.0")
}
```

#### SBT

```scala
resolvers +=
  "notjustanna-repository-releases" 
     at "https://maven.notjustanna.net/releases"
```
    
```scala
libraryDependencies += "net.notjustanna" % "properties" % "1.0.0"
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

# Properties
Clean version of java.util.Properties, using new stuff like ConcurrentHashMaps and Generics.

Licensed under the [%license% License](https://github.com/arudiscord/properties/blob/master/LICENSE).

### Installation

![Latest Version](https://api.bintray.com/packages/arudiscord/maven/properties/images/download.svg)

Using in Gradle:

```gradle
repositories {
  jcenter()
}

dependencies {
  compile 'pw.aru.libs:properties:LATEST' // replace LATEST with the version above
}
```

Using in Maven:

```xml
<repositories>
  <repository>
    <id>central</id>
    <name>bintray</name>
    <url>http://jcenter.bintray.com</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>pw.aru.libs</groupId>
    <artifactId>properties</artifactId>
    <version>LATEST</version> <!-- replace LATEST with the version above -->
  </dependency>
</dependencies>
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


### Support

Support is given on [Aru's Discord Server](https://discord.gg/URPghxg)

[![Aru's Discord Server](https://discordapp.com/api/guilds/403934661627215882/embed.png?style=banner2)](https://discord.gg/URPghxg)


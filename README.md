# Properties
Clean version of java.util.Properties, using new stuff like HashMaps and Generics.

Get it on JCenter: ``net.notjustanna.utils:properties:1.2``

## Usage

### Reading:

```java
// New Instance
Properties properties = new Properties();

// Load from File
Properties properties = Properties.fromFile(file);

//Load from String
Properties properties = Properties.fromString("url=localhost\nport=8080");

```

### Writing:

```java
// Save as String
String toString = properties.storeToString("Test Properties");

// Write to file
properties.store(file, "Test Properties");

// Write to a writer
properties.store(writer, "Test Properties");
```

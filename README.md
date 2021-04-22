# Annotation directives for `kscript`

For details see https://github.com/holgerbrandl/kscript

Current version: `1.4` (MavenCentral)

## How to use?

Simply change your gradle dependencies to include:

```
implementation 'com.github.holgerbrandl:kscript-annotations:1.4'
```

## Example

```kotlin
#!/usr/bin/env kscript

@file:DependsOn("de.mpicbg.scicomp:kutils:0.4")
@file:DependsOn("com.beust:klaxon:0.24", "com.github.kittinunf.fuel:fuel:1.3.1")


@file:Include("util.kt")

@file:EntryPoint("Foo.bar") // applies on for kt-files

// define kotlin options
@file:KotlinOpts("-J-Xmx5g")
@file:KotlinOpts("-J-server")


print("1+1")
```
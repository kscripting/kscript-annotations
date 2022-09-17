@file:Suppress("unused")

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class DependsOn(vararg val artifactCoordinates: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class EntryPoint(val value: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
@Deprecated(
    "@file:Include(paths) is deprecated in favor of @file:Import()",
    ReplaceWith("@file:Import(paths)"),
    DeprecationLevel.WARNING
)
annotation class Include(vararg val paths: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Import(vararg val paths: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
@Deprecated(
    "@file:KotlinOpts(options) is deprecated in favor of @file:KotlinOptions()",
    ReplaceWith("@file:KotlinOptions(options)"),
    DeprecationLevel.WARNING
)
annotation class KotlinOpts(vararg val options: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class KotlinOptions(vararg val options: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
@Deprecated(
    "@file:CompilerOpts(options) is deprecated in favor of @file:CompilerOptions()",
    ReplaceWith("@file:CompilerOptions(options)"),
    DeprecationLevel.WARNING
)
annotation class CompilerOpts(vararg val options: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class CompilerOptions(vararg val options: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Repository(val url: String, val user: String = "", val password: String = "")

// MavenRepository and DependsOnMaven are supported "as it" for compatibility with jupyter notebooks.
// see https://github.com/kohesive/keplin/blob/master/keplin-maven-resolver/src/main/kotlin/uy/kohesive/keplin/kotlin/script/resolver/maven/MavenResolverAnnotations.kt
// example https://github.com/kohesive/keplin/blob/a307e05eae091c99c665fe3da52a428fb0e10a6a/keplin-maven-resolver/src/test/kotlin/uy/kohesive/keplin/kotlin/script/resolver/maven/TestMavenScriptDependencies.kt#L38

// note: in contrasts to DependsOn DependsOnMaven just supports a single artifact argument
@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
@Deprecated(
    "@file:DependsOnMaven(artifactCoordinates) is deprecated in favor of @file:DependsOn()",
    ReplaceWith("@file:DependsOn(artifactCoordinates)"),
    DeprecationLevel.WARNING
)
annotation class DependsOnMaven(val artifactCoordinates: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
@Deprecated(
    "@file:MavenRepository(id, url, user, password) is deprecated in favor of @file:Repository()",
    ReplaceWith("@file:Repository(url, user, password)"),
    DeprecationLevel.WARNING
)
annotation class MavenRepository(val id: String, val url: String, val user: String = "", val password: String = "")

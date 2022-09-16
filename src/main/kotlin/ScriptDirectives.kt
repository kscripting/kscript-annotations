@file:Suppress("unused")

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class DependsOn(vararg val artifactLocators: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class EntryPoint(val value: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Include(val includePath: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Import(val includePath: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class KotlinOpts(val runOptions: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class KotlinOptions(val runOptions: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class CompilerOpts(val kotlincFlags: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class CompilerOptions(val kotlincFlags: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Repository(val url: String)

// MavenRepository and DependsOnMaven are supported "as it" for compatibility with jupyter notebooks.
// see https://github.com/kohesive/keplin/blob/master/keplin-maven-resolver/src/main/kotlin/uy/kohesive/keplin/kotlin/script/resolver/maven/MavenResolverAnnotations.kt
// example https://github.com/kohesive/keplin/blob/a307e05eae091c99c665fe3da52a428fb0e10a6a/keplin-maven-resolver/src/test/kotlin/uy/kohesive/keplin/kotlin/script/resolver/maven/TestMavenScriptDependencies.kt#L38

// note: in contrasts to DependsOn DependsOnMaven just supports a single artifact argument
@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
annotation class DependsOnMaven(val artifactLocator: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
annotation class MavenRepository(val id: String, val url: String, val user: String = "", val password: String = "")

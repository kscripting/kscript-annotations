@Target(allowedTargets = *arrayOf(AnnotationTarget.FILE))
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class DependsOn(vararg val args: String)

// add repo to annotation
//annotation class DependsOn(vararg val args : String, val from = "jcenter")

@Target(allowedTargets = *arrayOf(AnnotationTarget.FILE))
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class EntryPoint(val value: String)


@Target(allowedTargets = *arrayOf(AnnotationTarget.FILE))
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Include(val includePath: String)


@Target(allowedTargets = *arrayOf(AnnotationTarget.FILE))
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class KotlinOpts(val runOptions: String)





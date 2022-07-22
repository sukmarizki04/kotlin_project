package annotations


@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented()


annotation class Beta()

class ExampleTarget(
    @field:Beta val namaawal:String,
    @get:Beta val namatengah:String,
    @param:Beta val namaakhir:String
)

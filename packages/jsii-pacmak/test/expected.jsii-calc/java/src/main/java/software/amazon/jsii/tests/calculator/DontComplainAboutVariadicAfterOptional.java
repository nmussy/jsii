package software.amazon.jsii.tests.calculator;

/**
 * EXPERIMENTAL
 */
@javax.annotation.Generated(value = "jsii-pacmak")
@software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
@software.amazon.jsii.Jsii(module = software.amazon.jsii.tests.calculator.$Module.class, fqn = "jsii-calc.DontComplainAboutVariadicAfterOptional")
public class DontComplainAboutVariadicAfterOptional extends software.amazon.jsii.JsiiObject {

    protected DontComplainAboutVariadicAfterOptional(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DontComplainAboutVariadicAfterOptional(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public DontComplainAboutVariadicAfterOptional() {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this);
    }

    /**
     * EXPERIMENTAL
     * <p>
     * @param optional
     * @param things This parameter is required.
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    public @org.jetbrains.annotations.NotNull java.lang.String optionalAndVariadic(final @org.jetbrains.annotations.Nullable java.lang.String optional, final @org.jetbrains.annotations.NotNull java.lang.String... things) {
        return this.jsiiCall("optionalAndVariadic", java.lang.String.class, java.util.stream.Stream.concat(java.util.Arrays.<Object>stream(new Object[] { optional }), java.util.Arrays.<Object>stream(things)).toArray(Object[]::new));
    }
}

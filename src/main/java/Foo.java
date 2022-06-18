import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.ApiStatus.Internal;

@Internal
public interface Foo {

    @ApiStatus.Internal
    interface A {

    }

    @Internal
    interface B {

    }
}

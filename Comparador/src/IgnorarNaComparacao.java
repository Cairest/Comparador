import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) 
public @interface IgnorarNaComparacao {

}

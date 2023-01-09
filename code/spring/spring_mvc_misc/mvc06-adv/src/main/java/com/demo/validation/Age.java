package com.demo.validation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy =AgeValidator.class)
public @interface Age {

    String message() default "{invalidagemessage}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
    int minAge() default 18;
    int maxAge() default 60;
}

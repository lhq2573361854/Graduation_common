package com.tianling.validator.annotation;

import com.tianling.validator.annotation.handlder.DefaultTimeHandler;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/3/17 16:38
 */
@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {DefaultTimeHandler.class})
public @interface DefaultTime {
    String value() default "";
}

package com.tianling.validator.annotation.handlder;

import com.tianling.validator.annotation.DefaultTime;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/3/17 17:06
 */
public class DefaultTimeHandler implements ConstraintValidator<DefaultTime,Object> {

    @Override
    public void initialize(DefaultTime constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}

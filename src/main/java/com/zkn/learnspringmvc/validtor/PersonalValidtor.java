package com.zkn.learnspringmvc.validtor;

import com.zkn.learnspringmvc.scope.PersonScope;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by wb-zhangkenan on 2016/9/2.
 */
public class PersonalValidtor implements Validator{

    @Override
    public boolean supports(Class<?> aClass) {
        return PersonScope.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name",null,"姓名不能为空!");
        PersonScope personScope = (PersonScope) obj;
        if(StringUtils.isEmpty(personScope.getAddress())){
            errors.rejectValue("address",null,"家庭地址不能为空!!!!");
        }
    }
}

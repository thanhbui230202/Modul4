package thanhbui.signup.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import thanhbui.signup.entity.Signup;
import thanhbui.signup.service.SignupService;

@Component
public class SignupValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof Signup)){
            return;
        }
        Signup signup = (Signup) target;
        int age = signup.getAge();
        if (age < 18 || age >99){
            errors.rejectValue("age","signup.age",new Object[]{18,99},"");
        }
    }
}

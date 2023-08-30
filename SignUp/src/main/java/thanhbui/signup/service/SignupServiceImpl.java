package thanhbui.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.signup.entity.Signup;
import thanhbui.signup.repository.SignupRepository;

import java.util.List;

@Service
public class SignupServiceImpl implements SignupService{
    @Autowired
    private SignupRepository signupRepository;
    @Override
    public List<Signup> findAll() {
        return signupRepository.findAll();
    }

    @Override
    public void create(Signup signup) {
        signupRepository.save(signup);
    }
}

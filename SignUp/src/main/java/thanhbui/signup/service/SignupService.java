package thanhbui.signup.service;

import thanhbui.signup.entity.Signup;

import java.util.List;

public interface SignupService {
    List<Signup> findAll();
    void create(Signup signup);
}

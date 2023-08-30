package thanhbui.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhbui.signup.entity.Signup;

public interface SignupRepository extends JpaRepository<Signup,String> {
}

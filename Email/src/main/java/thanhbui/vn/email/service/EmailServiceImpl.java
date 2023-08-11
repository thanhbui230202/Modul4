package thanhbui.vn.email.service;

import thanhbui.vn.email.bean.SettingEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.vn.email.repo.EmailRepo;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    private EmailRepo emailRepo;
    @Override
    public SettingEmail findByID(String id) {
        return emailRepo.findByID(id);
    }

    @Override
    public List<SettingEmail> findAll() {
        return emailRepo.findAll();
    }

    @Override
    public void update(SettingEmail settingEmail) {
        emailRepo.update(settingEmail);
    }
}

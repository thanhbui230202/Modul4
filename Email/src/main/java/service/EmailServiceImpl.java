package service;

import bean.SettingEmail;
import repo.EmailRepo;
import repo.EmailRepoImpl;

public class EmailServiceImpl implements EmailService{
    EmailRepo emailRepo = new EmailRepoImpl();
    @Override
    public SettingEmail findByID(String id) {
        return emailRepo.findByID(id);
    }

    @Override
    public SettingEmail findAll() {
        return emailRepo.findAll();
    }

    @Override
    public void update(SettingEmail settingEmail) {
        emailRepo.update(settingEmail);
    }
}

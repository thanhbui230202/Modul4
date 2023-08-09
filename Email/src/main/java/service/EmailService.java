package service;

import bean.SettingEmail;

public interface EmailService {
    SettingEmail findByID(String id);
    SettingEmail findAll();
    void update(SettingEmail settingEmail);
}

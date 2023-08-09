package repo;

import bean.SettingEmail;

public interface EmailRepo {
    SettingEmail findByID(String id);
    SettingEmail findAll();
    void update(SettingEmail settingEmail);
}

package thanhbui.vn.email.service;

import thanhbui.vn.email.bean.SettingEmail;

import java.util.List;

public interface EmailService {
    SettingEmail findByID(String id);
    List<SettingEmail> findAll();
    void update(SettingEmail settingEmail);
}

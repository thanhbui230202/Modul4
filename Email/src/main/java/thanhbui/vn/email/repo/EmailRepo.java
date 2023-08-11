package thanhbui.vn.email.repo;

import thanhbui.vn.email.bean.SettingEmail;

import java.util.List;

public interface EmailRepo {
    SettingEmail findByID(String id);
    List<SettingEmail> findAll();
    void update(SettingEmail settingEmail);
}

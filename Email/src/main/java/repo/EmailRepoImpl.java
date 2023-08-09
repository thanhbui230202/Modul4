package repo;

import bean.SettingEmail;

import java.util.HashMap;
import java.util.Map;

public class EmailRepoImpl implements EmailRepo{
    private static Map<String, SettingEmail> emailMap;

    static {
        emailMap = new HashMap<>();
        emailMap.put("EM001", new SettingEmail("EM001", "Japanese" ,25,true,"Thor"));
        emailMap.put("EM002", new SettingEmail("EM002", "English", 100,false,"Thor"));
    }
    @Override
    public SettingEmail findByID(String id) {
        return null;
    }

    @Override
    public SettingEmail findAll() {
        return null;
    }

    @Override
    public void update(SettingEmail settingEmail) {

    }
}

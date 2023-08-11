package thanhbui.vn.email.repo;

import thanhbui.vn.email.bean.SettingEmail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class EmailRepoImpl implements EmailRepo{
    private static Map<String, SettingEmail> emailMap;

    static {
        emailMap = new HashMap<>();
        emailMap.put("EM001", new SettingEmail("EM001", "Japanese" ,25,true,"Thor"));
        emailMap.put("EM002", new SettingEmail("EM002", "English", 100,false,"Thor"));
    }
    @Override
    public SettingEmail findByID(String id) {
        return emailMap.get(id);
    }

    @Override
    public List<SettingEmail> findAll() {
        return new ArrayList<>(emailMap.values());
    }

    @Override
    public void update(SettingEmail settingEmail) {
        if (emailMap.containsKey(settingEmail.getId())){
            emailMap.put(settingEmail.getId(),settingEmail);
        }
    }
}

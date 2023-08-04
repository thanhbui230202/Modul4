package repository;

import bean.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository{
    private static Map<String,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put("SV01",new Student("SV01","Bùi Minh Thành",22,"Đà Nẵng"));
        studentMap.put("SV02",new Student("SV02","Bùi Minh Thư",22,"Sài Gòn"));
        studentMap.put("SV03",new Student("SV03","Bùi Minh Toàn",22,"Hà Nội"));
        studentMap.put("SV04",new Student("SV04","Bùi Minh Tuấn",22,"Đăk Lăk"));
        studentMap.put("SV05",new Student("SV05","Bùi Minh Tú",22,"Gia Lai"));
    }
    @Override
    public void createOrUpdate(Student s) {
        studentMap.put(s.getId(),s);
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void deletedById(String id) {
        studentMap.remove(id);
    }
}

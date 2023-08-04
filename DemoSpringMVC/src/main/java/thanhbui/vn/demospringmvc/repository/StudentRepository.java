package thanhbui.vn.demospringmvc.repository;

import thanhbui.vn.demospringmvc.bean.Student;

import java.util.List;

public interface StudentRepository {
    void createOrUpdate(Student s);
    Student findById(String id);
    List<Student> findAll();
    void deletedById(String id);
}

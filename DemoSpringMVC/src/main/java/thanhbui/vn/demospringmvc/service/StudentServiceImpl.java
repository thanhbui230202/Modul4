package thanhbui.vn.demospringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.vn.demospringmvc.bean.Student;

import thanhbui.vn.demospringmvc.repository.StudentRepository;
import thanhbui.vn.demospringmvc.repository.StudentRepositoryImpl;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void createOrUpdate(Student s) {
        studentRepository.createOrUpdate(s);
    }

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deletedById(String id) {
        studentRepository.deletedById(id);
    }
}

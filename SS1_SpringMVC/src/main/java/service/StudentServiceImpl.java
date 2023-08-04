package service;

import bean.Student;
import repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentRepositoryImpl studentRepository;
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

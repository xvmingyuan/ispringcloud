package com.xmy.repository.impl;

import com.xmy.entity.Student;
import com.xmy.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "zhangshan", 22));
        studentMap.put(2L, new Student(2L, "李四", 12));
        studentMap.put(3L, new Student(3L, "wangwu", 33));

    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);

    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);

    }
}

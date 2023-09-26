package com.ramjava.spring3.department.service.model;

// By default, all fields are final. it has getters but no setters
public record Employee(Long id, Long departmentId, String name, int age, String position) {
}

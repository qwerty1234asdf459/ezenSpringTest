package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//Type: DB�� ������ ���̺��� ��ƼƼ�� ����, ID: �ش� ���̺� ��ƼƼ�� @ID ����Ǿ��ִ� �Ӽ��� Ÿ���� ����
//JPA�������丮 �������̽�
//- JPA�� �����ϴ� �������̽� �� �ϳ�
//- CRUD( Create Read Update Delete) �۾��� ó���ϴ� �޼������ �̹� ����
public interface QuestionResponsitory extends JpaRepository<Question, Integer>{

}


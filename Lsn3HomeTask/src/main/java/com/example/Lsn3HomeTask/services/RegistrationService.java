package com.example.Lsn3HomeTask.services;

import com.example.Lsn3HomeTask.domain.User;
import com.example.Lsn3HomeTask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    // Добавляем связь с репозиторием
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DataProcessingService dataProcessingService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void processRegistration(String name, int age, String email){
        // Создаем нового пользователя по параметрам метода
        User newUser = userService.createUser(name, age,email);

        // Добавляем пользователя в наш репозиторий пользователей
        dataProcessingService.addUserToList(newUser);

    }


}

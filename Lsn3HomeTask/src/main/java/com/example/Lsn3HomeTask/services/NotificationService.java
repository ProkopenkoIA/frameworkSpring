package com.example.Lsn3HomeTask.services;

import com.example.Lsn3HomeTask.domain.User;
import org.springframework.stereotype.Service;


@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("Новый пользователь был создан: " + user.getName());
    }

}

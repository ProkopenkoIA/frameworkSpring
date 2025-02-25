package ru.gb.Lsn12Ex1.services;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;

@MessagingGateway(defaultRequestChannel = "testInputChanel")
public interface Gateway {

    void writeToFile(@Header(FileHeaders.FILENAME) String filename, String data);
}

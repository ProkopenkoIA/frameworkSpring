package com.Lsn2Ex2.excersise2.model;

public enum TaskStatus {

    NOT_STARTED{
        @Override
        public String toString() {
            return "Не выполняется";
        }
    }, IN_PROGRESS{
        @Override
        public String toString() {
            return "Выполняется";
        }
    }, COMPLETED{
        @Override
        public String toString() {
            return "Завершена";
        }
    };
}

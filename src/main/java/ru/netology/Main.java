package ru.netology;
public class Main {
            public static void main(String[] args) {
                Post post = new Post();

                post.name = "Владислав";
                post.passport = "4444 № 44444444";
                post.patronymic = "Каминский";
                post.phone = "+7 (999)-999-99-99";
                post.surname = "Олегович";
                post.subscription = true;
                post.birthday = new FormDate();
                post.birthday.day = 6;
                post.birthday.month = 10;
                post.birthday.year = 1995;
                System.out.println(post.name);
            }
        }
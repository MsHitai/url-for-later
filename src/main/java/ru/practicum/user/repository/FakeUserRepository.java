package ru.practicum.user.repository;

import ru.practicum.user.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FakeUserRepository{

    private static final List<User> FAKE_USERS = createManyFakeUsers(3);

    public List<User> findAll() {
        return FAKE_USERS;
    }

    public User save(User user) {
        throw new UnsupportedOperationException("Метод save() ещё не готов");
    }

    private static List<User> createManyFakeUsers(int count) {
        List<User> fakeUsers = new ArrayList<>();
        for (long id = 1; id <= count; id++) {
            fakeUsers.add(createFakeUser(id));
        }
        return Collections.unmodifiableList(fakeUsers);
    }

    private static User createFakeUser(long id) {
        User fakeUser = new User();
        fakeUser.setId(id);
        fakeUser.setEmail("mail" + id + "@example.com");
        fakeUser.setName("Akakiy Akakievich #" + id);
        return fakeUser;
    }
}
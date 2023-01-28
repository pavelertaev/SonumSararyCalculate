package work.sonum.sonumsararycalculate.service;

import work.sonum.sonumsararycalculate.model.WallpaperWork;

import java.time.LocalDate;

public interface UserService {


    void createUser(String login, String password);

    void addWork(WallpaperWork work);

    void getWorkByPeriod(LocalDate from, LocalDate to);

    void getWorkByCurrentDay();
}

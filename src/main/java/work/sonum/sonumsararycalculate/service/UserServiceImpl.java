package work.sonum.sonumsararycalculate.service;

import org.springframework.stereotype.Service;
import work.sonum.sonumsararycalculate.model.Bed;
import work.sonum.sonumsararycalculate.model.OtherWorks;
import work.sonum.sonumsararycalculate.model.SmallFurniture;
import work.sonum.sonumsararycalculate.model.WallpaperWork;

import java.time.LocalDate;
import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {


    private final HashMap<Long, WallpaperWork> beds = new HashMap<>();
    private final HashMap<Long, WallpaperWork> otherWorks = new HashMap<>();
    private final HashMap<Long, WallpaperWork> smallFurniture = new HashMap<>();
    private static long counter = 1;

    @Override
    public void createUser(String login, String password) {
        //добавить логирование через Telegram
    }
    @Override
    public void addWork(WallpaperWork work) {
        if (work.getType() instanceof Bed) {
            beds.put(counter, work);
        } else if (work.getType() instanceof OtherWorks) {
            otherWorks.put(counter, work);
        } else if (work.getType() instanceof SmallFurniture) {
            smallFurniture.put(counter, work);

        }
    }
    @Override
    public void getWorkByPeriod(LocalDate from, LocalDate to){
        //сделать реализацию метода получения сделки за определенный период
    }
    @Override
    public void getWorkByCurrentDay(){
        getWorkByPeriod(LocalDate.now(),LocalDate.now());
    }



}

package test.push.noti.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import io.reactivex.Completable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Dao
public interface UserDao {

    @Insert
    public Completable insertUser(User user);

    @Delete
    public void deleteUser(User user);

    @Query("SELECT * FROM users")
    public LiveData<List<User>> loadAllUsersWithLive();

    @Query("SELECT * FROM users")
    public List<User> loadAllUsers();
}

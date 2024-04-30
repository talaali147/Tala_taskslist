package Ali.Tala_taskslist.data.MyTasksTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface MyTaskQuery {

    @Query("SELECT * FROM MyUser  ORDER BY importance DESC")
    List<MyTask>getAllTasks();
    @Query("SELECT * FROM MyUser WHERE userld=:userid_p "+ "ORDER BY time DESC")
    List<MyTask>getAllTaskOrderBy(long userid_p);
    @Query("SELECT * FRROM MyTask WHERE userld=:userid_p AND isCompleted=:isCompleted_p"+"ORDER BY importance DESC)
List<My>getAllTaskOrderBy(long userid_p,boolean isCompleted_p)

@Insert
    void insertTask(MyTask...t);
@Update
    void updateTask(MyTask...tasks);
@Delete
    void deleteTask(MyTask...t);
    @Query("SELECT* FROM MyTask WHERE subjld=:key_id"+ "ORDER BY importance DESC")
    List<MyTask>getTasksBySujld(long key_id);

}

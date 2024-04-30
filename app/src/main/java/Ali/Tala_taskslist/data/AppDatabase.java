package Ali.Tala_taskslist.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import Ali.Tala_taskslist.data.MyTasksTable.MyTaskQuery;
import Ali.Tala_taskslist.data.SubjectTable.MySubjectQuery;
import Ali.Tala_taskslist.data.usersTable.MyUser;
import Ali.Tala_taskslist.data.usersTable.MyUserQuery;

public class AppDatabase {
    @Database(entities = MyUser.class, MySubject.class, MyTask.class),version=1)
    public abstract class AppDataBase extends RoomDatabase{
    private static AppDatabase db;
    public abstract MyUserQuery getMyUserQuery();
    public abstract MySubjectQuery getMySubjectQuery();
    public abstract MyTaskQuery getMyTaskQuery();
    public static AppDatabase getDb(Context context){
        if(db=null)
        {
            db= Room.databaseBuilder(context,AppDataBase.class,"samihDataBase")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
    }
    return db;
    }

}

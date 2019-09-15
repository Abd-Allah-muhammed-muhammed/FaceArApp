package net.middledleeast.tamm.model.Room;


import androidx.room.Database;
import androidx.room.RoomDatabase;





@Database(entities = {RoomCartModel.class}, version = 16)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CartDao cartDao();




}
